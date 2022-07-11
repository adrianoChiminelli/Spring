package com.apex.ApiSpring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apex.ApiSpring.model.ClientesModel;
import com.apex.ApiSpring.repository.ClientesRepository;

@RestController
public class ClientesController {

	@Autowired
	private ClientesRepository clientesRepository;

	@GetMapping(path = "/api/cliente")
	public List<ClientesModel> buscar() {
		return clientesRepository.findAll();
	}

	@GetMapping(path = "/api/cliente/{codigo}")
	public ClientesModel buscarPorId(@PathVariable("codigo") Integer codigo) {
		Optional<ClientesModel> cliente = clientesRepository.findById(codigo);
		return cliente.get();
	}

	@PostMapping(path = "/api/cliente/salvar")
	public void salvar(@RequestBody ClientesModel cliente) {
		clientesRepository.save(cliente);
	}

	@DeleteMapping(path = "/api/cliente/deletar")
	public void deletar(ClientesModel cliente) {
		try {
			clientesRepository.delete(cliente);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
