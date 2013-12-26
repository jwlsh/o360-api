package com.eaisys.o360.api.services;

import org.springframework.stereotype.Service;

import com.eaisys.o360.api.domain.ContactPoint;
import com.eaisys.o360.api.domain.Person;
import com.eaisys.o360.api.domain.PhoneNumber;
import com.eaisys.o360.api.domain.PhysicalAddress;

@Service
public class PersonService {

	public Person getPerson(Long id){
		Person p = new Person();
		p.setId(id);
		p.setPartyId("P13213123123");
		p.setFirstName("John");
		p.setLastName("Walsh");
		
		ContactPoint cp = new ContactPoint();
		cp.setId(1L);
		cp.setName("Home Address");
		cp.setLocation(getAddress());
		
		ContactPoint cp2 = new ContactPoint();
		cp2.setId(2L);
		cp2.setName("Home Number");
		cp2.setLocation(getPhone());
		
		p.getContactPoints().add(cp);
		p.getContactPoints().add(cp2);
		
		return p;
	}
	
	PhysicalAddress getAddress() {
		PhysicalAddress pa = new PhysicalAddress();
		pa.setId(1L);
		pa.setLocationId("4234234234234PL");
		pa.setLine1("2 Hadley Dr");
		pa.setCity("Fairport");
		pa.setState("NY");
		pa.setPostalCode("14450");
		pa.setCountryCode("US");
		
		return pa;
	}
	
	PhoneNumber getPhone(){
		PhoneNumber number = new PhoneNumber();
		number.setId(2L);
		number.setLocationId("423626525423PN");
		number.setCountryCode("001");
		number.setAreaCode("585");
		number.setExchange("223");
		number.setNumber("4223");
		
		return number;
	}
}
