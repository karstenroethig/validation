package karstenroethig.commons.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidationResult {
	
	private List<ValidationMessage> errors = new ArrayList<ValidationMessage>();
	
	private List<ValidationMessage> warnings = new ArrayList<ValidationMessage>();
	
	private List<ValidationMessage> infos = new ArrayList<ValidationMessage>();

	public boolean isOk() {
		return errors.isEmpty();
	}
	
	public boolean hasErrors() {
		return !errors.isEmpty();
	}
	
	public List<ValidationMessage> getErrors() {
		return errors;
	}
	
	public void addError( String message ) {
		errors.add( new ValidationMessage( ValidationState.ERROR, message ) );
	}
	
	public void addError( String message, String ... propertyIds ) {
		addMessage( errors, ValidationState.ERROR, message, propertyIds );
	}
	
	public boolean hasWarnings() {
		return !warnings.isEmpty();
	}
	
	public List<ValidationMessage> getWarnings() {
		return warnings;
	}
	
	public void addWarning( String message ) {
		warnings.add( new ValidationMessage( ValidationState.WARNING, message ) );
	}
	
	public void addWarning( String message, String ... propertyIds ) {
		addMessage( warnings, ValidationState.WARNING, message, propertyIds );
	}
	
	public boolean hasInfos() {
		return !infos.isEmpty();
	}
	
	public List<ValidationMessage> getInfos() {
		return infos;
	}
	
	public void addInfo( String message ) {
		infos.add( new ValidationMessage( ValidationState.INFO, message ) );
	}
	
	public void addInfo( String message, String ... propertyIds ) {
		addMessage( infos, ValidationState.INFO, message, propertyIds );
	}
	
	private void addMessage( List<ValidationMessage> list, ValidationState state, String message, String ... propertyIds ) {
		
		Set<String> propertyIdSet = null;
		
		if( propertyIds != null ) {
			
			propertyIdSet = new HashSet<String>();
			
			for( String propertyId : propertyIds ) {
				propertyIdSet.add( propertyId );
			}
		}
		
		list.add( new PropertyValidationMessage( state, message, propertyIdSet ) );
	}
}
