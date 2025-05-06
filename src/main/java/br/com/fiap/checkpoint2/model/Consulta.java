// package br.com.fiap.checkpoint2.model;

// import org.springframework.data.annotation.Id;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.ManyToOne;

// @Entity
// public class Consulta {
//     @Id
//     @GeneratedValue(strategy=GenerationType.AUTO)
//     private long id;
    
//     @ManyToOne
//     private Profissional profissional;

//     @ManyToOne
//     private Paciente paciente;

//     private String data_consulta;;
//     private String status_consulta;
//     private int quantidade_horas;
//     private double valor_consulta;
//     private String created_at;
//     private String updated_at;

//     public long getId() {
//         return id;
//     }
//     public void setId(long id) {
//         this.id = id;
//     }
//     public Profissional getProfissional() {
//         return profissional;
//     }
//     public void setProfissional(Profissional profissional) {
//         this.profissional = profissional;
//     }
//     public Paciente getPaciente() {
//         return paciente;
//     }
//     public void setPaciente(Paciente paciente) {
//         this.paciente = paciente;
//     }
//     public String getData_consulta() {
//         return data_consulta;
//     }
//     public void setData_consulta(String data_consulta) {
//         this.data_consulta = data_consulta;
//     }
//     public String getStatus_consulta() {
//         return status_consulta;
//     }
//     public void setStatus_consulta(String status_consulta) {
//         this.status_consulta = status_consulta;
//     }
//     public int getQuantidade_horas() {
//         return quantidade_horas;
//     }
//     public void setQuantidade_horas(int quantidade_horas) {
//         this.quantidade_horas = quantidade_horas;
//     }
//     public double getValor_consulta() {
//         return valor_consulta;
//     }
//     public void setValor_consulta(double valor_consulta) {
//         this.valor_consulta = valor_consulta;
//     }
//     public String getCreated_at() {
//         return created_at;
//     }
//     public void setCreated_at(String created_at) {
//         this.created_at = created_at;
//     }
//     public String getUpdated_at() {
//         return updated_at;
//     }
//     public void setUpdated_at(String updated_at) {
//         this.updated_at = updated_at;
//     }
// }
