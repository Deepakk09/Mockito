import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestTest {

    @Test
    public void TestHamcrest()
    {
        List<Integer> l1= Arrays.asList(99,100,101,105);
        assertThat(l1, hasSize(4));
        assertThat(l1, hasItems(100,101));
        assertThat(l1, everyItem(greaterThan(90)));
        assertThat(l1 ,everyItem(lessThan(200)));
    }


}
