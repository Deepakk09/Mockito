import kotlin.DslMarker;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListTest {

    @Mock
    List listbooks;

    @Test
    public void  listsize()
    {
        Mockito.when(listbooks.size()).thenReturn(2);
        Assert.assertEquals(2 ,listbooks.size());
    }

 }
