package com.nttdata.swagger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.swagger.Entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByNombreAndApellidos(String nombre, String apellidos);
	Optional<Cliente> findFirstByDni(String dni);

}
