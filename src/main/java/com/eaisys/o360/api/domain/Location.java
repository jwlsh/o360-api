package com.eaisys.o360.api.domain;

import lombok.Data;

@Data
public abstract class Location extends BaseEntity {

	private String locationId;
	private String locationType;
	
}