import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class BookStub implements BookService {


    @Override
    public List<String> retrieveBooks(String user) {

        return Arrays.asList("PHP", "Java for Dummies", "Java for Experts", "HTMl");
    }

    @Override
    public void DeleteBooks(String Book) {

    }
}
