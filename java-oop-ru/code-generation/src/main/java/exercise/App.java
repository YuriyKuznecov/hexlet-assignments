package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
import lombok.SneakyThrows;

class App {
    
    @SneakyThrows
    public static void save(Path path, Car car) {
	var json = car.serialize();
	Files.writeString(path, json, StandardOpenOption.WRITE);
    }
    
    @SneakyThrows
    public static Car extract(Path path) {
	var json = Files.readString(path);
	return Car.deserialize(json);
    }
}

// END
