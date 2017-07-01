/**
 * Created by Young on 22/6/17.
 */
import java.awt.font.TextAttribute;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
public class Analyse {
    private final String inputString;
    private List<String> termList;
    private List<AttributedString> endList;
    private char variable;
    public Analyse(String inputString,char variable){
        this.inputString = inputString;
        this.variable = variable;
        termList = new ArrayList<String>(Arrays.asList(inputString.split("\\s+")));
    }

    /*public List<AttributedString> displayFunction(){

    }*/
    //.addAtrribute(TextAttribute.SUPERSCRIPT,TextAttribute.SUPERSCRIPT_SUPER,start_index,end_index);

    //NOTE compiler seems to format the list so that spaces appear where they do not exist.
    public List getList(){
        return  termList;
    }






}
