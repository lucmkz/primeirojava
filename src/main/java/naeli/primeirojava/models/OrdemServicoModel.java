package naeli.primeirojava.models;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class OrdemServicoModel {

    private Long id;
    private ClienteResumoModel cliente;
    private String descricao;
    private BigDecimal preco;
    private StatusOrdemServico status;
    private OffsetDateTime dataAbertura;
    private OffsetDateTime dataFinalizada;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return this.preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public StatusOrdemServico getStatus() {
        return this.status;
    }

    public void setStatus(StatusOrdemServico status) {
        this.status = status;
    }

    public OffsetDateTime getDataAbertura() {
        return this.dataAbertura;
    }

    public void setDataAbertura(OffsetDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public OffsetDateTime getDataFinalizada() {
        return this.dataFinalizada;
    }

    public void setDataFinalizada(OffsetDateTime dataFinalizada) {
		this.dataFinalizada = dataFinalizada;
    }
    public ClienteResumoModel getCliente() {
        return this.cliente;
    }

    public void setCliente(ClienteResumoModel cliente) {
        this.cliente = cliente;
    }
}    
