package object2;


public class Test04 {
    public static void main(String[] args) {
        Example e1 = new Example(); // Object1

        for (int i = 1; i <= 10; i++) {
            Example e2 = new Example(); // Objects created inside the loop
        }

        Example e3;
        for (int i = 1; i <= 10; i++) {
            e3 = new Example(); // Objects created inside the loop
        }

        Example e4 = null;
        for (int i = 1; i <= 5; i++) {
            e4 = new Example(); // Objects created inside the loop
        }
        System.out.println(e4);

        System.out.println();
        System.gc(); // Suggests garbage collection
        try {
            Thread.sleep(500); // Pauses execution for 0.5 seconds
        } catch (Exception e) { }

        // Print the counts of objects created and destroyed
        System.out.println("Objects Created: " + Example.getCreatedCount());
        System.out.println("Objects Destroyed: " + Example.getDestroyedCount());
    }
}