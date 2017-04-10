import org.apache.log4j.Logger;

/**
 * Created by rharris on 3/8/2017.
 */
public class MorseCodeSymbol
{
    private String letter;
    private String symbol;

    public MorseCodeSymbol()
    {

    }

    public MorseCodeSymbol(String letter, String symbol)
    {
        this.letter = letter;
        this.symbol = symbol;
    }

    public String getLetter()
    {
        return letter;
    }


    public String toString()
    {
       //used in the translation output
        return String.format("%s", symbol);
    }

    public String getEntry()
    {
        //used for logging to "examine: the symbol entry
        return String.format("%s %s", letter, symbol);
    }
}
