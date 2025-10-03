package GiostriConstrucoes.dev.model.enums;

public enum EPedidoStatus {
    PENDENTE("pendente"),
    PROCESSANDO("processando"),
    ENVIADO("enviado"),
    ENTREGUE("entregue"),
    CANCELADO("cancelado");

    //Esse campo status não é utilizado, e pode ser removido.
    private String status;

    EPedidoStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
