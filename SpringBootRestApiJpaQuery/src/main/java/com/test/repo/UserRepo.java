package com.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.entity.user;
@Repository
public interface UserRepo extends JpaRepository<user, Integer> 
{
	@Query("select u from user u where u.mail=?1")
user getuserBymail(String mail);
	@Query("select u from user u where u.Fname like %?1")
	List<user> getuser5byEndswith(String Fname);
	

}
