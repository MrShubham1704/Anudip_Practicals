package Lab_8;


//Extending the Thread class to create a custom thread
class ThreadExample extends Thread {
// Constructor to set the thread name
public ThreadExample(String name) {
   super(name);
}

// Override the run method to define the thread's behavior
@Override
public void run() {
   try {
       // Loop to print the thread name and count from 1 to 5
       for (int i = 1; i <= 5; i++) {
           System.out.println(getName() + ": " + i);
           // Pause the thread for 500 milliseconds (0.5 seconds) between prints
           Thread.sleep(500);
       }
   } catch (InterruptedException e) {
       // Handle the interrupted exception if the thread is interrupted during sleep
       e.printStackTrace();
   }
}

public static void main(String[] args) {
   // Create and start three threads with different names
   Thread t1 = new ThreadExample("Thread 1");
   Thread t2 = new ThreadExample("Thread 2");
   Thread t3 = new ThreadExample("Thread 3");

   t1.start(); // Start the first thread
   t2.start(); // Start the second thread
   t3.start(); // Start the third thread
}
}

