package com.example.demo.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

	// by JPA Method naming conventions
	public List<User> findByUserName(String name);

	public List<User> findByUserNameAndUserCity(String name, String city);

	public List<User> findByUserNameStartingWith(String prefix);

	public List<User> findByUserNameEndingWith(String suffix);

	public List<User> findByUserNameContaining(String words);

	public List<User> findByUserNameLike(String likePattern);

	public List<User> findByUserIdLessThan(int id);

	public List<User> findByUserIdGreaterThanEqual(int id);

	public List<User> findByUserIdIn(Collection<Integer> id);

	// by query annotation
	// here jpa is using JPQL
	@Query("select u From User u")
	public List<User> getAllUsers();

	@Query("select u From User u WHERE u.userName=:n and u.userCity=:c")
	public List<User> getUserByNameAndCity(@Param("n") String name, @Param("c") String city);

	// By simple sql query i.e. native query
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getAllUsers2();

	@Query(value = "select * from user where user_name=? and user_city=?", nativeQuery = true)
	public List<User> getUsersByNameAndCity2(String name, String city);

}
