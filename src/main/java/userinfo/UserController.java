package userinfo;

import java.util.HashMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	HashMap<String, User> users = new HashMap<String, User>();
	
	@RequestMapping("/GetUser")
	public User GetUserInfo()
	{
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Nara");
		user1.setLastName("Anuganti");
		user1.setAge(25);
		return user1;
	}
	 
	 //@RequestMapping("/CreateUser")
	 @RequestMapping(value= "/CreateUser", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void CreateUser(@RequestBody User user)
	{
		 System.out.println("incoming user " + user.getLastName());
		  //HashMap<String, User> users = new HashMap<String, User>();
		  users.put(user.getLastName(), user);
		  System.out.println(users);
		  System.out.println(users.size());
	}
}
