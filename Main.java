package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello World ");
        
        System.out.println("What's your name? ");
        String name = scn.nextLine();
        System.out.println("How old are you? ");
        String age = scn.nextLine();
        System.out.println("What's your address? ");
        String add = scn.nextLine();
        
        System.out.println("Hi "+ name + "!");
        System.out.println("You are " + age + " yrs old" );
        System.out.println("You live at "+ add);
        
  }

}