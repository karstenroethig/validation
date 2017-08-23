package karstenroethig.commons.validation;

public interface IValidator<T>
{
	public ValidationResult validate( T t );
}
