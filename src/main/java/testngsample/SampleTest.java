package testngsample;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SampleTest {
  @Test
  public void f() {
	  
	  System.out.println("This is a test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Testing starts");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Testing ends");
  }

}
