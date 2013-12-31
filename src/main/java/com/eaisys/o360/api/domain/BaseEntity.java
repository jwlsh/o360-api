package com.eaisys.o360.api.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;

@Data
public abstract class BaseEntity implements Serializable { 

  @GraphId protected Long id;
  @Indexed protected String uid;
  @Indexed protected String clientId;
  protected Date created;        
  protected Date lastModified;
  protected String lastModifiedBy;
}