package com.koko.restful.service.restfulwebservice.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	// JPA/hibernate -> database
	// UserDaoService -> static data
	
	static List<User> users = new ArrayList<>();
	
	static int userCount = 0;
	
	static {
		users.add(new User(++userCount, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(++userCount, "Eve", LocalDate.now().minusYears(25)));
		users.add(new User(++userCount, "Yeshua", LocalDate.now().minusYears(20)));
	}
	
	// Find all users
	public List<User> findAll() {
		return users;
	}
	
	// Find a user
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	// Save a user to the static users data
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	// Delete a user
	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
	
}
