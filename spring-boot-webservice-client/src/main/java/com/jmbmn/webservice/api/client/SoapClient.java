package com.jmbmn.webservice.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import com.jmbmn.webservice.api.config.HeaderHandlerResolver;
import com.jmbmn.webservice.entity.ws.types.GetUserCardsRequest;
import com.jmbmn.webservice.entity.ws.types.GetUserCardsResponse;

@Service
public class SoapClient {

	@Autowired
	private Jaxb2Marshaller marshaller;
	
	private WebServiceTemplate template;
		
	public SoapClient() {
	}
	
	public GetUserCardsResponse getCards(GetUserCardsRequest request) {		
		
		template = new WebServiceTemplate(marshaller);
		GetUserCardsResponse response = (GetUserCardsResponse) template.marshalSendAndReceive("https://localhost:8443/CheckOutWSWeb", request);
		return response;
	}

}
