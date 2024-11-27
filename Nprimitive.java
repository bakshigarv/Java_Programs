public class Nprimitive{
    public static void main(String[]args){

        String text = "Hello";
        
        String blank = " ";

        String name = "John";

        String greeting = text + blank + name;

        int x = 20;

        int y = 30;

        int z = x + y;

        System.out.println(greeting);
        
        System.out.println(text + " " + name);
        
        System.out.println(text.concat(name)); //We can also use .concat instead of + operator.

        System.out.println(z); //In Case of Numbers + operator works for Addition.
    }
}