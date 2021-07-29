import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookImplementationTest {



    @Test
    void retrieve() {

        BookStub obj = new BookStub();
        BookImplementation imp = new BookImplementation(obj);

        List<String> l1 = imp.retrieve("Deepak");
        assertEquals(2,l1.size());

    }
}