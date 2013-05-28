package dk.rohdef.eclipse.buster.models;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="testsuites")
public class RootTestSuite {
	private List<TestSuite> suites;
	private int tests = -1, errors = -1, failures = -1;

	@XmlElement(name="testsuite")
	public List<TestSuite> getSuites() {
		return suites;
	}

	public void setSuites(List<TestSuite> suites) {
		this.suites = suites;
	}

	public int getTests() {
		if (tests == -1) {
			tests = 0;
			for (TestSuite suite : suites) {
				tests += suite.getTests();
			}
		}
		
		return tests;
	}

	public int getErrors() {
		if (errors == -1) {
			errors = 0;
			for (TestSuite suite : suites) {
				errors += suite.getErrors();
			}
		}
		
		return errors;
	}

	public int getFailues() {
		if (failures == -1) {
			failures = 0;
			for (TestSuite suite : suites) {
				failures += suite.getFailures();
			}
		}
		
		return failures;
	}
}