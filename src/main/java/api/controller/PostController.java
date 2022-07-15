package api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.resources.UserResource;

@RestController
public class PostController {
	@RequestMapping("/hello")
	public ResponseEntity<String> hello(@RequestParam(name = "user", required = false) UserResource user) {
		return new ResponseEntity<String>(user.toString(), HttpStatus.ACCEPTED);
	}
}
