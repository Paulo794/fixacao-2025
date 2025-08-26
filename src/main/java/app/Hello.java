package app;

public class Hello {
    public static void main(String[] args) {
      //System.out.println("hello word");
      genero g = new genero(1, "Aventura");

      genero g2 = new genero (0,"");
      
      System.out.println(g.getnome());
      System.out.println(g2.getid());
    }
}

