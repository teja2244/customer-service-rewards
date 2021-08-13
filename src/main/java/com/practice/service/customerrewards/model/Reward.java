package com.practice.service.customerrewards.model;

import com.fasterxml.jackson.annotation.JsonInclude;

public abstract class Reward {

	// for serialization, 
	@JsonInclude  //
	protected Long points;

	public abstract Long getPoints();

}
