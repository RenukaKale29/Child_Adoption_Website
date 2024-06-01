package com.Child_Adoption_System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adoption {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long adoptionId;
    private String adopName;
    private String adopage;
    private String gender;
    private String phoneNo;
    private String description;
    private String address;
	public Long getAdoptionId() {
		return adoptionId;
	}
	public void setAdoptionId(Long adoptionId) {
		this.adoptionId = adoptionId;
	}
	public String getAdopName() {
		return adopName;
	}
	public void setAdopName(String adopName) {
		this.adopName = adopName;
	}
	public String getAdopage() {
		return adopage;
	}
	public void setAdopage(String adopage) {
		this.adopage = adopage;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Adoption(Long adoptionId, String adopName, String adopage, String gender, String phoneNo, String description,
			String address) {
		super();
		this.adoptionId = adoptionId;
		this.adopName = adopName;
		this.adopage = adopage;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.description = description;
		this.address = address;
	}
	public Adoption() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

