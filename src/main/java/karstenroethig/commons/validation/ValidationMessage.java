package karstenroethig.commons.validation;

public class ValidationMessage {
	
	private String text;
	
	private ValidationState state;

	public ValidationMessage( ValidationState state, String text ) {
		this.state = state;
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public ValidationState getState() {
		return state;
	}
}
