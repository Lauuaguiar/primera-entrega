public class Sheep {
    static int count; // No se establece como privado

    // Constructor
    public Sheep() {
        // Incrementar el contador cada vez que se crea una nueva oveja
        count++;
    }

    public static void main(String[] args) {
        // Ejemplo de uso: Crear tres ovejas
        Sheep sheep1 = new Sheep();
        Sheep sheep2 = new Sheep();
        Sheep sheep3 = new Sheep();

        // Imprimir el número de ovejas creadas
        System.out.println("Número total de ovejas creadas: " + count); // Debería imprimir "Número total de ovejas creadas: 3"
    }
}
