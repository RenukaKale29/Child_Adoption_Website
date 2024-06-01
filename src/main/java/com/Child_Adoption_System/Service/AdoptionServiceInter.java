package com.Child_Adoption_System.Service;

import java.util.List;

import com.Child_Adoption_System.Model.Adoption;

public interface AdoptionServiceInter {
	void save(Adoption adoption) ;
	    List<Adoption> getAllAdoptions() ;
		}

	