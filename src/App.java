import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Rock, Paper, Sciccors");
            String pick = myObj.nextLine();
            pick.trim();
            pick = pick.toLowerCase();
            Long PCpickL = (Math.round(Math.random() * 100));
            int PCpickI=PCpickL.intValue();
            if (PCpickI <= 33){
            System.out.println("I pick Rock.");
                if(pick.equals("rock")){
                    System.out.println("Draw.");
                }
                else if(pick.equals("Paper")){
                    System.out.println("You Win.");
                }
                else if(pick.equals("Sciccors")){
                    System.out.println("You lose.");
                }
                else { 
                    System.out.println("Something went wrong.");
                }
            }
            else if(PCpickI > 33 && PCpickI < 66){
                System.out.println("I pick Paper.");
                if(pick.equals("paper")){
                    System.out.println("Draw.");
                }
                else if(pick.equals("Sciccors")){
                    System.out.println("You Win.");
                }
                else if(pick.equals("Rock")){
                    System.out.println("You lose.");
                }
                else { 
                    System.out.println("Something went wrong.");
                }
            }
            else if(PCpickI >= 66){
                System.out.println("I pick Sciccors.");
                if(pick.equals("sciccors")){
                    System.out.println("Draw.");
                }
                else if(pick.equals("Rock")){
                    System.out.println("You Win.");
                }
                else if(pick.equals("Paper")){
                    System.out.println("You lose.");
                }
                else { 
                    System.out.println("Something went wrong.");
                }
            }
            else {
                System.out.println("That is not a valid option.");
            }
        }
    }


}