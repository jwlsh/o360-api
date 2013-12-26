package com.eaisys.o360.api.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class PhoneNumber extends Location {
	
	private String countryCode;
	private String areaCode;
	private String exchange;
	private String number;
	
	public PhoneNumber(){
		super.setLocationType("Phone");
	}

}