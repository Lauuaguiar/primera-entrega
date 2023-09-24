public class Person {
   // Atributos de cada objeto Person
   private int yearBorn;
   private int yearDeceased;
   private String name;

   // Constructor
   public Person(String named, int born, int died) {
      name = named;
      yearBorn = born;
      yearDeceased = died;
   }

   // Método de instancia (objeto)
   public void epitaph() {
      int age = yearDeceased - yearBorn;
      System.out.println(name + " lived to an age of " + age);
   }

   public static void main(String[] args) {
      Person grandma = new Person("Mary", 1932, 1999);
      grandma.epitaph(); // Aplicar el método al objeto grandma
   }
}
