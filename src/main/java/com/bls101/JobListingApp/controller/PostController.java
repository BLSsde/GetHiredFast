package com.bls101.JobListingApp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bls101.JobListingApp.model.Post;
import com.bls101.JobListingApp.repository.PostRepository;
import com.bls101.JobListingApp.repository.SearchService;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class PostController {

	@Autowired
	PostRepository repo;
	
	@Autowired
	SearchService sService;
	
	
	@ApiIgnore
	@RequestMapping(value="/")
	public void redirect(HttpServletResponse response) throws IOException{
		response.sendRedirect("/swagger-ui.html");
	}
	
	@GetMapping("/posts")
	@CrossOrigin
	public List<Post> getAllPosts(){
		return repo.findAll();
	}
	
	// posts/java
	@GetMapping("/posts/{text}")
	@CrossOrigin
	public List<Post> search(@PathVariable String text)
	{
		return sService.findByText(text);
	}
	
	@PostMapping("/post")
	@CrossOrigin
	public Post addPost(@RequestBody Post post) {
		return repo.save(post);
	}
	
	
	
}
