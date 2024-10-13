import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lb = 1;
        int ub = 100;
        String playAgain;
        Random random = new Random();
        do{
        int ran = random.nextInt(ub - lb + 1) + lb;
        System.out.println("Random number is generated....Let's start");
        game(sc,ran);
        System.out.println("Do you want to play another time (yes / no) ?");
        playAgain = sc.next();
        }while(playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing..");
        sc.close();
        
    }
    static void game(Scanner sc,int ran){
        
        int limit = 3;
        int s = 0;
        System.out.println("you have  "+limit+" attempts..All the best..");
        for(int i=0;i<limit;i++){
            if(i != 0)
            System.out.println("you have "+(limit-i)+" attempts remaining.");
            int num=0;
            System.out.println("Guess a number:");
            while(!sc.hasNextInt()){
                System.out.println("Enter valid number...");
                sc.next();
            }
            num = sc.nextInt();
    
            System.out.println("You entered a valid number...Thank you..!\n");
    
            if(ran == num){
                System.out.println("You guessed the number right....Congrats");
                s = Score(i+1);
                System.out.println("Your score: "+s);
                return;
            }
            else if(num > ran){
                System.out.println("You guessed the number TOO HIGH...\n");
            }
            else if(num < ran){
                System.out.println("You guessed the number TOO LOW...\n");
            }
        }
           System.out.println("Sorry...You have used all attempts..");
           System.out.println("Correct number is: "+ran);
           System.out.println("Your score: "+s);
    }


    static int Score(int attempt){
        switch(attempt){
            case 1:return 100;
            case 2:return 50;
            case 3:return 25;
            default:return 0;
        }
        
    }
    
}
