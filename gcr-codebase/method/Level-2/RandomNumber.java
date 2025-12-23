public class RandomNumber {

    // Method to generate array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            // generate 4-digit random number (1000 to 9999)
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, minimum and maximum
    // returns array: [average, min, max]
    public double[] findAverageMinMax(int[] numbers) {

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];

            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        RandomNumberStats obj = new RandomNumberStats();

        // generate 5 random numbers
        int[] randomNumbers = obj.generate4DigitRandomArray(5);

        // display generated numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }

        // find average, min and max
        double[] result = obj.findAverageMinMax(randomNumbers);

        System.out.println("\nAverage = " + result[0]);
        System.out.println("Minimum = " + (int) result[1]);
        System.out.println("Maximum = " + (int) result[2]);
    }
}
