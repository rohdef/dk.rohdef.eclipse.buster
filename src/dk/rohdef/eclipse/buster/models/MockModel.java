package dk.rohdef.eclipse.buster.models;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

public class MockModel {
	public List<TestSuite> getSuites(String xml) {
		List<TestSuite> suites = new ArrayList<>();
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(RootTestSuite.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
			RootTestSuite suite = (RootTestSuite) jaxbUnmarshaller.unmarshal(new StringReader(xml));
			suites = suite.getSuites();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return suites;
	}
	
	@XmlRootElement(name="testsuites")
	static class RootTestSuite {
		List<TestSuite> suites;

		@XmlElement(name="testsuite")
		public List<TestSuite> getSuites() {
			return suites;
		}

		public void setSuites(List<TestSuite> suites) {
			this.suites = suites;
		}
	}
	
	public List<TestSuite> getCategories() {
		ArrayList<TestSuite> suites = new ArrayList<>();
		TestSuite s;
		
		s = new TestSuite("Foobar 1", 2, 1, 2, 0.53);
		s.getTestCases().add(new TestCase("T1", "", 0.25));
		s.getTestCases().add(new TestCase("T2", "", 0.28));
		suites.add(s);
		
		s = new TestSuite("Foobar 2", 2, 1, 2, 0.53);
		s.getTestCases().add(new TestCase("T1", "", 0.25));
		s.getTestCases().add(new TestCase("T2", "", 0.28));
		suites.add(s);
		
		s = new TestSuite("Foobar 3", 2, 1, 2, 0.53);
		s.getTestCases().add(new TestCase("T1", "", 0.25));
		s.getTestCases().add(new TestCase("T2", "", 0.28));
		suites.add(s);
		
		return suites;
	}
}
