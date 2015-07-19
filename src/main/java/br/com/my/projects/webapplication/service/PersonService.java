package br.com.my.projects.webapplication.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.my.projects.webapplication.entity.Person;

@RestController
@RequestMapping(PersonService.URL_BASE)
public interface PersonService {
	
	static final String URL_BASE = "/page1";
	static final String URL_PERSON = "/person";

	@RequestMapping(value = URL_PERSON, method = RequestMethod.GET)
	Person getDetail();
}
