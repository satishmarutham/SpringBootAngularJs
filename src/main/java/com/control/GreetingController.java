package com.control;

import java.util.HashMap;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class GreetingController {
	@RequestMapping("/view")
	public String display(){
		return "landing";
	}
	
@RequestMapping("/view/#view")
		public String displaySuccess(){
			return "landing";
		}	
@RequestMapping("/employees")
	 public HashMap<Long,Employee> getAllEmployees(){
	      return SpringMvcApplication.employee;
	   }
	
	
@RequestMapping("/angularHttp")
public String viewAngular(@RequestParam(value="email",defaultValue="Test")String email){
	System.out.println("Email::::::"+email);
	return "landing";
}
}
