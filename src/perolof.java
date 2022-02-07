import javax.swing.*;
import java.util.*;

class Ord {
    public static List<Character>
    convertStringToCharList(String str) {
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()){
            chars.add(ch);
        }
        return chars;
    }
}

public class perolof {
    public static void main(String[] args){
        String str = JOptionPane.showInputDialog("Välj ett episkt ord");

        List<Character>
                chars = convertStringToCharList(str);
        System.out.println(chars);
    }
}

