import java.util.ArrayList;

public class Namefiltera{
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<>();

        names.add("Deevanshu");
        names.add("Saad");
        names.add("Aniket");
        names.add("Swaroop");
        names.add("Ketan");

        System.out.println("Names starting with 'S' : ");

        for (String name:names){
            if(name.startsWith("S")){
                System.out.println(name);
            }
        }
    }
}