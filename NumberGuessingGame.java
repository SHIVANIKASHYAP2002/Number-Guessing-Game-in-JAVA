import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    static int higher=0;
    static int lower=0;
    static int score =0;
    public static void main(String[] args) {
        NumberGuessingGame.round1();
        System.out.println("GAME OVER");
        System.out.println("YOUR SCORE =  "+score);
    }
    public static void round1(){
        higher=10;
        lower=1;
        System.out.println("ROUND 1 -----total choice=3");
        System.out.println();
        System.out.println("GUESS THE NUMBER BETWEEN 1 to 10");
        int choice =3;
        Random random=new Random();
        int game_number=random.nextInt(higher)+lower;
        boolean flag= false;
        while(choice!=0){
            int user_choice=takeInput();
            if(user_choice==-1){
                System.out.println("You loss a chance");
                choice--;
                continue;
            }
            if(user_choice==game_number){
                System.out.println("CORRECT GUESS , guess_number="+game_number);
                flag=true;
                break;
            }
            else if(user_choice>game_number){
                System.out.println("****************GUESS LOWER VALUE*************");
            }
            else{
                System.out.println("*****************GUESS HIGHER VALUE*****************");
            }
            choice--;
        }
        if(flag==true){
            score+=100;
            NumberGuessingGame.round2();
        }
        else{
            System.out.println("THE NUMBER IS   "+game_number);
        }
        return;

    }
    public static void round2(){
        higher=50;
        lower=1;
        System.out.println("ROUND 2-----total choice=5");
        System.out.println();
        System.out.println("GUESS THE NUMBER BETWEEN 1 to 50");
        int choice =5;
        Random random=new Random();
        int game_number=random.nextInt(higher)+lower;
        boolean flag= false;
        while(choice!=0){
            int user_choice=takeInput();
            if(user_choice==-1){
                System.out.println("You loss a chance");
                choice--;
                continue;
            }
            if(user_choice==game_number){
                System.out.println("CORRECT GUESS , guess_number="+game_number);
                flag=true;
                break;
            }
            else if(user_choice>game_number){
                System.out.println("****************GUESS LOWER VALUE*************");
            }
            else{
                System.out.println("*****************GUESS HIGHER VALUE*****************");
            }
            choice--;
        }
        if(flag==true){
            score+=200;
            NumberGuessingGame.round3();
        }
        else{
            System.out.println("THE NUMBER IS   "+game_number);
        }
        return;

    }
    public static void round3(){
        higher=100;
        lower=1;
        System.out.println("ROUND 1 -----total choice=7");
        System.out.println();
        System.out.println("GUESS THE NUMBER BETWEEN 1 to 100");
        int choice =7;
        Random random=new Random();
        int game_number=random.nextInt(higher)+lower;
        boolean flag= false;
        while(choice!=0){
            int user_choice=takeInput();
            if(user_choice==-1){
                System.out.println("You loss a chance");
                choice--;
                continue;
            }
            if(user_choice==game_number){
                System.out.println("CORRECT GUESS , guess_number="+game_number);
                flag=true;
                break;
            }
            else if(user_choice>game_number){
                System.out.println("****************GUESS LOWER VALUE*************");
            }
            else{
                System.out.println("*****************GUESS HIGHER VALUE*****************");
            }
            choice--;
        }
        if(flag==true){
            score+=500;
            NumberGuessingGame.round2();
        }
        else{
            System.out.println("THE NUMBER IS   "+game_number);
        }
        return;

    }
    public static int takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=-1;
        try{
            n=sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("please enter a valid input from 1 to 100");
        }
        return n;
    }
}
