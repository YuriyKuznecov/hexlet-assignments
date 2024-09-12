package exercise;

import java.lang.reflect.Field;
// BEGIN
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;

class Validator {

    public static List<String> validate(Object obj) {
	var results = new ArrayList<String>();
	var fields = obj.getClass().getDeclaredFields();
	for (Field field : fields) {
	    if (field.isAnnotationPresent(NotNull.class)) {
		try {
	            field.setAccessible(true);		    
		    if (Objects.equals(field.get(obj), null)) {
	                results.add(field.getName());
		    }
	        } catch (IllegalAccessException e) {
	                e.printStackTrace();
		}
	    }
	}
	return results;
    }

    public static Map<String, List<String>> advancedValidate(Object obj) {
        var map = new HashMap<String, List<String>>();
        var notNullLists = validate(obj);
        var fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
	    var listErrors = new ArrayList<String>();
	    var anno = field.getAnnotation(MinLength.class);
            field.setAccessible(true);
            var name = field.getName();

	    if (notNullLists.contains(name)) {
                listErrors.add("can not be null");
            }

            if (field.isAnnotationPresent(MinLength.class) && name.length() >= anno.minLength()) {
                listErrors.add("length less than " + anno.minLength());
            }

            if (!listErrors.isEmpty()) {
                map.put(name, listErrors);
            }

	}
	return map;
    }

}

// END
