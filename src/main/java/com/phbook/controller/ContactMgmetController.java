package com.phbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.phbook.entity.Contact;
import com.phbook.repository.ContactMgmtRepo;

@Controller
public class ContactMgmetController{
   @Autowired  
	ContactMgmtRepo repo;
	
	@GetMapping(value= {"/","/home"})
	public String goTohome() {
		return "home";
		}
	
	
	@GetMapping(value= {"/add-contact"})
	public String goToAddContact() {
		return "create-contact";
	}
	
	@GetMapping(value= {"/save-contact"})
	public  ModelAndView saveContact(Contact contact) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("create-contact");
		boolean result = repo.saveContact(contact);
		int code = result?200:500;
		mv.addObject("c", code);
		return mv;
	}
}
