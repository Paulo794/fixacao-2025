package app;

public class Genero{
    private long id;
    private String nome;

    import java.lang.*;
    
    public void setid(long id) {
        if(id < 1){
            throw new IllegalArgumentsException("id inválido");
        }
        this.id = id;
    }

    public long getid(){
        return this.id;
    }

    public void setnome(String nome){
        this.nome = nome;
    }
    public String getnome(){
        return this.nome;
    }

    public Genero(long id ,String nome){
        this.setid(id);
        this.setnome(nome);
    }
    public Genero(){

    }

    }