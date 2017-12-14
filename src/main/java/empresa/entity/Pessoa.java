/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.entity;

/**
 *
 * @author Paty
 */
public class Pessoa {
    
    
    private String nome;
    private String sobrenome;
    private String endereco;
    private int codigo;
    
    public Pessoa(){
        
    }

    public Pessoa(String nome, String sobrenome, String endereco, int codigo) {
        
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.codigo = codigo;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String sucesso(){
        
        return "Cliente cadastrado com sucesso!!";
    }
}
