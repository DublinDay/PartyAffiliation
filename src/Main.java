import java.util.Scanner;
public class Main {
    public static void main(String [] agrs) {
        Scanner in = new Scanner(System.in);
        String politicParty = "";
        System.out.println("Enter your political party [D, R, I, or Other}");
        politicParty = in.nextLine();
        if (politicParty.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (politicParty.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant!");
        }
        else if (politicParty.equalsIgnoreCase("I")) {
            System.out.println("You get a Independent Person!");
        }
        else
            System.out.println("You are apart of another party!");
    }
}