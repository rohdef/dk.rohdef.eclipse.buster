package dk.rohdef.eclipse.buster.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Failure {
	private String type, message, text;

	public Failure() {
		this(null, null, null);
	}
	public Failure(String type, String message, String text) {
		super();
		this.type = type;
		this.message = message;
		this.text = text;
	}

	@XmlAttribute
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@XmlAttribute
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@XmlValue
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
