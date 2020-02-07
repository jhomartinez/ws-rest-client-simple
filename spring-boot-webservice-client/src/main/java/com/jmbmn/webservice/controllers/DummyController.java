package com.jmbmn.webservice.controllers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jmbmn.webservice.api.client.SoapClient;
import com.jmbmn.webservice.entity.ws.types.GetUserCardsRequest;
import com.jmbmn.webservice.entity.ws.types.GetUserCardsResponse;


@RestController
public class DummyController {

	@Autowired
	private SoapClient client;
	
	
	@PostMapping("/cards")
	public GetUserCardsResponse invokeSoapClient(@RequestBody GetUserCardsRequest request) {
		
		
		return client.getCards(request);
	}
	
	
	
	
	public DummyController() {
	}

}
