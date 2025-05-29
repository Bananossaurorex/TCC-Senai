package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tab_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "Email é obrigatório")
    private String email;

    @NotBlank(message = "Telefone é obrigatorio.")
    private String telefone;

    @NotBlank(message = "Senha é obrigatorio.")
    private String senha;

   @Enumerated(EnumType.STRING)
    private maushabito mausHabito;

    @OneToOne(cascade = CascadeType.ALL)
    private Tarefa tarefa;

    public Usuario() {
    }

    public Usuario(String nome, String email, String telefone, String senha, maushabito mausHabito, Tarefa tarefa) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.mausHabito = mausHabito;
        this.tarefa = tarefa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Email é obrigatório") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email é obrigatório") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Telefone é obrigatorio.") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "Telefone é obrigatorio.") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "Senha é obrigatorio.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha é obrigatorio.") String senha) {
        this.senha = senha;
    }

    public maushabito getMausHabito() {
        return mausHabito;
    }

    public void setMausHabito(maushabito mausHabito) {
        this.mausHabito = mausHabito;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
}
