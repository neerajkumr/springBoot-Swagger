package com.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Animation;
import com.spring.repository.AnimationDao;

@RestController
@RequestMapping(path = "/animation")
public class AnimationController {

	@Autowired
	private AnimationDao dao;

	@GetMapping("/all")
	public List<Animation> display() {
		return dao.findAll();
	}

	@PostMapping("/saveAnime")
	public Animation addAnimation(@RequestBody Animation anime) {
		return dao.save(anime);

	}

	@GetMapping("/byid/{id}")
	public Optional<Animation> getAnime(@PathVariable int id) {

		Optional<Animation> op = dao.findById(id);
		if (op.isPresent()) {
			Animation a1 = op.get();
		}
		return op;
	}

	@DeleteMapping("/del/{id}")
	public void deleteAnime(@PathVariable int id) {
		dao.deleteById(id);
	}

	@PutMapping("/update/{id}")
	public Animation updateAnimation(@PathVariable int id, @RequestBody Animation anime) {
		if (!dao.existsById(id)) {
			new ResponseEntity<Animation>(HttpStatus.NOT_FOUND);
		} else {
			new ResponseEntity<Animation>(HttpStatus.OK);
			return dao.save(anime);
		}
		return anime;
	}
}
