package com.shah.jobpost.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.shah.jobpost.entity.Jobpost;

/**
 * MongoRepository has a base implementation for MongoDB named SimpleMongoRepository class 
 * that provides many of ready-to-use methods.
 */
@Repository
public interface JobpostRepository extends MongoRepository<Jobpost, String> {
	
}
