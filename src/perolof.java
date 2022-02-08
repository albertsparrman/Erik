import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

class perolof {

    public static List<Character>
    convertStringToCharList(String str) {

        List<Character> chars = str

                .chars()

                .mapToObj(e -> (char) e)

                .collect(Collectors.toList());

        return chars;
    }


        public static void main(String[] args) {

            String str = JOptionPane.showInputDialog("väl ett episkt ord");

            List<Character>
                    chars = convertStringToCharList(str);

            System.out.println(chars);
        }
    }
}