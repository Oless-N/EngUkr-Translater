package logic;

import org.omg.CORBA.Object;
import view.DictFrame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private Map<String, String> engUkr;
//    private Map <String, String> ukrEng;
private static Dictionary instance = new Dictionary();

    public static Dictionary getInstance() {
        return instance;
    }

    private Dictionary() {
        this.engUkr = new HashMap<String, String>();
    }

   public void addEngUkrWord(String eng, String ukr) {
        this.engUkr.put(eng,ukr);
    }

   public String translateUkr(String word) {
        String ukrWord = this.engUkr.get(word);

        if (ukrWord== null){ukrWord="DoNot Have this word";}
        return ukrWord;
    }
    public void loadFromFile(String fileMame, String separator) throws IOException {
        List<String>fileDict=new ArrayList<>();
       fileDict=Files.readAllLines(Paths.get(fileMame));
        for (String s : fileDict) {
            String [] words = s.split(separator);
            this.addEngUkrWord(words[0],words[1]);
        }
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "engUkr=" + engUkr +
                '}';
    }
}
