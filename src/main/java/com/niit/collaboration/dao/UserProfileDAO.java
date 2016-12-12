package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collaboration.model.UserProfile;

public interface UserProfileDAO {

	public List<UserProfile> getAllUsers();
	
	public boolean saveUserProfile(UserProfile userprofile);
	
	public boolean updateApprove(String useremail, char flag);
		
	public UserProfile getUserProfileByEmail(String useremail);

	boolean checkUserEmail(String useremail);
	
	public UserProfile authenticate(String useremail, String password);
	
	public boolean updateOnOffLine(String useremail, char onoff);
	
}
