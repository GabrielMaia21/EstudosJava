package principal;
//classe aluno com os atributos//
public class Aluno extends Usuario {
     private String objetivo;
     private double altura;
     private double peso;
     private int idade;
     private String nivel;
     
     
     //metodo aluno sem parametro(vazio)//
    
     public Aluno() {    
        
    }

    //metodo aluno com parametros //
    Aluno(String nome, String cpf, String objetivo, double peso, double altura, int idade, String telefone, int id, String bairro, String nivel) {
        super( nome, cpf, telefone, id, bairro);
        this.objetivo = objetivo;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.nivel = nivel;
    }



     //getters e setters//
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return nivel;
    }

    public void setTipo(String tipo) {
        this.nivel = tipo;
    }
     

    //metodo listar para exibir alguns atributos para o usuario quando ele solicitar a listagem dos alunos//
    void listar(){
        System.out.println(" \tId:" + this.id + "\tNome: " + this.nome + " \tCpf: " + this.cpf + "\tObjetivo: " + this.objetivo);
        
        
    }

     
}
