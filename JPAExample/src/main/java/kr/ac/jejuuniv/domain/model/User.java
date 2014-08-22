package kr.ac.jejuuniv.domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.envers.Audited;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "users")
public class User {

	@Id
	@GeneratedValue
	private int id;

	@Audited
	private String name;

	@JoinColumn(name = "userId")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Gun> guns = new ArrayList<Gun>();

	public User() {
	}

	public User(String name) {
		this.name = name;
	}

	public User(String name, List<Gun> guns) {
		for (Gun gun : guns)
			this.guns.add(gun);
		this.name = name;
	}
}