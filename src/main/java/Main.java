import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello Java Maven!");

        // serialize to JavaScriptObjectNotation
        Student student = new Student(23, "Bob", "bob.james@gmail.com");
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(student);
        System.out.println(json);
    }
}
