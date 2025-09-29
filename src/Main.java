import java.util.Scanner;
public class Main {//Class partyAffiliation
    public static void main(String [] agrs) {//main()
        Scanner in = new Scanner(System.in);
        String politicParty = "";//userParty = 0
        System.out.println("Enter your political party [D, R, I, or Other}");//output "Enter your political party using R, D, or I"
        politicParty = in.nextLine();//input userParty
        if (politicParty.equalsIgnoreCase("D")) {//if userParty == democrat
            System.out.println("You get a Democratic Donkey!");//output "You get a Democratic Donkey!"
        } else if (politicParty.equalsIgnoreCase("R")) {//else if userParty == republican
            System.out.println("You get a Republican Elephant!");//output "You get a Republican Elephant"
        } else if (politicParty.equalsIgnoreCase("I")) {//else if userParty==Independent
            System.out.println("You get a Independent Person!");//output "You get a Independent Man"
        } else//else
            System.out.println("You are apart of another party!");
        {
            ;//output "You are apart of another party!"
        }//endIf
    }//return
}//endClass
