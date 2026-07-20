package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import

@Controller 
public class StudentController {
	
	@RequestMapping("/student")
	public String student()
	{
		System.out.println("Student Controller Called");
		return "student";
	}
	
	

}
