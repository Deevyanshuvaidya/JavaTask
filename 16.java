public class Main{
    public static int divide(int a,int b){
        int result =0;
        try{
            result = a/b;
        }

        catch(ArithmeticException e){
            System.out.println("Error : Cannot divide by zero.!");
        }

        return result;
    }

    public static void main(String args[]){
        int num1 = 10;
        int num2= 0;

        int output = divide(num1,num2);

        System.out.println("Result: "+ output);
    }
}