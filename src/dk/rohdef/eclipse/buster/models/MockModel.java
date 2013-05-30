package dk.rohdef.eclipse.buster.models;

import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class MockModel {
	private Unmarshaller getUnmarshaller() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(RootTestSuite.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return jaxbUnmarshaller;
	}
	
	public RootTestSuite getSuite(File file) {
		RootTestSuite suite = null;
		
		try {
			Unmarshaller jaxbUnmarshaller = getUnmarshaller();
			suite = (RootTestSuite) jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return suite;
	}
	public RootTestSuite getSuite(String xml) {
		RootTestSuite suite = null;
		
		try {
			Unmarshaller jaxbUnmarshaller = getUnmarshaller();
			suite = (RootTestSuite) jaxbUnmarshaller.unmarshal(new StringReader(xml));
		} catch (JAXBException e) {
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
