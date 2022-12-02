package principal;

//classe professor com os atributos//
public class Professor {
    private String nome2;
    private String turno;
    private String aula;
    private String franquia;
    private String data;
    private int id;
    
    //metodo professor sem parametro(vazio)//
    public Professor(){
        
    }

    //metodo professor com parametro//
     Professor(String nome2, String turno, String aula, String franquia, String data,int id) {
        this.nome2 = nome2;
        this.turno = turno;
        this.aula = aula;
        this.franquia = franquia;
        this.data = data;
        this.id = id;
    }

     //getters e setters//
    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getFranquia() {
        return franquia;
    }

    public void setFranquia(String franquia) {
        this.franquia = franquia;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    //metodo listar para exibir alguns atributos para o usuario quando ele solicitar a listagem dos professores//
    void listar(){
        System.out.println(" \tId:" + this.id + "\tNome: " + this.nome2 + " \tAula: " + this.aula + "\tTurno "  + this.turno);

          
}
}
