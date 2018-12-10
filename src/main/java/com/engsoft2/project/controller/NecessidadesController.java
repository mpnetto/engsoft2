package com.engsoft2.project.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.engsoft2.project.model.Escola;
import com.engsoft2.project.model.Sala;
import com.engsoft2.project.model.Ticket;

@Controller
public class NecessidadesController {
	private static final Logger logger = LoggerFactory.getLogger(NecessidadesController.class);	
	private int nTicket = 0;
	List<Ticket> tickets = new ArrayList<Ticket>();
	

	
	@PostConstruct
    public void init() throws Exception {
		Sala sala = new Sala("101");
		String tipo = "InfraEstrutura";
		Escola escola = new Escola("Escola Suzanna Imbassahay");
		String prazo = "2 a 3 semanas";
		boolean status = true;
		String resumo = "Rachadura na Parede";
		
		tickets.add(new Ticket(32, sala, tipo, escola, prazo,status, resumo));
		
		sala = new Sala("203");
		tipo = "InfraEstrutura";
		escola = new Escola("Escola Suzanna Imbassahay");
		prazo = "2 a 3 semanas";
		status = true;
		resumo = "Ventilador com defeito";
		
		tickets.add(new Ticket(23, sala, tipo, escola, prazo,status, resumo));
    }
	
	@GetMapping("/escola/necessidades")
    public String repairPage(Model model) {
		model.addAttribute("tickets",tickets);
		return "repair";

    }
	
	
	@RequestMapping(value = "/escola/chamada", method = RequestMethod.POST)
    public String callConfirmate(Model  model) {
		List<Sala> rooms = new ArrayList<Sala>();
		rooms.add(new Sala("101"));
		rooms.add(new Sala("102"));
		rooms.add(new Sala("103"));
		rooms.add(new Sala("201"));
		rooms.add(new Sala("202"));
		rooms.add(new Sala("303"));
		model.addAttribute("rooms", rooms);
		
		List<Escola> schools = new ArrayList<Escola>();
		schools.add(new Escola("Escola Suzanna Imbassahay"));
		model.addAttribute("schools", schools);
		
		List<String> types = new ArrayList<String>();
		types.add("Equipamento");
		types.add("Infraestrutura");
		types.add("Outro");

		model.addAttribute("types", types);
		model.addAttribute("ticket", new Ticket());
        
		return "call";
    }
	
	
	@RequestMapping("/escola/chamada/editar")
    public String removeConfirmate(@RequestParam("getId") int getId,
						    		@RequestParam("getRoom") String getRoom,
						    		@RequestParam("getSchool") String getSchool,
						    		@RequestParam("getType") String getType,
						    		@RequestParam("getTerm") String getTerm,
						    		@RequestParam("getStatus") String getStatus,
						    		@RequestParam("getResume") String getResume, Model model) {

		
		model.addAttribute("school", getSchool);
		model.addAttribute("ticket", getId);
		model.addAttribute("room", getRoom);
		model.addAttribute("type", getType);
		model.addAttribute("term", getTerm);
		model.addAttribute("status", getStatus);
		model.addAttribute("resume", getResume);

        
		return "edit";
    }
	
	@PostMapping("/ticket")
    public String storeConfirmate(@ModelAttribute Ticket ticket, BindingResult result) {

		if (result.hasErrors()) {
			logger.info("Validation errors while submitting form.");
			return "redirect:/escola/necessidades";
		}
		logger.info(ticket.getTipo());
		//logger.info(Integer.toString(ticket.getSala().getNumero()));
		logger.info("-------");
		ticket.setNumeroTicket(++nTicket);
		
		tickets.add(ticket);
    	//tickets.add(ticket);
    	return "redirect:/escola/necessidades";
    }
	
	@RequestMapping("/remove-ticket")
    public String removeConfirmate(@RequestParam("getId") int getId) {

		System.out.println(getId);
		
		for (int i = 0; i < tickets.size(); i++) {
		    Ticket ticket = tickets.get(i);
		    if(ticket.getNumeroTicket() == getId)
		    	tickets.remove(ticket);
		}
		
    	return "redirect:/escola/necessidades";
    }
	
	
}
