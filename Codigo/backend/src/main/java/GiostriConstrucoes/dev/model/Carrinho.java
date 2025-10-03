package GiostriConstrucoes.dev.model;

import GiostriConstrucoes.dev.model.util.GerenciavelSimples;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "carrinho")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Carrinho extends GerenciavelSimples {
    @OneToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "carrinho", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<ItemDeCarrinho> itens;

    //Este metódo percorre a lista de itens para calcular o total toda vez que é chamado
    //e isso pode ser ineficiente em cenários com muitos itens no carrinho;
    //o ideal seria armazenar o valor total como um atributo da classe e atualizá-lo sempre que itens forem adicionados,
    //removidos ou alterados
    public double valorTotal(){
        double resposta = 0;

        for(ItemDeCarrinho itemDeCarrinho : itens){
            resposta += itemDeCarrinho.valorTotal();
        }

        return resposta;
    }

}