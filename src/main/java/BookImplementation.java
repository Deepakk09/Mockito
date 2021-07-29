import java.util.ArrayList;
import java.util.List;

public class BookImplementation {

    private BookService bk;

    public BookImplementation(BookService bk)
    {
        this.bk = bk;
    }

    public List<String> retrieve(String user)
    {
        List<String> Filtered  = new ArrayList<String>();
        List<String> books =bk.retrieveBooks(user);

        for (String bks:books) {
            if (bks.contains("Java"))
            {
                Filtered.add(bks);
            }
        }

        return  Filtered;
    }


    public void Deletebooks(String user)
    {
        List<String> books = bk.retrieveBooks("Deepak");

        for (String bks:books) {

            if (!bks.contains("Java"))
            {
                bk.DeleteBooks(bks);
            }
        }

    }



}
