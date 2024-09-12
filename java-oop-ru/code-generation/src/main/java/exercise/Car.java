package exercise;

import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
import lombok.SneakyThrows;

@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    @SneakyThrows
    public String serialize() {
	ObjectMapper obj = new ObjectMapper();
        return obj.writeValueAsString(this);
    }
    
    @SneakyThrows
    public static Car deserialize(String json) {
        ObjectMapper obj = new ObjectMapper();
	return obj.readValue(json, Car.class);
    }

    // END
}
