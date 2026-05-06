package com.devsuperior.hroauth.dto;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.hroauth.entities.Role;
import com.devsuperior.hroauth.entities.User;

public class UserDTO {

	private Long id;
	private String name;
	private String email;
	private String password;
	
	private List<RoleDTO> roles = new ArrayList<>();
	
	public UserDTO() {
	}

	public UserDTO(Long id, String name, String email, String password, List<RoleDTO> roles) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	
	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		password = entity.getPassword();
		for( Role role : entity.getRoles()) {
			roles.add(new RoleDTO(role));
		}
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public List<RoleDTO> getRoles() {
		return roles;
	}
}
