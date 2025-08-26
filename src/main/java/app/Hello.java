package app;

public class Hello {
    public static void main(String[] args) {
      //System.out.println("hello word");
      //genero g = new genero(1, "Aventura");

      //genero g2 = new genero (0,"");
      
      //System.out.println(g.getnome());
      //System.out.println(g2.getid());

      Genero policial = new Genero(1,"Policial");
      Genero aventura = new Genero(2, "Aventura");
      Genero terror = new Genero(3,"Terror");

      Filme f1 = new Filme();
      f1.setid(1);
      f1.setTitulo("A Sociedade do Anel");
      f1.setGenero(aventura);

      Filme f2 = new Filme(2,"Duna",aventura);
      Filme f3 = new Filme(3,"Entre Facas e Segredos", policial);
      

      System.out.println(f1.getTitulo());
      System.out.println(f2.getTitulo());
      System.oout.println(f3.getTitulo());
    }
}

