package com.koutheirDemo.bootdemo.converter;

import com.koutheirDemo.bootdemo.dto.SkillDto;
import com.koutheirDemo.bootdemo.entity.Skill;

public class SkillConverter {
	public static Skill dtoToEntity(SkillDto SkillDto) {
		Skill Skill = new Skill(SkillDto.getSkillName(), null);
		Skill.setSkillId(SkillDto.getSkillId());
		return Skill;
	}

	public static SkillDto entityToDto(Skill skill) {
		return new SkillDto(skill.getSkillId(), skill.getSkillName());
	}

}
