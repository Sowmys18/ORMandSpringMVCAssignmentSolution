package com.example.CuCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.CuCRUD.dao.CustomerDAO;
import com.example.CuCRUD.model.CustomerD;

@Controller
public class Customercontroller {
	@Autowired
	CustomerDAO customerDAO;

	@RequestMapping("index")
     public String customerD() {
		return "index.jsp";
	}
	
	
	@RequestMapping("addCustomerD")
     public String addCustomerD(CustomerD customerD) {
		customerDAO.save(customerD);
		return "index.jsp";
	}
	@RequestMapping("getCustomerD")
   public ModelAndView getCustomerD(@RequestParam("id") int id) 
	{
		ModelAndView mav = new ModelAndView("showCustomerD.jsp");
		CustomerD customerD =  customerDAO.findById(id).orElse(new CustomerD());
		mav.addObject(customerD);
		return mav;
		
	}
	
	
	
	
	
	
}
