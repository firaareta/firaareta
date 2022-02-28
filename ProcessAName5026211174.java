import java.util.Scanner;
public class ProcessAName5026211174 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me about your name: ");

        String Name = sc.nextLine();
        int Space = Name.indexOf(' ');

        String Result;
        Result = Name.substring(Space + 1) + "," + Name.charAt(0) + ".";

        System.out.println("Your name is: " + Result);
    }
}
