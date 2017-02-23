package userinfo.pers;

import userinfo.User;

public interface PersonalizationService {
	
	/**
     * Get User.
     * 
     * @return User
     */
	public User GetUser(long id);
	
	
	/**
     * Create User.
     * 
     */
	public void CreateUser(User userInfo);

}
