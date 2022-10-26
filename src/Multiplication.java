import java.io.IOException;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int correctCounter = 0;

        while (correctCounter<3){
            double rando1 = (int) (Math.random()*10+1);
            double rando2 = (int) (Math.random()*10+1);
            int answer = (int)rando1*(int)rando2;

            System.out.println("What is "+ (int)rando1 + " * " + (int)rando2 + "?");
            int userAnswer = scanner.nextInt();
            scanner.nextLine();

            if (userAnswer == answer){
                correctCounter++;
                System.out.println("YAY, correct! " + (3-correctCounter)+ " more to go!");
            } else{
                System.out.println("Ouch, wrong! Do you want som help? Y/N?");
                String help = scanner.next().toUpperCase();

                if (help.equals("Y") || help.equals("YES")){
                    printTable();
                } else{
                    System.out.println("OK, next question");
                }
            }
        }
        if(correctCounter ==3){
            Runtime.getRuntime().exec("c:/windows/system32/mspaint.exe");
        }
    }

    public static void printTable(){
        for (int col = 1; col<=10;col++){

            for (int row = 1; row <= 10; row++) {

                System.out.print(row*col + " ");
            }
            System.out.println();
        }
    }
}
