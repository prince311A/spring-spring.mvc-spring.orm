package in.sp.main;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FileUploadController {
	@RequestMapping("/file-form")
	public String fileForm() {
		return "fileform";
	}
	// Not Working because CommonsMultipartResolver class not found
	// Problem Solved Instead of  CommonsMultipartResolver class use StandardServletMultipartResolver
	
//	@PostMapping("/upload-image")
//	public String fileUpload(@RequestParam("profile"){// CommonsMultipartFile file) {
//		System.out.println("File Uplaod Handler");
//		return "filesuccess";
//	} // Not Working
}
