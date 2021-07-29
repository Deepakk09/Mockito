import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BookMockitoImplementationTest {

    @Mock
    BookService bs;

    @InjectMocks
    BookImplementation injectedMock;

    @Test
    public void RetrieveTest()
    {
        List<String> bks = Arrays.asList("PHP", "Java for Dummies", "Java for Experts", "HTMl");
        Mockito.when(bs.retrieveBooks("Deepak")).thenReturn(bks);
        List<String> bks2 = injectedMock.retrieve("Deepak");
        Assert.assertEquals(2,bks2.size());
    }

    @Test
    public void RetrieveBookEmpty()
    {
        List<String> bks = Arrays.asList();
        Mockito.when(bs.retrieveBooks("Deepak")).thenReturn(bks);
        List<String> bks2 = injectedMock.retrieve("Deepak");
        Assert.assertEquals(0,bks2.size());

    }

    @Test
    public  void DeleteBook()
    {
        List<String> bks = Arrays.asList("PHP", "Java for Dummies", "Java for Experts", "HTMl");
        Mockito.when(bs.retrieveBooks("Deepak")).thenReturn(bks);

        injectedMock.Deletebooks("Caesar");

        Mockito.verify(bs).DeleteBooks("PHP");

        Mockito.verify(bs,Mockito.times(1)).DeleteBooks("PHP");

        Mockito.verify(bs,Mockito.never()).DeleteBooks("Java for Dummies");

    }



}
