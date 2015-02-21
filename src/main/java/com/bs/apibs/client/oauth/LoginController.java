package com.bs.apibs.client.oauth;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bs.apibs.client.utils.PropertiesUtil;

@Controller
public class LoginController {
	
	@Autowired
	@Qualifier("aplicacionClienteProperties")
	private PropertiesUtil entorno;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:welcome";
	}

	@RequestMapping("/welcome")
	public String printWelcome(ModelMap model, Principal principal) {
		String name = principal.getName();
		model.addAttribute("username", name);
		model.addAttribute("message", "Spring Security 	Custom Form example");
		model.addAttribute("hostDestino",entorno.getProperty(PropertiesUtil.RUTA_SERVIDOR));
		return "hello";

	}

	@RequestMapping("login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		model.addAttribute("error", "true");
		return "login";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		return "login";

	}
}
