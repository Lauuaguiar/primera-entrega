public class HundredthPrime
{
   public static void main(String[] args)
   {

      int contador = 0; // Inicializamos el contador de números primos.
      int numero = 2; // Empezamos desde el primer número primo.

      while (contador < 100) { // Buscamos el número primo número 100.
         if (esPrimo(numero)) {
            contador++;
            if (contador == 100) {
               System.out.println(numero);
            }
         }
         numero++;
      }
   }

   // Función para verificar si un número es primo.
   public static boolean esPrimo(int num) {
      if (num <= 1) {
         return false;
      }
      for (int i = 2; i <= Math.sqrt(num); i++) {
         if (num % i == 0) {
            return false;
         }
      }
      return true;
        }
}