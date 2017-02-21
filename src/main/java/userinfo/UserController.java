package userinfo;

import java.util.HashMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api("v1 - User Information ")
public class UserController {
	
	HashMap<String, User> users = new HashMap<String, User>();
	
	@ApiOperation(value = "Get by ID.")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "OK", response = User.class),
			@ApiResponse(code = 400, message = "BAD_REQUEST"),
			@ApiResponse(code = 401, message = "UNAUTHENTICATED"), 
			@ApiResponse(code = 403, message = "UNAUTHORIZED"),
			@ApiResponse(code = 404, message = "NOT_FOUND"),
			@ApiResponse(code = 500, message = "INTERNAL SERVER ERROR") 
		})
	@RequestMapping(value="/GetUser",method = RequestMethod.GET )
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
