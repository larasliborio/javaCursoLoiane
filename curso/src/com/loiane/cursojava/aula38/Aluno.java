package com.loiane.cursojava.aula38;

public class Aluno extends pessoa{
    private String nome;
    private String endereço;
    private String cpf;
    private String telefone;
    private String curso;
    private double [] notas;
    
public Aluno(){
    super();
}
public Aluno(String nome, String endereço, String telefone, String curso){
    this.nome=nome;
    this.endereço=endereço;
    this.telefone=telefone;
    this.curso=curso;
}


    public String getNome (){
        return nome;
    }public void setNome(String Nome){
        this.nome="Maria leonor";
    }
    public String getEndereço (){
        return endereço;
    }public void setEndereço(String Endereço){
        this.endereço=endereço;
    }
    public String getCpf (){
        return cpf;
    }public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getTelefone (){
        return telefone;
    }public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    public String getCurso (){
        return curso;
    }public void setCurso(String curso){
        this.curso=curso;
    }
    public  void  metodoQualquer(){
        super.setCpf("345345345345");
     this.setCpf("345345");
    }





    }
    
