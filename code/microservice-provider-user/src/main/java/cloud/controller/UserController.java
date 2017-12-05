package cloud.controller;

import cloud.entity.User;
import cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="/simple/{id}")
	public User fingById(@PathVariable Long id) {
		return this.userRepository.findOne(id);
	}
	
}
