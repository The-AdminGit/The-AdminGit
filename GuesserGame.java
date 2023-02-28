package gameproject;
import java.util.*;

class Guesser
{
    int guesserNum;

   int guessingNumber()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Guesser! Kind The Guess The Number");
        guesserNum=scan.nextInt();
        return guesserNum;
    }

}

class Player1
{
    int guessNum;
   int guesserNum()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Player1 kindaly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }

}
class Player2
{
    int guessNum;
   int guesserNum()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Player2 kindaly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }

}
class Player3
{
    int guessNum;
   int guesserNum()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Player3 kindaly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }

}
class Player4
{
    int guessNum;
   int guesserNum()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Player4 kindaly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }

}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    int numFromPlayer4;

      void collectNumFromGuesser()
    {
        
        Guesser g= new Guesser();
        numFromGuesser= g.guessingNumber();
    }
      void collectNumFromPlayer()
    {
       Player1 p1=new Player1();
       Player2 p2=new Player2(); 
       Player3 p3=new Player3(); 
       Player4 p4=new Player4(); 
       numFromPlayer1=p1.guesserNum();
       numFromPlayer2=p2.guesserNum();
       numFromPlayer3=p3.guesserNum();
       numFromPlayer4=p4.guesserNum();

    }
     void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            System.out.println("Player1 Won the game");
        }
        else if(numFromGuesser==numFromPlayer2)
        {
            System.out.println("Player2 Won the game");
        }

        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player3 Won the game");
        }
        else if(numFromGuesser==numFromPlayer4)
        {
            System.out.println("Player4 Won the game");
        }
        else{
            System.out.println(" every all wrong asnwer yor are losss the game");
        }

    }

}

public class GuesserGame {

	public static void main(String[] args) {
		System.out.println("Game started");
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();

	}

}
