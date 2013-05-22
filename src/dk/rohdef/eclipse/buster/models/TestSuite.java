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