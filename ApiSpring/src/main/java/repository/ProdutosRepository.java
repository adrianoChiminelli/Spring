package repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import model.ProdutosModel;

public interface ProdutosRepository extends Repository<ProdutosModel, Integer> {

	void save(ProdutosModel produto);
	List<ProdutosModel> findAll();
	ProdutosModel findByID(Integer id);
	void delete(ProdutosModel produto);

}
