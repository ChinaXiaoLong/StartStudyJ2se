package day5;

public class TestBooks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book book = new Book();
		book.show();
		System.out.println("-----------------------------------");
		book.name = "java»ù´¡";
		book.pages = 100;
		book.price = 75;
		book.show();
	}

}
