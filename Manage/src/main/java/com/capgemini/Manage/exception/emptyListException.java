package com.capgemini.Manage.exception;

@SuppressWarnings("serial")
public class emptyListException extends Exception {
	
	private String message;

	public emptyListException(String message) {
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
