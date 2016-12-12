package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collaboration.model.Bulletin;

public interface BulletinDAO {

	public List<Bulletin> getAllBulletin(char showflag);

	public Bulletin getBulletinByID (int v_bulid);
	
	public boolean saveBulletin(Bulletin bulletin);
}
