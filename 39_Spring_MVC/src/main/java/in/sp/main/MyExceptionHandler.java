package in.sp.main;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(NullPointerException.class)
	public String exceptionHandler() {
		return "home";
	}
	// If we want to handler all the Exception that can occur in our project than 
	@ExceptionHandler(Exception.class) // because exception is parent class of all the exception
	// To send want exception occur we can send the code by
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)// 505
	public String exceptionHandler1() {
		return "home";
	}
}
