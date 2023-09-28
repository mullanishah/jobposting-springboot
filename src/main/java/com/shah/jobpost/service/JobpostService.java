package com.shah.jobpost.service;

import java.util.List;

import com.shah.jobpost.dto.JobpostDto;

public interface JobpostService {
	//CRUD (create, retrive(select), update, delete)
	
	//create
	public JobpostDto addNewJobpost(JobpostDto jobpostDto) throws Exception;
	
	//select - retrive 
	public List<JobpostDto> getAllJobposts() throws Exception;
		
	//update 
	 
	
	//delete
	public void deleteJobpost() throws Exception;
	//public JobpostDto searchByProfile() throws Exception;
}
