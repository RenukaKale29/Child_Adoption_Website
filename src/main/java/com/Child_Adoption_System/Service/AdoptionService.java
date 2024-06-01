package com.Child_Adoption_System.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Child_Adoption_System.Model.Adoption;
import com.Child_Adoption_System.Model.ContactForm;
import com.Child_Adoption_System.Repository.AdoptionRepository;
import jakarta.transaction.Transactional;

@Service
public class AdoptionService {
@Autowired
private  AdoptionRepository AdopRepo;	

@Transactional
public void save(Adoption D) {
	AdopRepo.save(D);
}

 public List<Adoption> getAllAdoptions() {
        return AdopRepo.findAll();
    }

public void save(ContactForm contactForm) {
	// TODO Auto-generated method stub
	AdopRepo.save(contactForm);
	
}

public Adoption getAdoptionById(Long id) {
	// TODO Auto-generated method stub
	return AdopRepo.findById(id).orElse(null);
}

public void deleteById(Long id) {
	// TODO Auto-generated method stub
	AdopRepo.deleteById(id);

}

public List<ContactForm> getAllContacts() {
	// TODO Auto-generated method stub
	return null;
}
}