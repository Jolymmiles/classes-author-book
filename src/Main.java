import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя автора: ");
        String authorName = scanner.nextLine();

        System.out.print("Введите почту автора: ");
        String authorMail = scanner.nextLine();

        System.out.print("Введите пол автора: ");
        char authorGender = scanner.nextLine().charAt(0);

        System.out.print("Введите название книги: ");
        String bookName = scanner.nextLine();

        System.out.print("Введите стоимость книги: ");
        double bookPrice = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите qty: ");
        int bookQty = Integer.parseInt(scanner.nextLine());

        Author author = new Author(authorName, authorMail, authorGender);
        Book book = new Book(bookName, author, bookPrice, bookQty);

        System.out.println(book);



    }
}
