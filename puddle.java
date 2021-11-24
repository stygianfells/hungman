
public class puddle {

    private int letters;
    private String word;
    private String theguessed;

    public puddle() {
        letters = 3;
        word = "JAZZ";
        theguessed = "";
    }

    public boolean running() {
        if (theguessed.contains("J")&&theguessed.contains("A")&&theguessed.contains("Z")) return false;
        return true;
    }

    public boolean makeguess(String Guess) {
        theguessed+=Guess;
        if (word.contains(Guess)) return true;
        return false;
    }

    public String getword() {
        return word;
    }

    public void show() {
        System.out.println();
        int i;
        for (i=0; i<=word.length()+1; i++) {
            if (!theguessed.contains(word.substring(i, i++))) {
                
                System.out.print(word.substring(i, i++));
            }
            else {
                System.out.print(" _");
            }
        }
        System.out.println(theguessed);
    }
}

