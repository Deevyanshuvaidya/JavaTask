class Book{
    String title;
    String author;

    Book (String title, String author){
        this.title = title;
        this.author = author;
    }

    void displayinfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
}

public class Main{
    public static void main(String args[]){
        Book mybook = new Book("Mindset", "Dr Carol S. Dweck");

        mybook.displayinfo();
    }
}