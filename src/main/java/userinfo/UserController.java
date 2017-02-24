package userinfo;

import java.util.HashMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api("v1 - User Information ")
public class UserController {
	
	HashMap<Long, User> userinfo = new HashMap<Long, User>();
	
	@ApiOperation(value = "Get by ID.")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "OK", response = User.class),
			@ApiResponse(code = 400, message = "BAD_REQUEST"),
			@ApiResponse(code = 401, message = "UNAUTHENTICATED"), 
			@ApiResponse(code = 403, message = "UNAUTHORIZED"),
			@ApiResponse(code = 404, message = "NOT_FOUND"),
			@ApiResponse(code = 500, message = "INTERNAL SERVER ERROR") 
		})
	@RequestMapping(value="/GetUser/{id}",method = RequestMethod.GET )
	public User GetUserInfo(
			@PathVariable(name = "id", required = true) @ApiParam(value = "id nuber") long id)
	{
		System.out.println("userId : "+id);
		User user1 = userinfo.get(id);
		return user1;
	}
	 
	 //@RequestMapping("/CreateUser")
	 @RequestMapping(value= "/CreateUser", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void CreateUser(@RequestBody User user)
	{
		 System.out.println("incoming user " + user.getLastName());
		  //HashMap<String, User> users = new HashMap<String, User>();
		 userinfo.put(user.getId(), user);
		  System.out.println(userinfo);
		  System.out.println(userinfo.size());
	}
}
