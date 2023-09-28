package com.shah.jobpost.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shah.jobpost.dto.JobpostDto;
import com.shah.jobpost.entity.Jobpost;
import com.shah.jobpost.exceptions.ResourceNotFoundException;
import com.shah.jobpost.mapper.CommonJobpostMapper;
import com.shah.jobpost.repository.JobpostRepository;

@Service
@Transactional
public class JobpostServiceImpl implements JobpostService {

	@Autowired
	private JobpostRepository jobpostRepository;
	
	@Override
	public List<JobpostDto> getAllJobposts() throws Exception {
		List<Jobpost> jobpostList = jobpostRepository.findAll();
		if(jobpostList.isEmpty())
			throw new ResourceNotFoundException("No Job post is available at the moment!!");
		return jobpostList.stream()
				.map((jobpost) -> CommonJobpostMapper.mapToDto(jobpost))
				.collect(Collectors.toList());
	}

	@Override
	public JobpostDto addNewJobpost(JobpostDto jobpostDto) throws Exception {
		
		Jobpost jobpost = CommonJobpostMapper.mapToEntity(jobpostDto);
		Jobpost savedJobpost = jobpostRepository.save(jobpost);
		return CommonJobpostMapper.mapToDto(savedJobpost);
	}

	@Override
	public void deleteJobpost() throws Exception {
		// TODO Auto-generated method stub
		jobpostRepository.delete(null);
	}

}
