import java.util.Objects;
import java.util.Scanner;

public class Worksheet4 {

    public static void main(String[] args) {


        //Level 3
        System.out.println("Enter a word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println(word +" "+ word + " Revolution");

        //Level 4
        System.out.println("How will you get there");
        String mode = scanner.nextLine();

        if (Objects.equals(mode,"car")){
            System.out.println("Shot gun! \n Time to go!");
        }else{
            System.out.println("Time to go!");
        }

        //Level 5

        System.out.println("Say:");
        String say = scanner.nextLine();

        String end = say.substring(say.length()-1);
        System.out.println(say + end + end + end + end + end);

        //Level 6

        System.out.println("Input the code:");
        String code = scanner.nextLine();

        for (int i = 0; i < code.length(); i+=5) {
            System.out.print(code.charAt(i));
        }

        //Level 7

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        int iAmount = 0;
        int tAmount = 0;
        int TAmount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'i'){
                iAmount++;
            }
        }
        for (int t = 0; t < sentence.length(); t++) {
            if (sentence.charAt(t) == 't'){
                tAmount++;
            }
        }

        for (int T = 0; T < tAmount; T++) {
            if (sentence.charAt(T) == 'T'){
                TAmount++;
            }
        }

        int tTotal = + tAmount + TAmount;

        System.out.println("Amount of i's: " + iAmount);
        System.out.println("Amount of T's & t's: " + tTotal);

        //Level 8

        System.out.println("Enter a name:");
        String name = scanner.nextLine();

        System.out.println("And " + name +  " was his name-o");


    }
}
