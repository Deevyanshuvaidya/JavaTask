import java.io.FileWriter;
import java.io.IOException;

public class Writetofile{
    public static void main(String args[]){
        try{
            FileWriter writer = new FileWriter("assignment_output.txt");

            writer.write("Hello my name is Deevanshu.");

            writer.close();

            System.out.println("File write successful");
        }

        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}