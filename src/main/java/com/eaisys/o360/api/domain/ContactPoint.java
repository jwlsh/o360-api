package com.eaisys.o360.api.domain;

import lombok.Data;

@Data
public class ContactPoint {
	
	private Long id;
	private String name;
	private Location location;

}