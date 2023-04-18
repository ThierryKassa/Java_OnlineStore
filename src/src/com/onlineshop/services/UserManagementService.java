package src.com.onlineshop.services;

import src.com.onlineshop.enteties.User;


public interface UserManagementService {

	String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);

}
