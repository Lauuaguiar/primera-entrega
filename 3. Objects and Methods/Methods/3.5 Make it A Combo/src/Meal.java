public class Meal {
    // Atributos de instancia
    private String name;
    private double cost;

    // Constructor de la clase
    public Meal(String food, double price) {
        name = food;
        cost = price;
    }

    // Método para convertir la comida en combo
    public void makeItACombo() {
        name = name + " with fries and soda";
        cost += 3.0;
    }

    // Método para obtener la factura (bill)
    public String getBill() {
        return name + ", $" + cost;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Meal burgerMeal = new Meal("Burger", 6.99);
        burgerMeal.makeItACombo();
        String bill = burgerMeal.getBill();
        System.out.println(bill); // Debería imprimir "Burger with fries and soda, $9.99"
    }
}
