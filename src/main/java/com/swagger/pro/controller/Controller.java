package com.swagger.pro.controller;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.pro.model.Movie;

@RestController
@RequestMapping("/movie/det")
public class Controller {

	
	private static List<Movie> movies=new ArrayList<Movie>();
	
	@GetMapping
	public List<Movie> get(){
		return movies;
	}
	
	@PostMapping
	public Movie gett(@RequestBody Movie movie) {
		movies.add(movie);
		return movie;
	}
	@PutMapping
	public String getty() {
		return "put mapping";
	}
}
