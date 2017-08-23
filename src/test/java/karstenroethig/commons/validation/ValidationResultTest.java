package karstenroethig.commons.validation;

import junit.framework.TestCase;

public class ValidationResultTest extends TestCase
{
	public void testIsOk()
	{
		ValidationResult result = new ValidationResult();

		assertTrue( result.isOk() );

		result.addInfo( "Test" );
		assertTrue( result.isOk() );

		result.addInfo( "Test", "test" );
		assertTrue( result.isOk() );

		result.addWarning( "Test" );
		assertTrue( result.isOk() );

		result.addWarning( "Test", "test" );
		assertTrue( result.isOk() );

		result.addError( "Test" );
		assertFalse( result.isOk() );

		result = new ValidationResult();
		result.addError( "Test", "test" );
		assertFalse( result.isOk() );
	}

	public void testHasErrors()
	{
		ValidationResult result = new ValidationResult();

		assertFalse( result.hasErrors() );

		result.addInfo( "Test" );
		assertFalse( result.hasErrors() );

		result.addInfo( "Test", "test" );
		assertFalse( result.hasErrors() );

		result.addWarning( "Test" );
		assertFalse( result.hasErrors() );

		result.addWarning( "Test", "test" );
		assertFalse( result.hasErrors() );

		result.addError( "Test" );
		assertTrue( result.hasErrors() );

		result = new ValidationResult();
		result.addError( "Test", "test" );
		assertTrue( result.hasErrors() );
	}

	public void testGetErrors()
	{
		// TODO IMPLEMENT ME!
	}

	public void testAddError()
	{
		// TODO IMPLEMENT ME!
	}

	public void testHasWarnings()
	{
		// TODO IMPLEMENT ME!
	}

	public void testGetWarnings()
	{
		// TODO IMPLEMENT ME!
	}

	public void testAddWarning()
	{
		// TODO IMPLEMENT ME!
	}

	public void testHasInfos()
	{
		// TODO IMPLEMENT ME!
	}

	public void testGetInfos()
	{
		// TODO IMPLEMENT ME!
	}

	public void testAddInfo()
	{
		// TODO IMPLEMENT ME!
	}
}
