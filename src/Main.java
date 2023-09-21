import java.util.Scanner;
/* I have neither given nor received any unauthorised aid on this piece of work.*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter one number you would like to be added.");
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter another number you would like to be added to the previous number.");
        int numTwo = Integer.parseInt(scanner.nextLine());
        int resultOne = add(numOne, numTwo);
        System.out.println(resultOne);
        System.out.println("Please enter your name!");
        String name = scanner.nextLine();
        String resultTwo = greeting(name);
        System.out.println(resultTwo);
        System.out.println("Please enter one number you would like to be added.");
        int numberOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter another number you would like to be added to the previous number.");
        int numberTwo = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter another number you would like to be added to the previous numbers.");
        int numberThree = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the last number you would like to be added to the previous numbers.");
        int numberFour = Integer.parseInt(scanner.nextLine());
        int resultThree = add(numberOne, numberTwo, numberThree, numberFour);
        System.out.println(resultThree);
        System.out.println("Please enter anything you would like to be printed to the console.");
        String toBePrinted = scanner.nextLine();
        printMe(toBePrinted);
    }
    public static int add(int numOne,int numTwo) {
        return numOne + numTwo;
    }
    public static String greeting(String name) {
        return "Bonjour, " + name + "!";
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        int x = add(0,numOne);
        int y = add(numTwo, numThree);
        int z = add(0, numFour);
        return x + y + z;
    }
    public static void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }
}
