package Lab_7;

 // Custom exception class
class InvalidEmailException extends Exception {
    // Constructor that accepts a message
    public InvalidEmailException(String message) {
        super(message);
    }
}

