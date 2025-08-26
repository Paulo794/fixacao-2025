package app;

public class Filme{
    private long id;
    private String titulo;
    private Genero genero;

    public void setid(long id){
        this.id = id;
    }
    public long getid(){
        return this.id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Genero getGenero(){
        return this.genero;

    }

    public Filme(long id , String titulo, Genero genero){
        this.setid(id);
        this.setTitulo(titulo);
        this.setGenero(genero);
    }

    public Filme() {}

    @Override
    public String toString(){
        return this.titulo + "(" + this.getGenero().getNome() +")";
    }


}