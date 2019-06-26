package com.koutheirDemo.bootdemo.dto;

public class SkillDto {
	Integer skillId;
	String skillName;

	public SkillDto(Integer skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}

	public SkillDto() {
		super();
	}

	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
}
