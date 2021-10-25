package testngsample;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*TestNG testSuite = new TestNG();
		testSuite.setTestClasses(new Class[] { SampleTest.class, AnotherTest.class });
		testSuite.addListener(new TestNgListener());
		testSuite.setDefaultSuiteName("My Test Suite");
		testSuite.setDefaultTestName("My Test");
		testSuite.setOutputDirectory("./test-output");
		testSuite.run();*/
		
		
		TestNG testSuite = new TestNG();
		List<String> l= new ArrayList<String>();
		l.add("testng.xml");
		
		testSuite.setTestSuites(l);
		testSuite.addListener(new TestNgListener());
		testSuite.setOutputDirectory("./test-output");
		testSuite.run();
		
		
		//System.out.println("Hello");

	}

}
