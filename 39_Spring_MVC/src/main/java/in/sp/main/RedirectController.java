package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	@RequestMapping("/one")
	public String one() {
		System.out.println("This is one handler");
		return "redirect:/three";
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is two handler");
		return "view";
	}
	// Method 2 --> to redirect 
	@RequestMapping("/three")
	public RedirectView three() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
}
