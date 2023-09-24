import java.util.ArrayList;

public class AverageCalculator {
    public static double getAverageOf(ArrayList<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty or null");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        double average = getAverageOf(numbers);
        System.out.println("Average: " + average);
    }
}
