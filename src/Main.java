import java.util.Scanner;
import org.apache.log4j.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scannerIn = new Scanner(System.in);
	    MorseCodeTranslator decoderRing = new MorseCodeTranslator("input.txt");
	    String inputString = "";
	    String answer = "";

	    Logger.getLogger(Main.class.getName()).debug("Beginning the main program.");

        // Prompt the user to see if they want to do any translations at all
        // If so, prompt the user for a sentence to translate
        // Call the "translate" method w/in the "translator" object which accomplishes the translation & displays the output
        // Prompt the user to see if they want to continue
        // See the screenshots(s) for appropriate output

        System.out.println( "Do you want to do some Morse Code translations (Y/N)?");
        answer = scannerIn.next();
        scannerIn.nextLine();

        while (answer.toLowerCase().equals("y"))
        {
            System.out.println( "Enter a sentence (to be translated into Morse Code):");
            inputString = scannerIn.nextLine();
            decoderRing.translateSentence(inputString);

            System.out.println( "Do you want to continue (Y/N)?");
            answer = scannerIn.next();
            scannerIn.nextLine();

        }






        Logger.getLogger(Main.class.getName()).debug("Exiting the main program.");
    }
}
