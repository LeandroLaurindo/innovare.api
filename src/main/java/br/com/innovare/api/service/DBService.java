package br.com.innovare.api.service;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.innovare.api.domain.model.Categorias;
import br.com.innovare.api.domain.model.Produtos;
import br.com.innovare.api.repositories.CategoriasRepository;
import br.com.innovare.api.repositories.ProdutosRepository;



@Service
public class DBService {

	@Autowired
    private CategoriasRepository categoriasRepository;
    
	@Autowired
    private ProdutosRepository produtosRepository;
	
	public void iniciaDatabase() {
		
		Categorias cat1 = new Categorias();
		cat1.setNomeCategoria("SHAMPOO");
		cat1.setUsuario(1);
		Categorias cat2 = new Categorias();
		cat2.setNomeCategoria("CREMES");
		cat2.setUsuario(1);
		Categorias cat3 = new Categorias();
		cat3.setNomeCategoria("CONDICIONADOR");
		cat3.setUsuario(1);
		
		Produtos produtos1 = new Produtos();
		produtos1.setCategoria(cat1);
		produtos1.setDescricao("SHAMPOO SENDA 350ML CERAMIDAS");
		produtos1.setCodProduto("7891242521");
		produtos1.setDataUltCompra(new Date());
		produtos1.setDataVencimento(new Date());
		produtos1.setEstoque("7");
		produtos1.setEstoqueMax("12");
		produtos1.setEstoqueMin("2");
		produtos1.setFornecedor(1);
		produtos1.setPrecoCusto(new BigDecimal("7.60"));
		produtos1.setMargem(new BigDecimal("1.35"));
		produtos1.setPreco(new BigDecimal("10.25"));
		produtos1.setPrecoPromocao(new BigDecimal("8.74"));
		produtos1.setUsuario(1);
		

		Produtos produtos2 = new Produtos();
		produtos2.setCategoria(cat1);
		produtos2.setDescricao("SHAMPOO SENDA 350ML CAMOMILA");
		produtos2.setCodProduto("7891242522");
		produtos2.setDataUltCompra(new Date());
		produtos2.setDataVencimento(new Date());
		produtos2.setEstoque("7");
		produtos2.setEstoqueMax("12");
		produtos2.setEstoqueMin("2");
		produtos2.setFornecedor(1);
		produtos2.setPrecoCusto(new BigDecimal("7.60"));
		produtos2.setMargem(new BigDecimal("1.35"));
		produtos2.setPreco(new BigDecimal("10.25"));
		produtos2.setPrecoPromocao(new BigDecimal("8.74"));
		produtos2.setUsuario(1);
		
		Produtos produtos3 = new Produtos();
		produtos3.setCategoria(cat3);
		produtos3.setDescricao("COND SENDA 350ML CAMOMILA");
		produtos3.setCodProduto("7891242524");
		produtos3.setDataUltCompra(new Date());
		produtos3.setDataVencimento(new Date());
		produtos3.setEstoque("7");
		produtos3.setEstoqueMax("12");
		produtos3.setEstoqueMin("2");
		produtos3.setFornecedor(1);
		produtos3.setPrecoCusto(new BigDecimal("8.60"));
		produtos3.setMargem(new BigDecimal("1.35"));
		produtos3.setPreco(new BigDecimal("11.60"));
		produtos3.setPrecoPromocao(new BigDecimal("9.89"));
		produtos3.setUsuario(1);
		
		Produtos produtos4 = new Produtos();
		produtos4.setCategoria(cat3);
		produtos4.setDescricao("COND SENDA 350ML CERAMIDAS");
		produtos4.setCodProduto("7891242525");
		produtos4.setDataUltCompra(new Date());
		produtos4.setDataVencimento(new Date());
		produtos4.setEstoque("7");
		produtos4.setEstoqueMax("12");
		produtos4.setEstoqueMin("2");
		produtos4.setFornecedor(1);
		produtos4.setPrecoCusto(new BigDecimal("8.60"));
		produtos4.setMargem(new BigDecimal("1.35"));
		produtos4.setPreco(new BigDecimal("11.60"));
		produtos4.setPrecoPromocao(new BigDecimal("9.89"));
		produtos4.setUsuario(1);
		
		Produtos produtos5 = new Produtos();
		produtos5.setCategoria(cat2);
		produtos5.setDescricao("CREME PENTEAR SENDA 300ML CERAMIDAS");
		produtos5.setCodProduto("7891242533");
		produtos5.setDataUltCompra(new Date());
		produtos5.setDataVencimento(new Date());
		produtos5.setEstoque("7");
		produtos5.setEstoqueMax("12");
		produtos5.setEstoqueMin("2");
		produtos5.setFornecedor(1);
		produtos5.setPrecoCusto(new BigDecimal("8.60"));
		produtos5.setMargem(new BigDecimal("1.35"));
		produtos5.setPreco(new BigDecimal("11.60"));
		produtos5.setPrecoPromocao(new BigDecimal("9.89"));
		produtos5.setUsuario(1);
		
		Produtos produtos6 = new Produtos();
		produtos6.setCategoria(cat2);
		produtos6.setDescricao("CREME PENTEAR SENDA 300ML CAMOMILA");
		produtos6.setCodProduto("7891242532");
		produtos6.setDataUltCompra(new Date());
		produtos6.setDataVencimento(new Date());
		produtos6.setEstoque("7");
		produtos6.setEstoqueMax("12");
		produtos6.setEstoqueMin("2");
		produtos6.setFornecedor(1);
		produtos6.setPrecoCusto(new BigDecimal("8.60"));
		produtos6.setMargem(new BigDecimal("1.35"));
		produtos6.setPreco(new BigDecimal("11.60"));
		produtos6.setPrecoPromocao(new BigDecimal("9.89"));
		produtos6.setUsuario(1);
	
	
				
		
	    cat1.getProdutos().addAll(Arrays.asList(produtos1,produtos2));
	    cat2.getProdutos().addAll(Arrays.asList(produtos5,produtos6));
	    cat3.getProdutos().addAll(Arrays.asList(produtos3,produtos4));
	    
	    
		categoriasRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		produtosRepository.saveAll(Arrays.asList(produtos1, produtos2, produtos3, produtos4, produtos5, produtos6));
	}
}	
