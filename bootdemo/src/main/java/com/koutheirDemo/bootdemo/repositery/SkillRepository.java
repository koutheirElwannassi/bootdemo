package com.koutheirDemo.bootdemo.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koutheirDemo.bootdemo.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{

}
