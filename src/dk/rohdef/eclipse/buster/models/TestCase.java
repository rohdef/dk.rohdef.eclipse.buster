package dk.rohdef.eclipse.buster.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class TestCase {
	private String name, className;
	private double time;
	private Failure failure;

	public TestCase() {
		this("", "", 0.0, null);
	}
	public TestCase(String name, String className, double time) {
		this(name, className, time, null);
	}
	public TestCase(String name, String className, double time, Failure failure) {
		super();
		this.name = name;
		this.className = className;
		this.time = time;
		this.failure = failure;
	}
	
	@XmlAttribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlAttribute(name="classname")
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@XmlAttribute
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	@XmlElement
	public Failure getFailure() {
		return failure;
	}
	public void setFailure(Failure failure) {
		this.failure = failure;
	}
}
