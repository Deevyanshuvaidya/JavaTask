public class Stringreverse{
    public static String rev(String input){
        String rev = "";

        for(int i = input.length()-1;i>=0;i--){
            rev = rev + input.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args){
        String str = "Deevanshu";
        System.out.println("Before Reversed : "+str);
        System.out.println("After Reversed : "+rev(str));
    }
}