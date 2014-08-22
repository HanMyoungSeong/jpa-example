package kr.ac.jejuuniv.service;

import kr.ac.jejuuniv.domain.model.User;
import kr.ac.jejuuniv.domain.model.UserRepository;
import kr.ac.jejuuniv.dto.UserDto;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	private Mapper mapper;

	public UserService() {
	}

	public void addMember(User user) {
		userRepository.save(user);
	}

	public User findByUser(int id) {
		return userRepository.findOne(id);
	}

	@Transactional
	public UserDto findByUserDto(Integer id) {
		mapper = new DozerBeanMapper();
		User user = findByUser(id);
		return mapper.map(user, UserDto.class);
	}
}