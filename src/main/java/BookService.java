import java.util.List;

public interface BookService {

    public List<String> retrieveBooks(String user);

    public void DeleteBooks(String Book);
}
