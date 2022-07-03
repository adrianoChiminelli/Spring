package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.ClientesModel;
import repository.ClientesRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class ClientesController {

	@Autowired
	private ClientesRepository clientesRepository;

	@RequestMapping("/clientes")
	public @ResponseBody List<ClientesModel> consultar() {
		return this.clientesRepository.findAll();
	}

}
