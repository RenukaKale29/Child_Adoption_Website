package com.Child_Adoption_System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Child_Adoption_System.Model.Adoption;
import com.Child_Adoption_System.Model.ContactForm;

@Repository
public interface AdoptionRepository extends JpaRepository<Adoption, Long>{

void save(ContactForm contactForm);

}