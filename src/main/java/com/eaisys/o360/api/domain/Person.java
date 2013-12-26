package com.eaisys.o360.api.domain;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class Person extends Party {

	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String suffix;
	private String gender;
	private Date dateOfBirth;
	private Date dateOfDeath;
	private int height;
	private int weight;
	private String eyeColor;
	private String hairColor;
	private String race;
	private String ethnicity;
}