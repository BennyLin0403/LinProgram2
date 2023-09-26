import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("What is your name?: ");
        String name = scan.nextLine();
        System.out.println("Hello ! " + name);

    }
}
