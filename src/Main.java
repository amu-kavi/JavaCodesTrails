import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World! from the intelliJ! My first code on  intelliJ IDE");
        String Name ="";
        System.out.println("Whats your Name ???");
        Scanner input = new Scanner(System.in); //Scanner is used to take the input fromm the user
        Name =input.nextLine();
        System.out.println("Name : "+Name);
    }
}
