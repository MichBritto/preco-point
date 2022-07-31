package br.com.precopoint.mvc.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Produto {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String nomeProduto;
    private Long qtdeEstoque;
    private String descricaoProduto;
    private BigDecimal valorProduto;
    private String imgProduto;
    @ManyToOne
    private Categoria categoria;
    @ManyToOne
    private Fornecedor fornecedor;

}
