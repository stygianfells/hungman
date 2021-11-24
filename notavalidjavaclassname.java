
public class notavalidjavaclassname {

    private static int wrongguesses;
    private String[] darth = {
            "",
            
            "       ___\n"+
            "      /0.0\\\n"+
            "     / iii \\\n",

            "       ___\n"+
            "      /0.0\\\n"+
            "     / iii \\\n"+
            "     ||+=||\n"+
            "     |=== |\n",

            "       ___\n"+
            "      /0.0\\\n"+
            "     / iii \\\n"+
            "    /||+=||\n"+
            "    ||=== |\n"+
            "    o[  ^  \\\n",

            "       ___\n"+
            "      /0.0\\\n"+
            "     / iii \\ o\n"+
            "    /||+=||\\//\n"+
            "    ||=== |\\/\n"+
            "    o[  ^  \\\n",

            "       ___\n"+
            "      /0.0\\\n"+
            "     / iii \\ o\n"+
            "    /||+=||\\//\n"+
            "    ||=== |\\/\n"+
            "    o[  ^ \\\n"+
            "     | | \\ \\\n"+
            "     | | | |\n"+
            "     | | | |\n"+
            "      ==  ==\n",

            "        ___\n"+
            "       /0.0\\\n"+
            "      / iii \\ o\n"+
            "     /||+=||\\//\n"+
            "     || ===|\\/\n"+
            "    /o[  ^ \\ \\\n"+
            "   /  | | \\ \\ \\\n"+
            "  /   | | | |  \\\n"+
            " /    | | | |   \\\n"+
            "       ==  ==\n",

            "        ___  +  //   +\n"+
            "       />-<\\   //\n"+
            "      / iii \\ //  +\n"+
            "     /||+=||\\/3\n"+
            "     || ===|\\/\n"+
            "    /o[  ^ \\ \\\n"+
            "   /  | | \\ \\ \\\n"+
            "  /   | | | |  \\\n"+
            " /    | | | |   \\\n"+
            "       ==  ==\n",
        };

    public notavalidjavaclassname() {
        wrongguesses = 0;
    }

    public boolean alive() {
        if (wrongguesses > 7) return false; 
        return true;
    }

    public void show() {
        System.out.println(darth[wrongguesses]);
    }
    
    public void degrade() {
        wrongguesses++;
    }
    
    public static int getwrongguesses() {
        return wrongguesses;
    }
}
