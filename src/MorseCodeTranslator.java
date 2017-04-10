import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
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
    Scanner scannerIn;

    public MorseCodeTranslator()
    {
    }


    public MorseCodeTranslator(String inputFileName)
    {
        Logger.getLogger(MorseCodeTranslator.class.getName()).debug( String.format("Inside the MorseCodeTranslator's 1-arg constructor: FNAME[%s]", inputFileName));

        try
        {
            scannerIn = new Scanner(new File(inputFileName));
            morseCodeSymbols = new ArrayList<MorseCodeSymbol>();
            initializeSymbols(inputFileName);
        }
        catch (FileNotFoundException fnfex)
        {
            System.out.println(fnfex.toString());
        }


    }
    public void examineSymbolCollection()
    {
        //  should be used for "logging" so that you can examine the entries in your collection so you can ensure they are "correct"

        


    }


    public void translateSentence(String inputString)
    {
        Logger.getLogger(MorseCodeTranslator.class.getName()).debug("Beginning the sentence translation");

        //  Shall be able to handle upper & lower case letters in the "user's sentence input"

        sentence = inputString.toLowerCase();
        translation = "";
        

        Logger.getLogger(MorseCodeTranslator.class.getName()).debug("Sentence" + sentence);

        String inputLetter;

        for (int i = 0; i < sentence.length(); i++)
        {
            inputLetter = sentence.substring(i, i+1);
            translateIndividualLetter(inputLetter);

        }



        System.out.println("Translation: " + translation);
        Logger.getLogger(MorseCodeTranslator.class.getName()).debug("Ended the sentence translation");
    }


    private void translateIndividualLetter(String inputLetter)
    {
        String getSymbol;


        Logger.getLogger(MorseCodeTranslator.class.getName()).debug("Inside translateIndividualLetter");


           for (MorseCodeSymbol compareLetter : morseCodeSymbols)
                {
                    if (compareLetter.getLetter().equals(inputLetter))
                    {
                        getSymbol = compareLetter.getEntry();
                        translation += getSymbol.substring(2) + " ";
                        Logger.getLogger(MorseCodeTranslator.class.getName()).debug("getSymbol"+ getSymbol);
                        Logger.getLogger(MorseCodeTranslator.class.getName()).debug("translation"+ translation);

                    }


                }







    }

    private void initializeSymbols(String inputFileName)
    {
        String inputLine = "";
        String letter = "";
        String symbol = "";


        //  should open up & read all the lines from input file & to instantiate all the "MorseCodeSymbol" objects
        // add special entry to handle a space from the input sentence



            while(scannerIn.hasNext())
            {
                inputLine = scannerIn.nextLine();
                letter = inputLine.substring(0,1);
                symbol = inputLine.substring(2);

                MorseCodeSymbol i = new MorseCodeSymbol(letter, symbol);

                morseCodeSymbols.add(i);

                Logger.getLogger(MorseCodeSymbol.class.getName()).debug(String.format("Inside the MorseCodeSymbol's 2-arg constructor: L[%s] S[%s]", letter, symbol));





            }

        letter = " ";
        symbol = "   ";
        MorseCodeSymbol j = new MorseCodeSymbol(letter, symbol);

        morseCodeSymbols.add(j);

        Logger.getLogger(MorseCodeSymbol.class.getName()).debug(String.format("Inside the MorseCodeSymbol's 2-arg constructor: L[%s] S[%s]", letter, symbol));

            scannerIn.close();



        }

}
