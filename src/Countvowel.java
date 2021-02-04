import java.util.Scanner;
public class Countvowel {
    public static void main (String[]args){
      Scanner sc= new Scanner (System.in);
      System.out.println("Please enter word");
      String word= sc.nextLine();
      System.out.println(CountVowel(word));

    }
    public static int CountVowel(String str) {
        char ch;
        str = str.toUpperCase();
        int count = 0;
        if (str.length() < 1) return 0;
        else
            ch = str.charAt(0);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            count++;
        return (count+CountVowel(str.substring(1)));

    }

}
