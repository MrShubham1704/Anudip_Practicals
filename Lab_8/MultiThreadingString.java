package Lab_8;

class MultiThreadingString extends Thread {
    private String message;

    // Constructor to initialize the message
    public MultiThreadingString(String message) {
        this.message = message;
    }

    // Override the run method to define the behavior of the thread
    @Override
    public void run() {
        // Print the message (in this case, a single character)
        System.out.print(message);
    }

    public static void main(String[] args) {
        // The message to be printed using multiple threads
        String message = "multi threads";

        // Create an array to hold the threads
        MultiThreadingString[] threads = new MultiThreadingString[message.length()];

        // Loop through each character in the message string
        for (int i = 0; i < message.length(); i++) {
            // Create a new thread for each character
            threads[i] = new MultiThreadingString(String.valueOf(message.charAt(i)));
            // Start the thread, which will execute the run method
            threads[i].start();
        }

        // Ensure all threads complete before main exits
        for (int i = 0; i < message.length(); i++) {
            try {
                // Wait for the thread to finish
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
