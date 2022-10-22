package br.com.meuvoto.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.meuvoto.portal.dao.PartidoService;
import br.com.meuvoto.portal.model.Partido;


public class PartidoController {
	
	@Autowired
	PartidoService partidoService;
	
	@RequestMapping(value = "/get-list-partido",  method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Partido> getListPartido(Errors errors) throws Exception  {
    	
    	return partidoService.getAllEvents();
    	
	}
}
