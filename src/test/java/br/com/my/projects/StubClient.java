package br.com.my.projects;


//import org.junit.Test;

import br.com.my.projects.webapplication.client.PersonClient;
import br.com.my.projects.webapplication.entity.Person;

public class StubClient {

	
//	@Test
	public void personStubTest() {
		PersonClient client = new PersonClient("http://localhost:8080/");
		
		Person person = client.getDetail();
		
		System.out.println(person.getName()+ ";" +person.getLocation());
	}
}
