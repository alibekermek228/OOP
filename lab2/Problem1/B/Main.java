package Problem1.B;

public class Main {
    public static void main(String[] args){
        Book b1 = new Book("Harry Potter", "Rouling", 2001, 501);
        System.out.println(b1.isLongBook());
        System.out.println("This book is readen for " + b1.readingTime() + " minutes");
        Book b2 = new Book("Martin Iden", "Jack London", 1909, 499);
        System.out.println(b2);
        System.out.println(b2.readingTime());
    }
}
