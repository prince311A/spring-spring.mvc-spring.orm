package in.sp.main;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.oracle.wls.shaded.org.apache.bcel.generic.I2F;

import in.sp.entitiy.User;
import in.sp.service.UserService;

@Controller
public class MyController {
	@Autowired
	private UserService userService;

	@RequestMapping("/helloPage")
	public ModelAndView openHelloPage() {
		System.out.println("Hello Page Opened");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		return modelAndView;

	}

	// Send data from controller to view that is sending to about.jsp using Model
	// Interface
	@RequestMapping("/about-us")
	public String openAbout(Model model) {
		model.addAttribute("name", "Prince Tiwari");
		model.addAttribute("city", "Delhi");
		return "about";
	}

	// Send data from controller to view that is sending to about.jsp using
	// ModelAndView Class
	@RequestMapping("/help-us")
	public ModelAndView openHelp() {
		System.out.println("This is Help Controller");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Aman Tiwari");
		modelAndView.addObject("city", "Rewa");
		LocalDateTime localDateTime = LocalDateTime.now();
		modelAndView.addObject("time", localDateTime);
		modelAndView.setViewName("help");
		return modelAndView;
	}

	// Send data from view to controller that is sending from form.html
	@RequestMapping("/form-us")
	public String myform() {
		return "form";
	}

	// Using @RequestParam()
//	@PostMapping("/submit-form")
//	public String submit(@RequestParam("name")String name,@RequestParam("city")String city) {
//		System.out.println(name);
//		System.out.println(city);
//		return "";
//	} 
//	using @ModelAttribute()
	@PostMapping("/submit-form")
	public String submit(@ModelAttribute User user, BindingResult bindingResult) {
		// here it automatically fetch the data from view and set to its entity i.e User
		// Use of redirect
		if (user.getName().isBlank()) {
			return "redirect:/from-us";
		}
		// BindingResult used when there is any error occurred in Binding the form
		// values into User class
		// by @ModelAttribute
		// Then we can check the by BindingResult class which provide methods
		// bindingResult.hasErrors()
		// if it is true then we can send back to register page
		// Now for showing the error to user which error is occurred we use spring tag
		// library
		// <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

		if (bindingResult.hasErrors()) {
			return "from-us";
		}
		this.userService.createUser(user);
		System.out.println(user);

		return "profile";
	}
	// @PathVarible annotation is used to bind method parameter to uri template variable similar like 
	// data sending through url in servlet
	@RequestMapping("/url/{UserId}/{userName}")
	public String getUserDetails(@PathVariable("UserId")int id,@PathVariable("userName")String name) {
		System.out.println(id);
		System.out.println(name);
		// Now we can send this to hello.jsp using model.addAttribute
		return "hello";

	}
	// @ExceptionHandler is a annotation when there occur any exception in methods of controller 
	// it can handle it and redirect to any given page
	// we can pass any class of exception that can handle by @ExceptionHandler
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
	
	// We can use centralized exception handler for all the controllers by making a class of it
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
