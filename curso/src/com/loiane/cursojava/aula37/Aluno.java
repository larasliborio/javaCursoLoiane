package com.loiane.cursojava.aula37;

public class Aluno extends Pessoa {
private String nome;
private String endereço;
private String cpf;
private String telefone;
private String curso;
private double [] notas;

public String getNome (){
    return nome;
}public void setNome(String Nome){
    this.nome=nome;
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

}
