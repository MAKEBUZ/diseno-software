import java.util.Scanner;

class Publication{
    private String title;
    protected int price;

    public Publication(String title, int price){
        this.title = title;
        this.price = price;
    }

    public void show(){
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Book extends Publication{
    private int numPages;
    private int yearPublication;

    public Book(String title, int price, int numPages, int yearPublication){
        super(title, price);
        this.numPages = numPages;
        this.yearPublication = yearPublication;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Number of pages: " + numPages);
        System.out.println("Year of publication: " + yearPublication);
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}

class Disk extends Publication{
    private float duration;

    public Disk(String title, int price, float duration){
        super(title, price);
        this.duration = duration;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Duration: " + duration + " minutes");
    }
}

public class editorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title;
        int price, numPages, yearPublication;
        float duration;

        System.out.println("Enter the title of the book: ");
        title = sc.nextLine();
        System.out.println("Enter the price of the book (USD): ");
        price = sc.nextInt();
        System.out.println("Enter the number of pages of the book: ");
        numPages = sc.nextInt();
        System.out.println("Enter the year of publication of the book: ");
        yearPublication = sc.nextInt();

        Book book = new Book(title, price, numPages, yearPublication);

        System.out.println("||||||||||||||||||||||||||||||||||||||||");

        System.out.println("Enter the title of the disk: ");
        sc.nextLine();
        title = sc.nextLine();
        System.out.println("Enter the price of the disk (USD): ");
        price = sc.nextInt();
        System.out.println("Enter the duration of the disk (Minutes): ");
        duration = sc.nextFloat();

        Disk disk = new Disk(title, price, duration);

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
        book.show();
        System.out.println();
        disk.show();
    }
}