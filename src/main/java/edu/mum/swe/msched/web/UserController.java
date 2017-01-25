package edu.mum.swe.msched.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.swe.msched.service.UserService;

@Controller
public class UserController extends GenericController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	public String welcome(Model model) {
		return getView(model, "welcome");
		//return "welcome";
	}

}
