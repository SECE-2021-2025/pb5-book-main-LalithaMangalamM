import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        scanner.nextLine(); 
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        Book book1 = new Book(bookId, title, author, price);

        System.out.println(book1.toString());

        Book book2 = new Book();

        book2.setBookId(123);
        book2.setTitle("Introduction to Java Programming");
        book2.setAuthor("John Doe");
        book2.setPrice(39.99);

        System.out.println(book2.toString());
    }
}
