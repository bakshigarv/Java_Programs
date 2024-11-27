import java.util.Scanner;

class Userinput{
    public static void main(String[]args){
        
    Scanner input = new Scanner(System.in); // Create a Scanner Object

    System.out.println("Enter your name: "); // Output the prompt
    
    String line = input.nextLine(); // Reads user input

    System.out.println("Your name is: " + line); // Output user input
    }
}