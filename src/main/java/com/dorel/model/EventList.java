package com.dorel.model;

import java.io.Serializable;
import java.util.List;

public class EventList implements  Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<EventObject> events;
	
	public List<EventObject> getEvents() {
		return events;
	}
	public void setEvents(List<EventObject> events) {
		this.events = events;
	}
	@Override
	public String toString() {
		return "EventList [events=" + events + "]";
	}
	
	
}
