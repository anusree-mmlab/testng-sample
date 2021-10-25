package testngsample;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnotherTest {
  @Test
  public void f() {
	  System.out.println("Another test executing");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Another test start");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Another test end");
  }

}
