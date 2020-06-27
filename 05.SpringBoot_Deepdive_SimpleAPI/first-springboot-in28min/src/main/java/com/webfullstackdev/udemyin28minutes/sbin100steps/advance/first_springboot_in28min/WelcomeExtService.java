package com.webfullstackdev.udemyin28minutes.sbin100steps.advance.first_springboot_in28min;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WelcomeExtService {

	@Value("${welcome.message}")
	private String appPropMessage;

	@Value ("${yaml.yamlmessage}")
	private String appYmlMessage;

	public String ExternalService() {
		return "Mesg from External Service - @component";
	}

	public String ProperRef() { return appPropMessage; }

	public String YamlRef() { return appYmlMessage; }


}
