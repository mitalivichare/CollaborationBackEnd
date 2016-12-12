package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collaboration.model.EventMaster;

public interface EventMasterDAO {

	public List<EventMaster> getAllEvents(char status);

	public EventMaster getEventByID(int evtid);
	
	public boolean saveEvent(EventMaster event);
	
	public boolean removeEvent(int evtid);
	
}
