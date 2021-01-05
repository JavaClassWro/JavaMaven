import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import it.academy.dao.DiskIO;
import it.academy.dao.Serialiser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Java Maven!");

        // serialize to JavaScriptObjectNotation
        Student student = new Student(23, "Bob", "bob.james@gmail.com");
        ObjectWriter ow = new ObjectMapper().writer();
        String json = ow.writeValueAsString(student);
        System.out.println(json);

        String filename = "C:\\Users\\Mike\\Documents\\Repos\\JavaMaven\\students.txt";

        DiskIO.writeToFile(filename, List.of(json), true);

        Student other = new Student(33, "Alice", "alice@gmail.com");
        String other_json = ow.writeValueAsString(other);
        DiskIO.writeToFile(filename, List.of(other_json), true);

        DiskIO.readFromFile(filename).forEach(System.out::println);

        // usage of Serialiser + DiskIO
        Serialiser serialiser = new Serialiser();

        serialiser.deserialise(json, Student.class);
        serialiser.deserialise(DiskIO.readFromFile(filename), Student.class).stream()
                .map(Student::getName)
                .forEach(System.out::println);

        DiskIO.writeToFile(
                filename,
                serialiser.serialise(List.of(student, other)),
                true
        );
    }
}
