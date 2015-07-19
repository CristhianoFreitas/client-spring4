package br.com.my.projects.webapplication.client;

import org.springframework.web.client.RestTemplate;

import br.com.my.projects.webapplication.entity.Person;
import br.com.my.projects.webapplication.service.PersonService;


/**
 * Cliente para servico um servico REST através de um JSON
 *
 */
public class PersonClient implements PersonService {

	private String url;
	
	public PersonClient(String url) {
		this.url = url;
	}
	
	@Override
	public Person getDetail() {
		String url = this.url + PersonService.URL_BASE + PersonService.URL_PERSON;
		
		RestTemplate rest = new RestTemplate();
		Person person = rest.getForObject(url, Person.class);
		
		return person;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
