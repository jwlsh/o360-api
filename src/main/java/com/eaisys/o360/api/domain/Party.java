package com.eaisys.o360.api.domain;

import org.springframework.data.neo4j.annotation.NodeEntity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
@NodeEntity
public class Party extends BaseEntity {
	
	private Long id;
	private String partyId;
	private List<ContactPoint> contactPoints = new ArrayList<ContactPoint>();
	
}