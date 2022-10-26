import java.util.*;

public class MorseCode {

    public static void main(String[] args) {
        Map<Integer,String> archive = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int entry = 1;
        System.out.println("What do you want translated to morse code?To exit program, type Q.");
        boolean keepGoing = true;

        while (keepGoing) {
            String translateThis = scanner.nextLine().toLowerCase();
            if (translateThis.equals("q")) {
                keepGoing = false;
                System.out.println(archive);
            } else {
                archive.put(entry,translateThis);
                translator(translateThis);
                System.out.println();
                entry++;
            }
        }
    }

    public static void translator(String translate) {
        int i = 0;
        while (i < translate.length()) {
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
            morse.put(' ', " || ");//separator for spaces
            System.out.print(morse.get(translate.charAt(i)) + "|"); //Write out all letters and a separator between chars for readability

            i++;
        }
    }
}