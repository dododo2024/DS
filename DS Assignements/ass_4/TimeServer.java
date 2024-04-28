import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class TimeServer {
    private List<Integer> clocks;

    public TimeServer(List<Integer> clocks) {
        this.clocks = clocks;
    }

    /**
     * The function synchronizes all clocks in a list by adjusting each clock to the average time.
     */
    public void synchronizeClocks() {
        int sum = 0;
        int average;

        // Calculate the sum of all clocks
        for (int clock : clocks) {
            sum += clock;
        }

        // Calculate the average clock time
        average = sum / clocks.size();

        // Adjust each clock to the average time
        for (int i = 0; i < clocks.size(); i++) {
            clocks.set(i, average);
        }
    }

    public List<Integer> getClocks() {
        return clocks;
    }
    
    // Entry point of the program
    /**
     * The function creates a list of clocks with their initial times provided by the user,
     * synchronizes them using the Berkeley algorithm, and prints the actual and synchronized clock times.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the initial times of clocks
        System.out.println("Enter the initial times of the clocks (in milliseconds):");
        List<Integer> clocks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Clock " + (i + 1) + ": ");
            int time = scanner.nextInt();
            clocks.add(time);
        }

        // Create a time server with the clocks
        TimeServer timeServer = new TimeServer(clocks);

        // Print the actual clock times before synchronization
        System.out.println("Actual Clock Times:");
        for (int clock : clocks) {
            System.out.println(clock);
        }
        
        System.out.println("");
        
        // Synchronize the clocks using the Berkeley algorithm
        timeServer.synchronizeClocks();

        // Get the synchronized clocks
        List<Integer> synchronizedClocks = timeServer.getClocks();

        // Print the synchronized clocks
        System.out.println("Synchronized Clock Times:");
        for (int clock : synchronizedClocks) {
            System.out.println(clock);
        }
        
        // Close the scanner
        scanner.close();
    }
}
