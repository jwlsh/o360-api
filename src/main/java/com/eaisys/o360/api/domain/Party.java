package com.eaisys.o360.api.domain;

import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

import java.util.Set;

import lombok.Data;

@Data
@NodeEntity
public class Party extends BaseEntity {
	
	@Indexed private String partyId;
	private Set<ContactPoint> contactPoints;

	
}