package com.shah.jobpost.mapper;

import com.shah.jobpost.dto.JobpostDto;
import com.shah.jobpost.entity.Jobpost;

public class CommonJobpostMapper {
	
	public static JobpostDto mapToDto(Jobpost entity) {
		
		JobpostDto jobpostDto = new JobpostDto();
		jobpostDto.setProfile(entity.getProfile());
		jobpostDto.setDescription(entity.getDescription());
		jobpostDto.setExperience(entity.getExperience());
		jobpostDto.setTechStack(entity.getTechStack());
		return jobpostDto;
	}
	
	public static Jobpost mapToEntity(JobpostDto dto) {
		
		Jobpost jobpostEntity = new Jobpost();
		jobpostEntity.setProfile(dto.getProfile());
		jobpostEntity.setDescription(dto.getDescription());
		jobpostEntity.setExperience(dto.getExperience());
		jobpostEntity.setTechStack(dto.getTechStack());
		return jobpostEntity;
	}

}
