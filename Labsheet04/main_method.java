package Labsheet04;
import java.util.Scanner;

public class main_method {
    public static void main (String [] args){
        //object 1

        Driver newdriver1 = new Driver("D1001","John Smith",4000,5);
        double driver1bonus = newdriver1.calculateBonus();
        newdriver1.calculateTotalSalary();
        newdriver1.display();

       //object 2
        Driver newdriver2 = new Driver("D1002","Emily Davis",3500,3);
        double driver2bonus = newdriver2.calculateBonus();
        newdriver2.calculateTotalSalary();
        newdriver2.display();


        //object 3
        Driver newdriver3 = new Driver("D1003","Michael johnson",5000,1);
        double driver3bonus = newdriver3.calculateBonus(4);
        newdriver3.calculateTotalSalary();
        newdriver3.display();
    }
}
