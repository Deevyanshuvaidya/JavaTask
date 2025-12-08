class Book{
    private String title;
    private String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title= title;
    }

    void displayinfo(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
    }
}

public class Main{
    public static void main(String args[]){
        Book mybook = new Book("The Alchemist", "Paulo Coelho");
        mybook.displayinfo();

        mybook.setTitle("Brida");

        System.out.println("\n Updated book info");
        mybook.displayinfo();
    }
}