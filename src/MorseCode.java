import java.util.*;

public class MorseCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want translated to morse code.To exit program, type Q.");
        String translateThis = "";
        do {
            translateThis = scanner.nextLine().toLowerCase();
                int i = 0;
                while (i < translateThis.length()) {
                    Map<Character, String> morse = new HashMap<>();
                    morse.put('a', ".-");
                    morse.put('b', "-...");
                    morse.put('c', "-.-");
                    morse.put('d', "-..");
                    morse.put('e', ".");
                    morse.put('f', "..-.");
                    morse.put('g', "--.");
                    morse.put('h', "....");
                    morse.put('i', "..");
                    morse.put('j', ".---");
                    morse.put('k', "-.");
                    morse.put('l', ".-..");
                    morse.put('m', "--");
                    morse.put('n', "-.");
                    morse.put('o', "---");
                    morse.put('p', ".--.");
                    morse.put('q', "--.-");
                    morse.put('r', ".-.");
                    morse.put('s', "...");
                    morse.put('t', "-");
                    morse.put('u', "..-");
                    morse.put('v', "...-");
                    morse.put('w', ".--");
                    morse.put('x', "-..-");
                    morse.put('y', "-.--");
                    morse.put('z', "--..");
                    morse.put('1', ".----");
                    morse.put('2', "..---");
                    morse.put('3', "...--");
                    morse.put('4', "....-");
                    morse.put('5', ".....");
                    morse.put('6', "-....");
                    morse.put('7', "--...");
                    morse.put('8', "---..");
                    morse.put('9', "----.");
                    morse.put('0', "-----");
                    morse.put(' ', " || ");//added seperator for spaces
                    System.out.print(morse.get(translateThis.charAt(i)) + "|"); //Write out all letters and separator between chars

                    i++;
                }
            System.out.println();
        }while (!(translateThis.equals("q")));

    }
}