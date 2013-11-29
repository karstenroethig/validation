package karstenroethig.commons.validation;

import java.util.Set;

public class PropertyValidationMessage extends ValidationMessage {
	
	public Set<String> propertyIds;

	public PropertyValidationMessage( ValidationState state, String text, Set<String> propertyIds ) {
		super( state, text );

		this.propertyIds = propertyIds;
	}

	public boolean hasPropertyIds() {
		return propertyIds != null && !propertyIds.isEmpty();
	}
	
	public Set<String> getPropertyIds() {
		return propertyIds;
	}
}
