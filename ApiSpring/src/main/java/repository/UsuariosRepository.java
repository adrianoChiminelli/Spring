package repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import model.UsuariosModel;

public interface UsuariosRepository extends Repository<UsuariosModel, Integer> {

	void save(UsuariosModel usuario);
	List<UsuariosModel> findAll();
	UsuariosModel findByID(Integer id);
	void delete(UsuariosModel usuario);

}