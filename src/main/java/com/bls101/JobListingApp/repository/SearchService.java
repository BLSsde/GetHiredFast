package com.bls101.JobListingApp.repository;

import java.util.List;

import com.bls101.JobListingApp.model.Post;

public interface SearchService {
	
	List<Post> findByText(String text);
}
