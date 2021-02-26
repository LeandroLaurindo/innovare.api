package br.com.innovare.api.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Produtos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduto;

	private String descricao;

	private String codProduto;

	@Temporal(TemporalType.DATE)
	private Date dataVencimento;

	@Temporal(TemporalType.DATE)
	private Date dataUltCompra;

	private String estoque;

	private String estoqueMin;

	private String estoqueMax;

	private BigDecimal precoCusto;

	private BigDecimal margem;

	private BigDecimal preco;

	private BigDecimal precoPromocao;

	private Integer fornecedor;

	private Integer usuario;

	@ManyToOne
	@JoinColumn(name = "categoria")
	private Categorias categoria;

	public Produtos() {
		super();
	}

	public Produtos(Integer idProduto, String descricao, String codProduto, Date dataVencimento, Date dataUltCompra,
			String estoque, String estoqueMin, String estoqueMax, BigDecimal precoCusto, BigDecimal margem,
			BigDecimal preco, BigDecimal precoPromocao, Integer fornecedor, Integer usuario, Categorias categoria) {
		super();
		this.idProduto = idProduto;
		this.descricao = descricao;
		this.codProduto = codProduto;
		this.dataVencimento = dataVencimento;
		this.dataUltCompra = dataUltCompra;
		this.estoque = estoque;
		this.estoqueMin = estoqueMin;
		this.estoqueMax = estoqueMax;
		this.precoCusto = precoCusto;
		this.margem = margem;
		this.preco = preco;
		this.precoPromocao = precoPromocao;
		this.fornecedor = fornecedor;
		this.usuario = usuario;
		this.categoria = categoria;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEstoque() {
		return estoque;
	}

	public void setEstoque(String estoque) {
		this.estoque = estoque;
	}

	public String getEstoqueMin() {
		return estoqueMin;
	}

	public void setEstoqueMin(String estoqueMin) {
		this.estoqueMin = estoqueMin;
	}

	public String getEstoqueMax() {
		return estoqueMax;
	}

	public void setEstoqueMax(String estoqueMax) {
		this.estoqueMax = estoqueMax;
	}

	public BigDecimal getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(BigDecimal precoCusto) {
		this.precoCusto = precoCusto;
	}

	public BigDecimal getMargem() {
		return margem;
	}

	public void setMargem(BigDecimal margem) {
		this.margem = margem;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataUltCompra() {
		return dataUltCompra;
	}

	public void setDataUltCompra(Date dataUltCompra) {
		this.dataUltCompra = dataUltCompra;
	}

	public BigDecimal getPrecoPromocao() {
		return precoPromocao;
	}

	public void setPrecoPromocao(BigDecimal precoPromocao) {
		this.precoPromocao = precoPromocao;
	}

	public Integer getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Integer fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProduto == null) ? 0 : idProduto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		if (idProduto == null) {
			if (other.idProduto != null)
				return false;
		} else if (!idProduto.equals(other.idProduto))
			return false;
		return true;
	}

}
