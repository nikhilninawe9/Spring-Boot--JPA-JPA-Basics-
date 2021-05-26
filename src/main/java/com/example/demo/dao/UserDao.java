package com.example.demo.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

	public List<User> findByUserName(String name);

	public List<User> findByUserNameAndUserCity(String name, String city);

	public List<User> findByUserNameStartingWith(String prefix);

	public List<User> findByUserNameEndingWith(String suffix);

	public List<User> findByUserNameContaining(String words);

	public List<User> findByUserNameLike(String likePattern);

	public List<User> findByUserIdLessThan(int id);

	public List<User> findByUserIdGreaterThanEqual(int id);

	public List<User> findByUserIdIn(Collection<Integer> id);

}
