
package sistemaflf;

import java.util.ArrayList;

public class Aluno {
    
    private String nome; 
    private String cpf;
    private String matricula; 
    private String endereço; 
    private String email; 
    private String telefone; 
    private String situação; 
    private String curso; 
    ArrayList<String> disciplinas = new ArrayList<String>();

    
    // CONSTRUTOR DA CLASSE ALUNO 

    public Aluno(String nome, String cpf, String matricula, String endereço, String email, String telefone, String situação, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.endereço = endereço;
        this.email = email;
        this.telefone = telefone;
        this.situação = situação;
        this.curso = curso;
    }
  
    
    
    //METÓDOS GETTERS E SETTERS DA CLASSE ALUNO 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
   
    
    public void statusAluno(){
        System.out.println("Nome do aluno: "+ this.nome);
        System.out.println("Matricula: "+ this.matricula);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereço);
    }
    
}
