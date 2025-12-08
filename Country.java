import java.util.HashMap;
import java.util.Map;

public class Country{
    public static void main(String args[]){
        HashMap<String,String> capitals = new HashMap<>();

        capitals.put("India","New Delhi");
        capitals.put("USA","Washington D.C.");
        capitals.put("Japan","Tokyo");

        System.out.println("Country - Capital: ");

        for(Map.Entry<String,String>entry : capitals.entrySet()){
            System.out.println(entry.getKey()+" : " + entry.getValue());
        }
    }
}