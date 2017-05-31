package com.framgia.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @version 22/05/2017
 * @author vu.thi.tran.van@framgia.com
 * 
 */
@SuppressWarnings("serial")
public class User implements Serializable {
	private Integer id;
	private String username;
	private String password;
	private String name;
	private String gender;
	private String birthday;
	private String phone;
	private String email;
	private String statusJoin;
	private Integer idGroup;
	private Permission permission;
	private Image image;
	private String deleteFlag;
	private String userCreate;
	private Date dateCreate;
	private String userUpdate;
	private Date dateUpdate;

	public User() {
		super();
	}

	public User(Integer id) {
		super();
		this.id = id;
	}

	public User(Integer id, String username, String password, String name, String gender, String birthday, String phone,
	        String email, String joinStatus, Integer idGroup, Permission permission, Image image, String deleteFlag,
	        String userCreate, Date dateCreate, String userUpdate, Date dateUpdate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.statusJoin = joinStatus;
		this.idGroup = idGroup;
		this.permission = permission;
		this.image = image;
		this.deleteFlag = deleteFlag;
		this.userCreate = userCreate;
		this.dateCreate = dateCreate;
		this.userUpdate = userUpdate;
		this.dateUpdate = dateUpdate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatusJoin() {
		return statusJoin;
	}

	public void setStatusJoin(String joinStatus) {
		this.statusJoin = joinStatus;
	}

	public Integer getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(Integer idGroup) {
		this.idGroup = idGroup;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getUserCreate() {
		return userCreate;
	}

	public void setUserCreate(String userCreate) {
		this.userCreate = userCreate;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public String getUserUpdate() {
		return userUpdate;
	}

	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
	}

	public Date getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

}