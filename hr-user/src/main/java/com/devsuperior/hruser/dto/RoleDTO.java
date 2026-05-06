package com.devsuperior.hruser.dto;

import com.devsuperior.hruser.entities.Role;

public class RoleDTO {

	private Long id;
	private String roleName;
	
	public RoleDTO() {
	}

	public RoleDTO(Long id, String roleName) {
		this.id = id;
		this.roleName = roleName;
	}

	public RoleDTO(Role entity) {
		id = entity.getId();
		roleName = entity.getRoleName();
	}

	public Long getId() {
		return id;
	}

	public String getRoleName() {
		return roleName;
	}
}
