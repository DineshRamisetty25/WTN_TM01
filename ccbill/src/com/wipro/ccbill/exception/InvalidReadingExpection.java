package com.wipro.ccbill.exception;

@SuppressWarnings("serial")
public class InvalidReadingException extends Exception {
	public String toString() {
		return "Incorrect Reading";
	}
	public InvalidReadingException() {
		super();
	}
}