package org.sid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "roles")
public class RoleUser {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_role;
	
	@Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private Role name;

	public int getId_role() {
		return id_role;
	}

	public void setId_role(int id_role) {
		this.id_role = id_role;
	}

	public Role getName() {
		return name;
	}

	public void setName(Role name) {
		this.name = name;
	}
	
	public RoleUser() {}

}
