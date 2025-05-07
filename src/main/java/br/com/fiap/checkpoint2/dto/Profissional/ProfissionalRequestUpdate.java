package br.com.fiap.checkpoint2.dto.Profissional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.fiap.checkpoint2.model.Profissional;

public class ProfissionalRequestUpdate {
    private String nome;
    private String especialidade;
    private BigDecimal valor_hora;
    private LocalDateTime updated_at;

    public Profissional toModel(Profissional profissional){
        profissional.setNome(this.nome);
        profissional.setEspecialidade(this.especialidade);
        profissional.setValor_hora(this.valor_hora);
        profissional.setUpdated_at(this.updated_at);
        return profissional;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public BigDecimal getValor_hora() {
        return valor_hora;
    }
    public void setValor_hora(BigDecimal valor_hora) {
        this.valor_hora = valor_hora;
    }
    public LocalDateTime getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
    
}
