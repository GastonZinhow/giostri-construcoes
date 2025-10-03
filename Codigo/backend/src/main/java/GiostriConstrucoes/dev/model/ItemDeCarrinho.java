package GiostriConstrucoes.dev.model;

import GiostriConstrucoes.dev.model.util.GerenciavelSimples;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ItemDeCarrinho")
public class ItemDeCarrinho extends GerenciavelSimples {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "carrinho_id")
    private Carrinho carrinho;

    @Column(name = "quantidade")
    private int quantidade;

    //Este método pode lançar exceções se o preço do produto for nulo;
    //o ideal seria adicionar uma validação para garantir que o preço não seja nulo.
    public double valorTotal(){
        return quantidade * produto.getPreco();
    }

}
