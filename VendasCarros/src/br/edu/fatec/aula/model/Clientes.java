package br.edu.fatec.aula.model;
// Generated 02/12/2017 18:07:21 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.GenericGenerator;

/**
 * Clientes generated by hbm2java
 */
@Entity
@Table(name = "clientes")
public class Clientes implements java.io.Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer idclientes;
    @Column
    private String nome;
    @Column
    private String endereco;
    @Column
    private String rg;
    @Column
    private String cpf;
    @Column
    private String bairro;
    @Column
    private String cidade;
    @Column
    private String estado;
    @Column
    private String sexo;
    @Column
    private String civil;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date nascimento;
    @Column
    private String complemento;
    @Column
    private String cep;
    @Column
    private String telefone;
    @Column
    private String celular;
    @Column
    private String email;
    @Column
    private String ocupacao;
    @Column
    private Double salario;
    @Column
    private String orgao;
    @OneToMany
    @JoinTable(name="venda")
    @JoinColumn 
    private Set vendas = new HashSet(0);

    public Clientes() {
    }

    public Clientes(String nome, String endereco, String rg, String cpf, String bairro, String cidade, String estado, String sexo, String civil, Date nascimento, String complemento, String cep, String telefone, String celular, String email, String ocupacao, Double salario, String orgao, Set vendas) {
        this.nome = nome;
        this.endereco = endereco;
        this.rg = rg;
        this.cpf = cpf;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.sexo = sexo;
        this.civil = civil;
        this.nascimento = nascimento;
        this.complemento = complemento;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.ocupacao = ocupacao;
        this.salario = salario;
        this.orgao = orgao;
        this.vendas = vendas;
    }

    public Integer getIdclientes() {
        return this.idclientes;
    }

    public void setIdclientes(Integer idclientes) {
        this.idclientes = idclientes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCivil() {
        return this.civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }

    public Date getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOcupacao() {
        return this.ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getOrgao() {
        return this.orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public Set getVendas() {
        return this.vendas;
    }

    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }

}
