package com.example.user_login;

public class UserLoginException extends Exception {

	/**
	 * 
	 * @param detailMessage
	 *            esto es para poner los errores se podr�an poner personalizados
	 */
	public UserLoginException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param detailMessage
	 */
	public UserLoginException(String detailMessage) {
		super(detailMessage);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Error UserLogin Exception";
	}
}
