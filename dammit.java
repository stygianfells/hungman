import java.util.*;

public class dammit {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        notavalidjavaclassname vader = new notavalidjavaclassname();
        puddle Puddle = new puddle();

        while (vader.alive() && Puddle.running()) {
            vader.show();
            Puddle.show();
            System.out.println("\n Make a guess:");
            String guess = scan.nextLine();
            //Puddle.guessed(guess);
            //if you get a wrong guess/letter wasn't in the word
            if (!Puddle.makeguess(guess)) {
                vader.degrade();
            }
            clearScreen();
        }

        if (vader.alive()) System.out.println("CONGRATULATIONS! YOU HAVE OBSTRUCTED THE EMPIRE");
        else {
            System.out.println("UH OH! DAD'S MAD");
            System.out.println("also the word was "+Puddle.getword()+" lol");
        }
    }

    public static void clearScreen() {
        System.out.println("\f");
    }
}

//array length is a public instance var not a method!!!!
//no arrays for the scan method
//guess line starts as empty string and then if in guess line, print instead
//of underscore