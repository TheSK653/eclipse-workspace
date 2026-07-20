package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping("/student")
	public String student() {
		System.out.println("Student Controller is called");
		return "student";
	}
	
	@RequestMapping("/emp")
	public String emp() {
		System.out.println("Employee method is called");
		return "emp";
	}
	
	@RequestMapping("/user")
	public String userInfo(Model m) {
		m.addAttribute("email", "jay@gmail.com");
		m.addAttribute("name", "jay");
		return "user";
	}
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView m = new ModelAndView();
		m.addObject("subject", "DSA"); 
		m.addObject("course", "B.Tech");
		m.setViewName("hello");
		return m;
	}
	
	@RequestMapping("/form")
	public String form(@RequestParam("name") String name, @RequestParam("email") String email, 
			@RequestParam("course") String course, Model m) {
		
		System.out.println(name+" "+email+" "+course);
		m.addAttribute("name", name);
		m.addAttribute("email", email);
		m.addAttribute("course", course);
		return null;
	}
}