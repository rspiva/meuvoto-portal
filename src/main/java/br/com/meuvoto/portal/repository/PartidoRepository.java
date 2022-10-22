package br.com.meuvoto.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.meuvoto.portal.model.Partido;


@Repository
public interface PartidoRepository extends JpaRepository<Partido,Integer>{
	

}
