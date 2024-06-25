package com.example.demo.resttemplateservice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Crewinfo;



@Service
public class ResttemplateService {

	RestTemplate resttemplate = new RestTemplate();
	final String URL = "/ddboperation";

	public ResponseEntity<String> allCrew() {
		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<String> response = resttemplate.exchange(URL, HttpMethod.GET, entity, String.class);
		return response;
	}

	public ResponseEntity<Crewinfo> getcrewById(int id) {
		Map<String,Integer> param = new HashMap<String,Integer>();
		param.put("id", id);
		return resttemplate.getForEntity(URL, Crewinfo.class, param);
		
	}

}
