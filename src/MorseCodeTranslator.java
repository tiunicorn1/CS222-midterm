import org.apache.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by rharris on 3/8/2017.
 */
public class MorseCodeTranslator
{
    private String sentence;
    private String translation;
    private ArrayList<MorseCodeSymbol> morseCodeSymbols;

    public MorseCodeTranslator()
    {
    }


    public MorseCodeTranslator(String inputFileName)
    {
        Logger.getLogger(MorseCodeTranslator.class.getName()).debug( String.format("Inside the MorseCodeTranslator's 1-arg constructor: FNAME[%s]", inputFileName));

        //  SNIP SNIP SNIP

    }

    public void translateSentence(String inputString)
    {
        Logger.getLogger(MorseCodeTranslator.class.getName()).debug("Beginning the sentence translation");

        //  SNIP SNIP SNIP

        System.out.println("Transation: " + translation);
        Logger.getLogger(MorseCodeTranslator.class.getName()).debug("Ended the sentence translation");
    }

    private void initializeSymbols(String inputFileName)
    {
        String inputLine = "";
        String letter;
        String symbol;

        //  SNIP SNIP SNIP


    }
}
