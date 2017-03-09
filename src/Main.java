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

        //  SNIP SNIP SNIP

        Logger.getLogger(Main.class.getName()).debug("Exiting the main program.");
    }
}
