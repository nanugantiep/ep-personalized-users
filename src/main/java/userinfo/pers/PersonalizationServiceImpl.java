package userinfo.pers;

import java.util.HashMap;

import userinfo.User;

public class PersonalizationServiceImpl implements PersonalizationService {

	
	HashMap<String, User> users = new HashMap<String, User>();
	
	@Override
	public User GetUser(long id) {
		// TODO Auto-generated method stub
		
		return new User();
	}

	@Override
	public void CreateUser(User userInfo) {
		// TODO Auto-generated method stub
		
	}

	
}
