package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@SpringBootApplication
public class JpaExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaExampleApplication.class, args);
		UserDao userDao = context.getBean(UserDao.class);

		// To save and save all the user
//		User user = new User();
//		user.setUserName("Rohini Ninawe");
//		user.setUserCity("Pune");
//		user.setUserStatus("SAP Consultant");
//
//		User user1 = new User();
//		user1.setUserName("Shashank Ninawe");
//		user1.setUserCity("Nagpur");
//		user1.setUserStatus("BusinessMan");
//
//		User user2 = new User();
//		user2.setUserName("John Trovolta");
//		user2.setUserCity("New Joursey");
//		user2.setUserStatus("Actor");
//
//		User user3 = new User();
//		user3.setUserName("Nicolos Cage");
//		user3.setUserCity("Washington DC");
//		user3.setUserStatus("Hero");
//
//		User user4 = new User();
//		user4.setUserName("John Trovolta");
//		user4.setUserCity("New Delhi");
//		user4.setUserStatus("Engineer");
//
//		List<User> users = new ArrayList<User>();
//		users.add(user1);
//		users.add(user);
//		users.add(user3);
//		users.add(user4);
//		users.add(user2);
//
//		// userDao will save as well as return the list of objects or individual objects
//		Iterable<User> users1 = userDao.saveAll(users);
//		users1.forEach(u -> {
//			System.out.println(u);
//		});
//				OR
//		List<User> listusers = (List<User>) userDao.saveAll(users);
//		for (User u : listusers) {
//			System.out.println(u);
//		}

		// to update the user
		// 1. get user by id from database.
		// 2. set values in same object.
//		Optional<User> optionalUser = userDao.findById(1);
//		User user1 = optionalUser.get();
//		System.out.println(user1);
//		user1.setUserName("Bunty");
//		User finaluser = userDao.save(user1);
//		System.out.println(finaluser);

		// to get list of all Users
//		List<User> listusers = (List<User>) userDao.findAll();
//		for (User u : listusers) {
//			System.out.println(u);
//		}
		// OR
//		Iterable<User> itr = userDao.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while (iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}

		// to delete the userby id
//		userDao.deleteById(2);
//		Iterable<User> itr = userDao.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while (iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
//
//		// delete all users
//		Iterable<User> itr1 = userDao.findAll();
//		userDao.deleteAll(itr1);

		// Custom queries
		// find user by name (see custom method in userdao interface)
//		List<User> names = userDao.findByUserName("John Trovolta");
//		names.forEach(data -> {
//			System.out.println(data);
//		});

		// find user by name and city
//		List<User> names = userDao.findByUserNameAndUserCity("John Trovolta", "New Delhi");
//		names.forEach(data -> {
//			System.out.println(data);
//		});

		// list of user name starts with j
//		List<User> names = userDao.findByUserNameStartingWith("jo");
//		names.forEach(data -> {
//			System.out.println(data);
//		});

//		List<User> names = userDao.findByUserIdLessThan(3);
//		names.forEach(data -> {
//			System.out.println(data);
//		});

//		List<Integer> num = new ArrayList<Integer>();
//		num.add(1);
//		num.add(3);
//		num.add(4);
//		num.add(6);
//		List<User> names = userDao.findByUserIdIn(num);
//		names.forEach(data -> {
//			System.out.println(data);
//		});

		List<User> users = userDao.getAllUsers();
		users.forEach(data -> {
			System.out.println(data);
		});

		List<User> userss = userDao.getUserByNameAndCity("John Trovolta", "New Delhi");
		userss.forEach(data1 -> {
			System.out.println(userss);
		});

		List<User> listUsers = userDao.getAllUsers2();
		listUsers.forEach(l -> {
			System.out.println(l);
		});

		System.out.println("=================================================");

		List<User> listUsers2 = userDao.getUsersByNameAndCity2("John Trovolta", "New Delhi");
		listUsers2.forEach(l -> {
			System.out.println(l);
		});
	}

}
