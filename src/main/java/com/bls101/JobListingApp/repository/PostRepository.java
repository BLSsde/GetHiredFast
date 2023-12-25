package com.bls101.JobListingApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bls101.JobListingApp.model.Post;

public interface PostRepository extends MongoRepository<Post,String>{

}
