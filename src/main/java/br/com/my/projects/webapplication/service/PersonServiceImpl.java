package br.com.my.projects.webapplication.service;

import org.springframework.stereotype.Service;

import br.com.my.projects.webapplication.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	public Person getDetail() {
		Person p = new Person();
		p.setLocation("Casa do Chapeu.");
		p.setName("Nome do Teste");
		
		return p;
	}
}
