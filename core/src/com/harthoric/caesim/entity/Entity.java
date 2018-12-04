package com.harthoric.caesim.entity;

import java.util.Map;

public class Entity {

	private Map<Integer, String> descriptor;
	private Map<Integer, String> role;
	boolean perceptive;
	private String tag;
	private int ID;

	/*
	 * @param descriptor describes the entity
	 * @param role what role the entity has in the game
	 * @param perceptive if you are able to interact with the entity
	 * @param tag the name of the entity
	 * @param ID dedicated number of the entity - what type
	 */
	Entity(Map<Integer, String> descriptor, Map<Integer, String> role, boolean perceptive, String tag, int ID) {
		this.descriptor = descriptor;
		this.perceptive = perceptive;
		this.role = role;
		this.tag = tag;
		this.ID = ID;
	}

}
