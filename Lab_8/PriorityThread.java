package Lab_8;


//Extending the Thread class to demonstrate thread priorities
class PriorityThread extends Thread {
	// Constructor to set the thread name
	public PriorityThread(String name) {
		super(name);
	}

	// Override the run method to define the behavior of the thread
	@Override
	public void run() {
		// Print the name of the thread and its priority
		System.out.println(getName() + " is running with priority " + getPriority());
	}

	public static void main(String[] args) {
		// Create three threads with different names
		PriorityThread t1 = new PriorityThread("Low Priority Thread");
		PriorityThread t2 = new PriorityThread("Medium Priority Thread");
		PriorityThread t3 = new PriorityThread("High Priority Thread");

		// Set the priority of each thread
		t1.setPriority(Thread.MIN_PRIORITY);  // Set priority to 1 (lowest priority)
		t2.setPriority(Thread.NORM_PRIORITY); // Set priority to 5 (normal priority)
		t3.setPriority(Thread.MAX_PRIORITY);  // Set priority to 10 (highest priority)

		// Start each thread
		t1.start();
		t2.start();
		t3.start();
	}
}
