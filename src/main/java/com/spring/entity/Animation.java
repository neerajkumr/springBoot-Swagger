package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "animation")
public class Animation {

	@Id
	int id;
	@Column(name = "animeName")
	String aname;
	@Column(name = "Hero")
	String hero;
	public Animation() {
		
	}
	public Animation(int id, String aname, String hero) {
		super();
		this.id = id;
		this.aname = aname;
		this.hero = hero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	@Override
	public String toString() {
		return "Animation [id=" + id + ", aname=" + aname + ", hero=" + hero + "]";
	}
	
	

}