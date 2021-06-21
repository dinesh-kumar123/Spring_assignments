package Assignment2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleInterestController {
	@RequestMapping("simple")
	public String show(Model model) {
		return "SimpleInterest";
		
		

		
	}
	@RequestMapping(value="/go", method=RequestMethod.POST)
	 public String display(@ModelAttribute() Simple simple ) { 
			   
		  System.out.println(simple);
		  return "Sim";
		  }

}
