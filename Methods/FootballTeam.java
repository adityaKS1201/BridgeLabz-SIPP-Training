public class FootballTeam {

   
    public static int getSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    
    public static double getMean(int[] heights) {
        return getSum(heights) / (double) heights.length;
    }

   
    public static int getShortest(int[] heights) {
        int min = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < min) {
                min = heights[i];
            }
        }
        return min;
    }

        public static int getTallest(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];

        System.out.println("Player Heights:");
        for (int i = 0; i < heights.length; i++) {
            
            heights[i] = (int)(Math.random() * 101) + 150;  
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        System.out.println("Shortest height: " + getShortest(heights) + " cm");
        System.out.println("Tallest height: " + getTallest(heights) + " cm");
        System.out.println("Mean height: " + getMean(heights) + " cm");
    }
}
