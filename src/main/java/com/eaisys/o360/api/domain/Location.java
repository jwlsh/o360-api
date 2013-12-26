package com.eaisys.o360.api.domain;

import lombok.Data;

@Data
public abstract class Location {

	private Long id;
	private String locationId;
	private String locationType;
	
}