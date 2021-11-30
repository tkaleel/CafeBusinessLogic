import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0; 
        for(int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        for(int i = 0; i <= prices.length-1; i++){
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        
        for(int i=0; i<=menuItems.size() - 1; i++){
            String drink = menuItems.get(i);
            System.out.println(i + " " + drink);
        }
    }

    public void addCustomer(ArrayList<String> names){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        names.add(userName);
        System.out.println(names);
    }
}
