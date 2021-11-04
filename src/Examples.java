
import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

    public Examples(){}
    Shark hello = new Shark(5,5);
    /*
    // This shows what a test case looks like
    @Test 
    public void simpleCheck() {
	assertEquals(4, 4);
    }
    */
    @Test 
    public void Normalsize() {
	assertTrue(hello.isNormalSize());
    }
}
