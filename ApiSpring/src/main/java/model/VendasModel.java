package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "produtos")
@Entity
public class VendasModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_venda")
	private Integer idVenda;

	@Column(name = "fk_produto")
	private Integer fkProduto;

	@Column(name = "fk_cliente")
	private Integer fkCliente;

	@Column(name = "quantidade")
	private Integer qtdVenda;

	public Integer getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	public Integer getFkProduto() {
		return fkProduto;
	}

	public void setFkProduto(Integer fkProduto) {
		this.fkProduto = fkProduto;
	}

	public Integer getFkCliente() {
		return fkCliente;
	}

	public void setFkCliente(Integer fkCliente) {
		this.fkCliente = fkCliente;
	}

	public Integer getQtdVenda() {
		return qtdVenda;
	}

	public void setQtdVenda(Integer qtdVenda) {
		this.qtdVenda = qtdVenda;
	}

}
