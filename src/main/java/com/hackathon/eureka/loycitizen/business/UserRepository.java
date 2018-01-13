package com.hackathon.eureka.loycitizen.business;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.hackathon.eureka.loycitizen.loycitizenuser.model.LoyCitizenUser;
import com.hackathon.eureka.loycitizen.vo.User;
import com.hackathon.eureka.loycitizen.vo.Users;

//Useful if XML based user data is being used 
// As currently we have changed our logic to fetch user info from DB so this class not required
public class UserRepository {

	public LoyCitizenUser getLoyCitizenUser(String uniqueID) {
		LoyCitizenUser loyCitizenUser;
		Users usersData = getUsersData();

		for (User user : usersData.getUser()) {
			if (user.getId().equalsIgnoreCase(uniqueID)) {
				loyCitizenUser = getLoyCitizenLoyCitizenUser(user);
				return loyCitizenUser;
			}
		}

		return null ;
	}

	public Users getUsersData() {
		ObjectMapper objectMapper = new XmlMapper();

		Users users = new Users();
		try {
			users = objectMapper.readValue(StringUtils.toEncodedString(Files.readAllBytes(Paths.get("/users/Users.xml")), StandardCharsets.UTF_8), Users.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(users);

		/*
		 * List<Users> usersList = new LinkedList<Users>();
		 * usersList.addAll(Arrays.asList(users));
		 */
		return users;
	}
	
	public LoyCitizenUser getLoyCitizenLoyCitizenUser(User user){
		LoyCitizenUser LoyCitizenUser = new LoyCitizenUser();
		LoyCitizenUser.setFname(user.getFname());
		return LoyCitizenUser;
	}
}
