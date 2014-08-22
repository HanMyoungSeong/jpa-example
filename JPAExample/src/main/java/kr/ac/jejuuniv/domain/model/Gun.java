package kr.ac.jejuuniv.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "guns")
public class Gun {

	@Id
	@GeneratedValue
	private int id;

	private String name;

	public Gun() {
	}

	public Gun(String name) {
		this.name = name;
	}

}
