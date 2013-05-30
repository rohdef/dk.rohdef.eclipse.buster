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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Failure other = (Failure) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else {
			String ntext = text.replace(" ", "");
			ntext = ntext.replace("\n", "");
			ntext = ntext.replace("\t", "");
			ntext = ntext.replace("\r", "");
			
			String otext =  other.text.replace(" ", "");
			otext =  otext.replace("\n", "");
			otext =  otext.replace("\t", "");
			otext =  otext.replace("\r", "");
			
			
			if (!ntext.equals(otext)) {
				System.out.println("---");
				System.out.println(ntext);
				System.out.println("---");
				System.out.println(otext);
				System.out.println("---");
				System.out.println("Fails due to compare");
				return false;
			}
		}
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\n\t\tFailure [type=" + type + ", message=" + message + ", text="
				+ text + "]";
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
