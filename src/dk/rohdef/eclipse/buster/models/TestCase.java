package dk.rohdef.eclipse.buster.models;

public class TestCase {
	private String name, className;
	private double time;

	public TestCase() {
		this("", "", 0.0);
	}
	public TestCase(String name, String className, double time) {
		super();
		this.name = name;
		this.className = className;
		this.time = time;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
}
