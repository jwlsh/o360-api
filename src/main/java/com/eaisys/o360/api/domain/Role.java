package com.eaisys.o360.api.domain;

import org.springframework.data.neo4j.annotation.NodeEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@NodeEntity
public class Role extends BaseEntity {

  private String name;
}