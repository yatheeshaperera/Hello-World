package Labsheet04;

public class Driver {
    private String driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    private double bonus = 0;
    private double totalsalary;

    //constructors overloading
    public Driver(String driverID, String driverName) {
        this.driverID = driverID;
        this.driverName = driverName;
    }

    public Driver(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Driver(String driverID, String driverName, double baseSalary, int performance) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        this.performanceScore = setPerformance(performance);
    }

    //getters and setters
    public String getDriverID() {
        return driverID;
    }
    public int getPerformanceScore() {
        return performanceScore;
    }
    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }
    public int setPerformance(int performance) {
        if (performance >= 1 && performance <= 5)
            this.performanceScore = performance;
        else {
            System.out.println("Performance out of range. Set to default performance");
            this.performanceScore = 1;
        }
        return this.performanceScore;
    }

    //methods
    public double calculateBonus() {
        if (performanceScore == 1)
            bonus = baseSalary;
        else if (performanceScore == 2)
            bonus = baseSalary * 0.1;
        else if (performanceScore == 3)
            bonus = baseSalary * 0.15;
        else if (performanceScore == 4)
            bonus = baseSalary * 0.2;
        else
            bonus = baseSalary * 0.25;
        return bonus;
    }

    public double calculateBonus(int custom) {
        System.out.println("Bonus for driver "+driverID+" with custom Rating "+custom+" :");
        if (custom == 1)
            return baseSalary;
        else if (custom == 2)
            return baseSalary * 0.1;
        else if (custom == 3)
            return custom * 0.15;
        else if (custom == 4)
            return baseSalary * 0.2;
        else
            return baseSalary * 0.25;
    }

    public void calculateTotalSalary(){
        totalsalary = baseSalary+bonus;
    }
    public void display(){
        System.out.println("Driver ID: "+driverID);
        System.out.println("Name: "+driverName);
        System.out.println("Basic Salary: "+baseSalary);
        System.out.println("Performance Score: "+performanceScore);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+totalsalary);
        System.out.println();
    }


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

