package com.share.ride;

import com.share.ride.entities.User;
import com.share.ride.entities.UserManager;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setfName("Anil");
		user1.setlName("Akula");
		user1.setEmail("anil.akula@konyl.com");
		user1.setMale(true);
		user1.setMobileph("7065263424");
		
		UserManager userManager = new UserManager();
		userManager.persist(user1);

	}

}
