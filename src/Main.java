import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       String useranswer="";
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> movieList = new ArrayList<String>();

        do {
            System.out.println("Enter a name of a movie to add to the movielist");
            String userInput = keyboard.nextLine();
            movieList.add(userInput);
            System.out.println("To quit? If yes, type q to quit. Or,press any key to continue");
            useranswer=keyboard.nextLine();


        }while (!useranswer.equalsIgnoreCase("q"));

        Collections.sort(movieList);

        System.out.println("The movie list in alphabetical order: " +movieList);


    }
}

//Some movies names: Ben Hur, Star Wars, Fantasia, Casine Royale, Captain America, Forest Gump