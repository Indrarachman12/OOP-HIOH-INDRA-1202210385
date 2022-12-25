import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Restaurant resto = new Restaurant();
        int customerID, orderQty;
        try{

            System.out.println("Enter Customer ID : "); 
            customerID =  input.nextInt();

            System.out.println("Enter how much food to made : "); 
            orderQty = input.nextInt();

            Thread restaurant = new Thread(resto);
            Waiters waiters = new Waiters(customerID, orderQty);
            Thread t2 = new Thread(waiters);

            restaurant.start();
            t2.start();
            restaurant.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }
    }
}