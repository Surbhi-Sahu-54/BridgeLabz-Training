public class Height {

    // Method to generate random heights between 150 and 250 cm
    public static int[] generateHeights(int size) {

        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            // random height from 150 to 250
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        return heights;
    }

    // Method to find sum of heights
    public static int findSum(int[] heights) {

        int sum = 0;

        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }

        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {

        int sum = findSum(heights);
        double mean = (double) sum / heights.length;

        return mean;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {

        int min = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < min) {
                min = heights[i];
            }
        }

        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {

        int max = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        // array size = 11 players
        int[] heights = generateHeights(11);

        // display all heights
        System.out.println("Heights of football team players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i]);
        }

        // find results
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // display results
        System.out.println("\nTotal Height = " + sum + " cm");
        System.out.println("Mean Height = " + mean + " cm");
        System.out.println("Shortest Height = " + shortest + " cm");
        System.out.println("Tallest Height = " + tallest + " cm");
    }
}
