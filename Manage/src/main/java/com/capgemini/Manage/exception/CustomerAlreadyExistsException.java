package com.capgemini.Manage.exception;

@SuppressWarnings("serial")
public class CustomerAlreadyExistsException extends Exception {
	
	private String message;

	
	public CustomerAlreadyExistsException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage()
		{
			System.out.println(message);
			return message;
		}

}
