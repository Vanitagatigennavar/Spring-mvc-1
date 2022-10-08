package com.xworkz.suicide.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.suicide.SuicideDTO;

@Component
@RequestMapping("/")
public class SuicideController {

	public SuicideController() {
		
		System.out.println(" created"+this.getClass().getSimpleName());
	}
	@RequestMapping("Create.do")
	public String onCreated(SuicideDTO dto) {
		System.out.println("Running the suicide controller");
		System.out.println("fetching data from "+ dto);
		return "committedsuicide.jsp";
		
	}
	

}
