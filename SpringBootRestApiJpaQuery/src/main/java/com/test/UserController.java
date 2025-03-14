package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.user;
import com.test.repo.UserRepo;

@RestController
public class UserController {
@Autowired
private UserRepo repository;
public void setRepository(UserRepo repository)
{
	this.repository=repository;
}
@PostMapping("/createuser")
public user createUser(@RequestBody user user) {
	return repository.save(user);
}
@GetMapping("/byemail/{mail}")
public user findUserByMail(@PathVariable("mail")String mail) {
	return repository.getuserBymail(mail);
	
}
@GetMapping("/byFname/{Fname}")
public List<user> findUser5ByFname(@PathVariable("Fname")String Fname){
	return repository.getuser5byEndswith(Fname);	
}
}

