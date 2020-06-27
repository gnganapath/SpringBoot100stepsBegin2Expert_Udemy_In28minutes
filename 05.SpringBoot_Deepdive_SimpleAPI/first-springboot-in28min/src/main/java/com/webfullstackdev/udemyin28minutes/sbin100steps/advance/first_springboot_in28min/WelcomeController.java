package com.webfullstackdev.udemyin28minutes.sbin100steps.advance.first_springboot_in28min;

import com.webfullstackdev.udemyin28minutes.sbin100steps.advance.first_springboot_in28min.configuration.BasicConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/welcome")
public class WelcomeController {
	

	
	@GetMapping("")      // API end point - host:port/welcome
	public String Wel() {
		return "Welcome Controller Message- '/welcome' - empty ";
	}
	
	@GetMapping("/")      // API end point - host:port/welcome/
	public String Welcome() {
		return "Welcome Controller Message- '/welcome' - with '/'";
	}
	
	@GetMapping("/guest")
	public String WelcomeMessage() {
		return "Welcome Controller Message- '/welcome' - with '/guest'";
	}
	
	@RequestMapping("/error")    // API points to /welcome only even we make @RequestMap to /welcome / error
	public String ErroreMessage() {
		return "Welcome Controller and RequestMapping inside Welcome class/controller- '/welcome' - with '/error'";
	}

	//E.g Dependency - injection from welcome controller and welcome service without Bean/@Autowired
	
	private WelcomeService welcomeService = new WelcomeService();
	
	@GetMapping("/welcomeservice")
	public String ServiceMessage(){
		return welcomeService.businessWelcomeSerive();
	}
	
	//E.g Dependency - injection WITH  Bean/@Autowired IN controller and @Component or @Service in Service class
	
	@Autowired
	private WelService welService;
	
	@RequestMapping("/welservice")
	public String WelServiceMessage(){
		return welService.BeanDIAutowired();
	}
	//------------------------------------------------------------------------------------------------------------------
	@Autowired
	WelcomeExtService externalService;
	
	@GetMapping("ext-service")
	public String ExternalService() {
		return externalService.ExternalService();
	}

	@GetMapping("/property-value")
	public String PropertyMesssage() { return externalService.ProperRef();  } //
	// application.property and application.yml aboth have welcome.message. But the priority is property if incase both will have in project

	@GetMapping("/yaml-value")
	public String YamlMessage() { return externalService.YamlRef(); }

	//------------------------------------------------------------------------------------------------------------------
	 @Autowired
	BasicConfiguration configuration;

	@RequestMapping("/dynamic-configuration")
	public Map dynamicConfiguration(){
		Map map = new HashMap();
		map.put("message",configuration.getMessage());
		map.put("number",configuration.getNumber());
		map.put("value",configuration.isValue());
		return map;
	}

}

//------------------------------------------------------------------------------------------------------------------

class WelcomeService{                //compiles method to make instance at controller class
	public String businessWelcomeSerive() {		
		return "The msg from Welcomse Service and called as D-I";
	}
}

@Component   // @Service
class WelService{
	public String BeanDIAutowired() {
		return "DI based @Component/@Service and @Autowired";
	}
}

