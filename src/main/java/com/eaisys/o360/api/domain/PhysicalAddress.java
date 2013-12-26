package com.eaisys.o360.api.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class PhysicalAddress extends Location {

	private String line1;
	private String line2;
	private String line3;
	private String city;
	private String state;
	private String postalCode;
	private String county;
	private String countryCode;
	private String latitude;
	private String longitude;
	
	public PhysicalAddress() {
		super.setLocationType("PhysicalAddress");
	}
	
}
