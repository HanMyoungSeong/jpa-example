package kr.ac.jejuuniv.domain.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface UserRepository extends JpaRepository<User, Integer>, QueryDslPredicateExecutor<User> {

	@Query("select u from users u where u.id = ?1")
	List<User> getUserList(int id);
}
