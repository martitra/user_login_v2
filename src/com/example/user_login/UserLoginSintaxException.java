package com.example.user_login;

public class UserLoginSintaxException extends Exception{

	/**
	 * 
	 * @param detailMessage
	 * esto es para poner los errores se podrían poner personalizados
	 */
	public UserLoginSintaxException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param detailMessage
	 */
	public UserLoginSintaxException(String detailMessage) {
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
