package dk.rohdef.eclipse.buster.models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class TestSuite {
	private String name;
	private int errors, tests, failures;
	private double time;
	private List<TestCase> testCases;
	
	public TestSuite() {
		this("", 0, 0, 0, 0.0);
	}
	public TestSuite(String name, int errors, int tests, int failures,
			double time) {
		super();
		this.name = name;
		this.errors = errors;
		this.tests = tests;
		this.failures = failures;
		this.time = time;
		this.testCases = new ArrayList<>();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + errors;
		result = prime * result + failures;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((testCases == null) ? 0 : testCases.hashCode());
		result = prime * result + tests;
		long temp;
		temp = Double.doubleToLongBits(time);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestSuite other = (TestSuite) obj;
		if (errors != other.errors)
			return false;
		if (failures != other.failures)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (testCases == null) {
			if (other.testCases != null)
				return false;
		} else if (!testCases.equals(other.testCases))
			return false;
		if (tests != other.tests)
			return false;
		if (Double.doubleToLongBits(time) != Double
				.doubleToLongBits(other.time))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TestSuite [name=" + name + ", errors=" + errors + ", tests="
				+ tests + ", failures=" + failures + ", time=" + time
				+ ",\n testCases=" + testCases + "\n]";
	}
	
	@XmlAttribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlAttribute
	public int getErrors() {
		return errors;
	}
	public void setErrors(int errors) {
		this.errors = errors;
	}
	
	@XmlAttribute
	public int getTests() {
		return tests;
	}
	public void setTests(int tests) {
		this.tests = tests;
	}
	
	@XmlAttribute
	public int getFailures() {
		return failures;
	}
	public void setFailures(int failures) {
		this.failures = failures;
	}
	
	@XmlAttribute
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	
	@XmlElement(name="testcase")
	public List<TestCase> getTestCases() {
		return testCases;
	}
	public void setTestCases(List<TestCase> testCases) {
		this.testCases = testCases;
	}
}