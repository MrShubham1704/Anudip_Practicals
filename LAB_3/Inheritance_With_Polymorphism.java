package LAB_3;

//Class Document(Base class)
class Document {
	public void open() {
		System.out.println("Open method in Document Class");
	}
}

class WordDocument extends Document{
	// Implementing open() method for WordDocument
	@Override
	public void open() {
		System.out.println("Opening Word document...");
		// Logic to open a Word document
	}
}

class PDFDocument extends Document{
	// Implementing open() method for PDFDocument
	@Override
	public void open() {
		System.out.println("Opening PDF document...");
		// Logic to open a PDF document
	}
}

class SpreadsheetDocument extends Document{
	// Implementing open() method for SpreadsheetDocument
	@Override
	public void open() {
		System.out.println("Opening Spreadsheet document...");
		// Logic to open a Spreadsheet document
	}
}


public class Inheritance_With_Polymorphism {
	public static void main(String []args) {
		// Creating objects of different document types
		Document doc1 = new WordDocument();
		Document doc2 = new PDFDocument();
		Document doc3 = new SpreadsheetDocument();

		// Calling the open() method for each document
		doc1.open();
		doc2.open();
		doc3.open();
	}
}


