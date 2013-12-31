package com.eaisys.o360.api.domain;

import org.springframework.data.neo4j.annotation.Indexed;

import lombok.Data;

@Data
public class ElectronicAddress extends Location {
	
	@Indexed private String type;
	@Indexed private String url;

}