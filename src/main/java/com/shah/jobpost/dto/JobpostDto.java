package com.shah.jobpost.dto;

import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobpostDto {
	private String profile;
	private String description;
	private Integer experience;
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
