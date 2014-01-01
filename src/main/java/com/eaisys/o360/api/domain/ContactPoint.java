package com.eaisys.o360.api.domain;

import lombok.Data;

@Data
public class ContactPoint extends BaseEntity {

	private String name;
	private Location location;

}