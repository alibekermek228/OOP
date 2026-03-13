package Problem1.B;

public class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int publicationYear, int numberOfPages) {
        super(title, author, publicationYear);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double readingTime(){
        return numberOfPages * 1.5;
    }

    public boolean isLongBook(){
        return numberOfPages > 500;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pages: " + numberOfPages;
    }
}
