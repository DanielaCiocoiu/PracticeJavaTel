package Hackerrank.Day_13_Abstract_Classes;

public class MyBook extends Book{

    private int price;

    public MyBook(String $title, String $author, int $price) {
        super($title,$author);
        this.price=$price;
    }



    @Override
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

}
