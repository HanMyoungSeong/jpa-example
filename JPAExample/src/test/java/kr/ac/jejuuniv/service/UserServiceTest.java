package kr.ac.jejuuniv.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import kr.ac.jejuuniv.config.CommponentScanOrJpaconfigTestRunner;
import kr.ac.jejuuniv.domain.model.Gun;
import kr.ac.jejuuniv.domain.model.User;
import kr.ac.jejuuniv.domain.model.UserRepository;
import kr.ac.jejuuniv.dto.UserDto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CommponentScanOrJpaconfigTestRunner.class)
public class UserServiceTest {

	private static final String NAME = "hms";

	private static final int ID = 1;

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;

	@Test
	public void //
	should_return_matched_result_when_user_is_find_id() {
		User findUser = userService.findByUser(ID);
		assertTrue(findUser.getId() == ID);
		assertTrue(findUser.getName().equals(NAME));
	}

	@Test
	public void //
	should_return_matched_result_when_user_is_added_member() {
		Gun shutGun = new Gun("shut-gun");
		Gun changeGun = new Gun("change-gun");

		List<Gun> guns = new ArrayList<Gun>();
		guns.add(shutGun);
		guns.add(changeGun);
		User user = new User(NAME, guns);
		userService.addMember(user);
		User findUser = userService.findByUser(ID);
		assertTrue(findUser.getId() == ID);
		assertTrue(findUser.getName().equals(NAME));
	}

	@Test
	public void //
	should_return_matched_result_when_user_dto_is_find_information() {
		UserDto findUser = userService.findByUserDto(ID);
		assertTrue(findUser.getId() == ID);
		assertTrue(findUser.getName().equals(NAME));
		assertNotNull(findUser.getGuns().get(0));
		assertNotNull(findUser.getGuns().get(1));
		
	}

	@Test
	public void //
	test_query_annotation_user_list() {
		List<User> userList = userRepository.getUserList(ID);
		assertNotNull(userList);
	}
}