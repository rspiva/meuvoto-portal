package br.com.meuvoto.portal.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meuvoto.portal.model.Partido;
import br.com.meuvoto.portal.repository.PartidoRepository;

@Service
public class PartidoService {
	
	@Autowired
	PartidoRepository repository;
	
	public List<Partido> getAllEvents() {
        List<Partido> eventList = repository.findAll();
         
        if(eventList.size() > 0) {
            return eventList;
        } else {
            return new ArrayList<Partido>();
        }
	}
	     
    public Partido getEventById(Integer id) throws Exception {
    	
        Optional<Partido> partido = repository.findById(id);
         
        if(partido.isPresent()) {
            return partido.get();
        } else {
            throw new Exception("No eventee record exist for given id");
        }
    }
     
    public Partido createOrUpdateEvent(Partido entity) throws Exception {
    	
    	Optional<Partido> partido = repository.findById(entity.getId());
         
        if(partido.isPresent()) 
        {
        	Partido newEntity = partido.get();
            newEntity.setId(entity.getId());
            newEntity.setNrLegenda(entity.getNrLegenda());
            newEntity.setDsPartido(entity.getDsPartido());
            newEntity.setDsLegenda(entity.getDsLegenda());
            newEntity = repository.save(newEntity);
             
            return newEntity;
        } else {
            entity = repository.save(entity);
             
            return entity;
        }
    } 
     
    public void deleteEventById(Integer id) throws Exception{
    	
        Optional<Partido> event = repository.findById(id);
         
        if(event.isPresent()){
            repository.deleteById(id);
        } else {
            throw new Exception("No event record exist for given id");
        }
    } 
}
