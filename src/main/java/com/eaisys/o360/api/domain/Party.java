package com.eaisys.o360.api.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Party {
	
	private Long id;
	private String partyId;
	private List<ContactPoint> contactPoints = new ArrayList<ContactPoint>();
	
}