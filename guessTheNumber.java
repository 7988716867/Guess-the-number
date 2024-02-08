import java.util.*;

public class guessTheNumber {

    public static void main(String[] args){

        int myNumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userInput=0;
        
        do {
            System.out.println("Guess the number: ");
            userInput=sc.nextInt();
            if (userInput==myNumber){
                System.out.println("Congrats you guessed right!");
                break;
            } else if (userInput>myNumber) {
                System.out.println("Guessed too large");
                
            }
            else if (userInput<myNumber){
                System.out.println("Guessed too small:");
            }
        }while(userInput>=0);

        System.out.print( "My number was: ");
        System.out.println(myNumber);
        
        
    }


}
