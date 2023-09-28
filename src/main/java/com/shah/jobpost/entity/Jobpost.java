package com.shah.jobpost.entity;

import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "job-posting")
public class Jobpost {
	
	private String profile;
	@Field(name = "desc")
	private String description;
	@Field(name = "exp")
	private Integer experience;
	@Field(name = "techs")
	private String[] techStack;
	
	public String getProfile() {
		return profile;
	}
	
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getExperience() {
		return experience;
	}
	
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	
	public String[] getTechStack() {
		return techStack;
	}
	
	public void setTechStack(String[] techStack) {
		this.techStack = techStack;
	}

	@Override
	public String toString() {
		return "Jobpost [profile=" + profile + ", description=" + description + ", experience=" + experience
				+ ", techStack=" + Arrays.toString(techStack) + "]";
	}	
}
