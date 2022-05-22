
package classes;

import java.util.Date;


public class Cliente {
    
    private String idCliente; 
    private String nome; 
    private String SNome; 
    private Date Nascimento; 
    private String endereço; 
    private int telefone; 
    private int idTipo; 
    private int estado; 
    private int idcidade; 
    private String Data; 

    public Cliente(String idCliente, String nome, String SNome, Date Nascimento, 
            String endereço, int telefone, int idTipo, int estado, int idcidade, String Data) {
	this.idCliente = idCliente;
	this.nome = nome;
	this.SNome = SNome;
	this.Nascimento = Nascimento;
	this.endereço = endereço;
	this.telefone = telefone;
	this.idTipo = idTipo;
	this.estado = estado;
	this.idcidade = idcidade;
	this.Data = Data;
    }

    public String getIdCliente() {
	return idCliente;
    }

    public void setIdCliente(String idCliente) {
	this.idCliente = idCliente;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getSNome() {
	return SNome;
    }

    public void setSNome(String SNome) {
	this.SNome = SNome;
    }

    public Date getNascimento() {
	return Nascimento;
    }

    public void setNascimento(Date Nascimento) {
	this.Nascimento = Nascimento;
    }

    public String getEndereço() {
	return endereço;
    }

    public void setEndereço(String endereço) {
	this.endereço = endereço;
    }

    public int getTelefone() {
	return telefone;
    }

    public void setTelefone(int telefone) {
	this.telefone = telefone;
    }

    public int getIdTipo() {
	return idTipo;
    }

    public void setIdTipo(int idTipo) {
	this.idTipo = idTipo;
    }

    public int getEstado() {
	return estado;
    }

    public void setEstado(int estado) {
	this.estado = estado;
    }

    public int getIdcidade() {
	return idcidade;
    }

    public void setIdcidade(int idcidade) {
	this.idcidade = idcidade;
    }

    public String getData() {
	return Data;
    }

    public void setData(String Data) {
	this.Data = Data;
    }
    
}
