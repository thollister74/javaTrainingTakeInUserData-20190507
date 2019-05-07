import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello, User. \nYou are going to be asked a few questions. \nPlease answer them.\n");

        System.out.println("Hello, User. \nEnter a word.\n");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();
        System.out.println(userInput);
        System.out.println(userInput.toUpperCase());
        System.out.println(userInput.toLowerCase());
        char selectedCharacter = userInput.charAt(3);
        System.out.println("The third character (starting at 0) of the entered string '"+userInput+"' is: " +selectedCharacter);


//*******Creating and and outputting simple 'user' information.*******//
//
//    UserInformation sterlingArcher = new UserInformation(35,
//            78,  "Sterming", "Archer",
//            Color.BLACK, Color.BLUE);
//
//    UserInformation lanaKane = new UserInformation(30,
//            75,  "Lana", "Kane",
//            Color.BLACK, Color.GREEN);
//
//    //Sterling's information
//    System.out.println("Sterling Archer's height is: " +sterlingArcher.userHeight + " inches.");
//    System.out.println("His hair is " +sterlingArcher.userHairColor+ " and his eyes are " +sterlingArcher.userEyeColor+".");
//    System.out.println("He is " +sterlingArcher.userAge+ " years old.\n");
//
//    //Lana's information
//        System.out.println("Lana Kane's height is: " +lanaKane.userHeight+ " inches.");
//        System.out.println("Her hair is " +lanaKane.userHairColor+ " and her eyes are " +lanaKane.userEyeColor+".");
//        System.out.println("She is " +lanaKane.userAge+ " years old.\n");

    }
}
