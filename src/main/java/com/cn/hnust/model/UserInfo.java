package com.cn.hnust.model;

import java.util.Date;

public class UserInfo {
    private Integer infoid;

    private String name;

    private String email;

    private String city;

    private Date editdate;

    private Integer sex;

    private String hobby;

    private String introduce;

    private Integer id;

    private Integer power;

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Date getEditdate() {
        return editdate;
    }

    public void setEditdate(Date editdate) {
        this.editdate = editdate;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

	@Override
	public String toString() {
		return "UserInfo [infoid=" + infoid + ", name=" + name + ", email=" + email + ", city=" + city + ", editdate="
				+ editdate + ", sex=" + sex + ", hobby=" + hobby + ", introduce=" + introduce + ", id=" + id
				+ ", power=" + power + "]";
	}
    
}