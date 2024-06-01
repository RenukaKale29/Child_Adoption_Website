package com.Child_Adoption_System.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Child_Adoption_System.Model.Adoption;
import com.Child_Adoption_System.Model.ContactForm;
import com.Child_Adoption_System.Service.AdoptionService;


@Controller
public class AdoptionController {
	@Autowired
	private  AdoptionService AdoptionServ;
	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	@GetMapping("/adoption")
	public String Adoption() {
		return "adoption";
	}
	
	@GetMapping("/AboutUs")
	public String aboutus() {
		return "AboutUs";
	}
	
	@GetMapping("/Contact")
	public String contact() {
		return "Contact";
	}
	
	@GetMapping("/SignUp")
	public String signup() {
		return "SignUp";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/Organizations")
	public String organiz() {
		return "Organizations";
	}
	@GetMapping("/Event")
	public String even() {
		return "Event";
	}
	
//	@GetMapping("/edit")
//	public String edit() {
//		return "edit";
//	}
	
	@GetMapping("/thankYou")
  public String showThankYouPage() {
      return "thankYou";
	}
	
	@PostMapping("/save")
  public String saveAdoption(@ModelAttribute Adoption adoption) {
		AdoptionServ.save(adoption);
      return "redirect:/view"; // Redirect to a success page or any other appropriate page
  }
	
	
	 @GetMapping("/view")
	    public String viewAdoptions(Model model) {
	        List<Adoption> adoptions = AdoptionServ.getAllAdoptions();
	        model.addAttribute("adoptions", adoptions);
	        return "view";
	    }
	
	 @PostMapping("/submitContactForm")
	    public String submitContactForm(@ModelAttribute ContactForm contactForm , Model model) {
	        ContactForm contactFormData = new ContactForm();
	        contactFormData.setName(contactForm.getName());
	        contactFormData.setEmail(contactForm.getEmail());
	        contactFormData.setMessage(contactForm.getMessage());

	        AdoptionServ.save(contactForm);

	        // You can also retrieve the saved data if needed
	        // List<ContactFormData> allContactFormData = contactFormDataRepository.findAll();
	        // model.addAttribute("contactFormDataList", allContactFormData);

	        return "redirect:/thankYou"; // Redirect to a thank you page
	    }
	 
	 
	 @GetMapping("/adoption/edit/{id}")
	    public String editAdoption(@PathVariable Long id, Model model) {
		 Adoption adoption = AdoptionServ.getAdoptionById(id);
	        model.addAttribute("adoption", adoption);
	        return "edit"; // Create an edit.html Thymeleaf template
	    }

	    @PostMapping("/adoption/update/{id}")
	    public String updateAdoption(@PathVariable Long id, @ModelAttribute Adoption updatedAdoption) {
	    	Adoption existingAdoption = AdoptionServ.getAdoptionById(id);
	        existingAdoption.setAdopName(updatedAdoption.getAdopName());
	        existingAdoption.setAdopage(updatedAdoption.getAdopage());
	        existingAdoption.setGender(updatedAdoption.getGender());
	        existingAdoption.setPhoneNo(updatedAdoption.getPhoneNo());
	        existingAdoption.setDescription(updatedAdoption.getDescription());
	        existingAdoption.setAddress(updatedAdoption.getAddress());

	        AdoptionServ.save(existingAdoption);

	        return "redirect:/view";
	    }

	    @GetMapping("/adoption/delete/{id}")
	    public String deleteAdoption(@PathVariable Long id) {
	    	AdoptionServ.deleteById(id);
	        return "redirect:/view";
	    }}