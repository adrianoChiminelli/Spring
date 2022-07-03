package repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import model.VendasModel;

public interface VendasRepository extends Repository<VendasModel, Integer> {

	void save(VendasModel venda);
	List<VendasModel> findAll();
	VendasModel findByID(Integer id);
	void delete(VendasModel venda);

}