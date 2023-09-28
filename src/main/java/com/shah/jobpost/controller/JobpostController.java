package com.shah.jobpost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shah.jobpost.dto.JobpostDto;
import com.shah.jobpost.service.JobpostService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * 
 *
 */
@Tag(name = "Job post", description = "Jobpost- SpringBoot APIs")
@OpenAPIDefinition(servers = {@Server(url="http://localhost:8080/jobposting/")})
@RestController
@RequestMapping(value = "/api/")
public class JobpostController {
	
	@Autowired
	private JobpostService jobpostService;
	
	@Operation(summary = "Retrive All Jobposts", description = "Retrive all jobposts present in MongoDB cluster on the cloud")
	@ApiResponses({
		@ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = JobpostDto.class), mediaType = "application/json") }),
		@ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
		@ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
	@GetMapping(value = "/get-all-posts")
	public ResponseEntity<List<JobpostDto>> getAllJobposts() throws Exception{
		
		return ResponseEntity.ok(jobpostService.getAllJobposts());
	}
	
	@PostMapping(value = "/create-jobpost")
	public ResponseEntity<JobpostDto> createNewJobpost(JobpostDto jobpostDto) throws Exception{
		
		JobpostDto savedJobpost = jobpostService.addNewJobpost(jobpostDto);
		return new ResponseEntity<JobpostDto>(savedJobpost, HttpStatus.CREATED);
	}
}
