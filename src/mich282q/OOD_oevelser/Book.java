package mich282q.OOD_oevelser;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty =0;

    public Book (String name, Author[] authors, double price) {

        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book (String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;

    }
    public Author[] getAuthors(){
        return this.authors;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getqty(){
        return this.qty;
    }
    public void setqty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name= " +name + ", "+  authors + "  price="+ price +
                ", qty = " + qty;
    }

    public Author[] getAuthorNames(){
        return this.authors;
    }
}
