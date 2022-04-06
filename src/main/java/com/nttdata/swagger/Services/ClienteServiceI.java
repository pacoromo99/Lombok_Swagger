package com.nttdata.swagger.Services;

import java.util.List;

import com.nttdata.swagger.Entities.Cliente;



public interface ClienteServiceI {

	Cliente guardarCliente(Cliente cliente);

	List<Cliente> verTodosClientes();

	List<Cliente> buscarNombreApellidos(String nombre, String apellido);

	void borrarCliente(Cliente cliente);

	Cliente buscarPorId(Long id);

	Cliente crearCliente(Cliente cliente);

	Cliente actualizarCliente(Cliente cliente);
}
