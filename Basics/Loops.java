public class Loops {
    public static void main(String[] args) {
        // For Loop Example
        System.out.println("For Loop - Printing 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
        
        // While Loop Example
        System.out.println("\nWhile Loop - Printing table of 2:");
        int j = 1;
        while (j <= 5) {
            System.out.println("2 x " + j + " = " + (2 * j));
            j++;
        }
        
        // Do-While Loop Example
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 3);
    }
}
