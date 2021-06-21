package Assignment1;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/mess")
	public String Show() {
		return "index";
	}
	@RequestMapping("/hello")
	public String display(HttpServletRequest request,Model model) {
		String theName=request.getParameter("menu");
		
		return "message";
		
	}
 


}
