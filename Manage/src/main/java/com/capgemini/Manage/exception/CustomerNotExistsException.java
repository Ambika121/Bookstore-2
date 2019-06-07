package com.capgemini.Manage.exception;

@SuppressWarnings("serial")
public class CustomerNotExistsException extends Exception {
	
	private String message;

	public CustomerNotExistsException(String message) {
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
