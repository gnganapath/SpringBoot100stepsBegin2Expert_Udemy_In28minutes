package com.webfullstackdev.udemyin28minutes.sbin100steps.advance.first_springboot_in28min;

import org.springframework.stereotype.Component;

@Component
public class WelcomeExtService {

	public String ExternalService() {
		return "Mesg from External Service - @component";
	}
}
