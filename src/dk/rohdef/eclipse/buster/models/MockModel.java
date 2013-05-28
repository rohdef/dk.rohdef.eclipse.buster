package dk.rohdef.eclipse.buster.models;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class MockModel {
	public RootTestSuite getSuite(String xml) {
		RootTestSuite suite = null;
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(RootTestSuite.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
			suite = (RootTestSuite) jaxbUnmarshaller.unmarshal(new StringReader(xml));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return suite;
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
