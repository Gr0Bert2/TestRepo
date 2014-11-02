import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Created by robert on 02.11.14.
 */
public class VeryMeaningfulClassTest {

    protected VeryMeaningfulClass veryMeaningfulClass;

    @BeforeTest
    public void init() {
        veryMeaningfulClass = new VeryMeaningfulClass(5, 5);
    }

    @Test
    public void getSumTest() {
        //some changes
        //asd
        Assert.assertEquals(veryMeaningfulClass.getSum(), 10);
    }
}
