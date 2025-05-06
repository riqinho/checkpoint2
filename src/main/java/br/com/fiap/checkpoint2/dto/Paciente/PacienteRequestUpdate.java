package br.com.fiap.checkpoint2.dto.Paciente;

import br.com.fiap.checkpoint2.model.Paciente;

public class PacienteRequestUpdate {
    private String nome;
    private String endereco;
    private String bairro;
    private String email;
    private String telefone_completo;
    private String data_nascimento;
    // private String created_at;
    // private String updated_at;

    public Paciente toModel(Paciente paciente){
        paciente.setNome(this.nome);
        paciente.setEndereco(this.endereco);
        paciente.setBairro(this.bairro);
        paciente.setEmail(this.email);
        paciente.setTelefone_completo(this.telefone_completo);
        paciente.setData_nascimento(this.data_nascimento);
        return paciente;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone_completo() {
        return telefone_completo;
    }
    public void setTelefone_completo(String telefone_completo) {
        this.telefone_completo = telefone_completo;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

}
