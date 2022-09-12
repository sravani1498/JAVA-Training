package com.hnt.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.hnt.entity.User;
import com.hnt.service.UserService;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {
	@Mock
	UserService service;
	@InjectMocks
	UserController controller;

	@Test
	void testSaveUser1() {
		User user = new User();
		user.setId(1);
		when(service.save(user)).thenReturn(user);// mocking
		Integer savedUserId = controller.saveUser1(user);
		assertEquals(1, savedUserId);
	}
	
	@Test
	void getUser() {
		Iterable<User> user = new ArrayList<User>();
		when(service.getUser()).thenReturn(user);
		Iterable<User> userService = controller.getUser(); 
		assertEquals(user, userService);
	}
	
	@Test
	void deleteUser() {
		User user = new User();
		Integer userId = 1;
		
	}

}
