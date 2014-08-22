package kr.ac.jejuuniv.dto;

import java.util.ArrayList;
import java.util.List;

import kr.ac.jejuuniv.domain.model.Gun;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	private int id;
	private String name;
	private List<Gun> guns = new ArrayList<Gun>();
}
