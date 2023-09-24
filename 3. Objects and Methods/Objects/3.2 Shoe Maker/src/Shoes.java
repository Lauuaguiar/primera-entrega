public class Shoes {
   // Instance attributes
   private int size;
   private String color;

   public static void main(String[] args) {
      // I have brown moccasins size 31
      Shoes moccasins = new Shoes();
      moccasins.color = "brown";
      moccasins.size = 31;

      // I also have a pair of black boots size 32
      Shoes boots = new Shoes(); // Crear un objeto para las botas
      boots.color = "black"; // Establecer el color de las botas
      boots.size = 32; // Establecer el tamaño de las botas

      System.out.println("I have moccasins size " + moccasins.size);
      System.out.println("I also have " + boots.color + " boots.");
   }
}




