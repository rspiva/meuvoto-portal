package br.com.meuvoto.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.meuvoto.portal.dao.PartidoService;
import br.com.meuvoto.portal.model.Partido;


@Controller
public class IndexController {
	
	@Autowired
	PartidoService partidoService;
	
	@RequestMapping("/")
	public String homePage(Model model) throws Exception {
		
		model.addAttribute("lstpartidos", partidoService.getAllEvents());
		
		return "index";		
	}
	
	@RequestMapping("/index")
	public String indexPage(Model model) throws Exception {
		
		model.addAttribute("lstpartidos", partidoService.getAllEvents());
		
		return "index";		
	}
	
	@RequestMapping("/meus-dados")
	public String meusDadosPage() throws Exception {
		
		return "meus-dados";			
	}
	
	@RequestMapping("/meus-votos")
	public String meusVotosPage() throws Exception {
		
		return "meus-votos";			
	}
	
	@RequestMapping("/seguindo")
	public String seguindoPage() throws Exception {
		
		return "seguindo";			
	}
	
	@RequestMapping("/entrar")
	public String entrarPage() throws Exception {
		
		return "seguindo";			
	}
	
	@RequestMapping("/cadastrar")
	public String cadastrarPage() throws Exception {
		
		return "cadastrar";			
	}	
}