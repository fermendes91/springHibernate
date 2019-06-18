package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// Esta annotation ficara responsavel por PRE-PROCESSAR todas as web requests vindas para a controller.
	// para este cenario a ideia � evitar os espa�os em brancos do customer.lastName ao processar o formulario.
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		// esta classe StringTrimmer � responsavel por tirar os espa�os em branco iniciais e finais.
		StringTrimmerEditor stringTimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		
		System.out.println("Last name: |" + theCustomer.getLastName() + "|" );
		
		System.out.println("Binding Result " + theBindingResult);
		
		System.out.println("\n\n\n\n\n");
		
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		return "customer-confirmation";
	}

}
