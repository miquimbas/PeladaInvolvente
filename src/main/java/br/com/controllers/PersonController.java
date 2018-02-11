package br.com.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

	@RequestMapping(value="/find",method=RequestMethod.GET)
	List<String> findByFiltro () {
		return Arrays.asList(new String[]{"Micael","Kim","Iori","Clark"});
	}
}
