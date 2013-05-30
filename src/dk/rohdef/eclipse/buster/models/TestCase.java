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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((className == null) ? 0 : className.hashCode());
		result = prime * result + ((failure == null) ? 0 : failure.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		TestCase other = (TestCase) obj;
		if (className == null) {
			if (other.className != null)
				return false;
		} else if (!className.equals(other.className))
			return false;
		if (failure == null) {
			if (other.failure != null)
				return false;
		} else if (!failure.equals(other.failure))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(time) != Double
				.doubleToLongBits(other.time))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\tTestCase [failure=" + failure + "]";
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
