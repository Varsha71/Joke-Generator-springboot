package com.JokeGenerator;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeReceivingService {
	public JokeResponseBody getResponse(String cat) {
	RestTemplate rt= new RestTemplate();
	ResponseEntity<JokeResponseBody> entity= rt.getForEntity("https://v2.jokeapi.dev/joke/"+cat,JokeResponseBody.class);
	return entity.getBody();
	}
}
