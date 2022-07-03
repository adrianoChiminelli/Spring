package repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import model.ClientesModel;

public interface ClientesRepository extends Repository<ClientesModel, Integer> {

	void save(ClientesModel cliente);
	List<ClientesModel> findAll();
	ClientesModel findByID(Integer id);
	void delete(ClientesModel cliente);

}
