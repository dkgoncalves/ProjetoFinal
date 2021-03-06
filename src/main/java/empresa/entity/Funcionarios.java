package empresa.entity;
// Generated 09/12/2017 14:37:02 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Funcionarios generated by hbm2java
 */
public class Funcionarios extends Pessoa implements java.io.Serializable {
        Pessoa f = new Pessoa();
        BigDecimal salario;
        private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
        
    public Funcionarios() {
    }

    public Funcionarios(String nome, String sobrenome, String endereco, int codigo, BigDecimal salario) {
        super(nome, sobrenome, endereco, codigo);
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    
    @Override
    public String sucesso(){
        
        return "Funcionário cadastrado com sucesso";
    }



}


