
/**
 * This class defines everything your Account needs to know.
 *
 * @author Julia Kroll
 * @version (a version number or a date)
 */
public class Account
{
    // instance variables 
    private double totalMade;
    private double spentClothes;
    private double spentFood;
    private double spentRent;
    private double spentBills;
    private double spentEntertainment;
    

    /**
     * Constructor for objects of class Account
     */
    public Account(double tM, double sC, double sF, double sR, double sB, double sE)
    {
        // initialise instance variables
        this.totalMade=tM;
        this.spentClothes=sC;
        this.spentFood=sF;
        this.spentRent=sR;
        this.spentBills=sB;
        this.spentEntertainment=sE;
    }
    
    public double getTotalMade()
    {
        return this.totalMade;
    }
    
    public double getSpentClothes()
    {
        return this.spentClothes;
    }
    
    public double getSpentFood()
    {
        return this.spentFood;
    }
    
    public double getSpentRent()
    {
        return this.spentRent;
    }
    
    public double getSpentBills()
    {
        return this.spentBills;
    }
    
    public double getSpentEntertainment()
    {
        return this.spentEntertainment;
    }
    
    public void setTotalMade(double tM)
    {
        this.totalMade=tM;
    }
    
    public void getSpentCLothes(double sC)
    {
        this.spentClothes=sC;
    }
    
    public void getSpentFood(double sF)
    {
        this.spentFood=sF;
    }
    
    public void getSpentRent(double sR)
    {
        this.spentRent=sR;
    }
    
    public void getSpentBills(double sB)
    {
        this.spentBills=sB;
    }
    
    public void getSpentEntertainment(double sE)
    {
        this.spentEntertainment=sE;
    }
    
    /**
     * This method calculates the total spent.
     *
     * @param  sC  a parameter for total spent on clothes
     * @param  sF  a parameter for total spent on food
     * @param  sR  a parameter for total spent on rent
     * @param  sB  a parameter for total spent on bills
     * @param  sE  a parameter for total spent on entertainment
     * @return    the sum of all parameters
     */
    public static double calculateTotal(double sC, double sF, double sR, double sB, double sE)
    {
        double answer = sC + sF + sR + sB + sE;
        return answer;
    }
    
    /**
     * This method calculates the total saved.
     *
     * @param  sC  a parameter for total spent on clothes
     * @param  sF  a parameter for total spent on food
     * @param  sR  a parameter for total spent on rent
     * @param  sB  a parameter for total spent on bills
     * @param  sE  a parameter for total spent on entertainment
     * @param  tM  a parameter for total money made 
     * @return    the sum of all parameters
     */
    public static double calculateTotalSaved(double tM,double sC, double sF, double sR, double sB, double sE)
    {
        double totalSpent= sC + sF + sR + sB + sE;
        double answer = tM-totalSpent;
        return answer;
    }
    
    /**
     * This method calculates the total percentage spent on clothes.
     *
     * @param  sC  a parameter for total spent on clothes
     * @param  tM  a parameter for total money made 
     * @return    the percentage spent on clothes
     */
    public static double calculateClothesPercent(double tM,double sC)
    {
        double answer = (sC/tM)*100;
        return answer;
    }
    
    /**
     * This method calculates the total percentage spent on food.
     *
     * @param  sF  a parameter for total spent on food
     * @param  tM  a parameter for total money made 
     * @return    the percentage spent on food
     */
    public static double calculateFoodPercent(double tM,double sF)
    {
        double answer = (sF/tM)*100;
        return answer;
    }
    
    /**
     * This method calculates the total percentage spent on rent.
     *
     * @param  sR  a parameter for total spent on rent
     * @param  tM  a parameter for total money made 
     * @return    the percentage spent on rent
     */
    public static double calculateRentPercent(double tM,double sR)
    {
        double answer = (sR/tM)*100;
        return answer;
    }
    
    /**
     * This method calculates the total percentage spent on bills.
     *
     * @param  sB  a parameter for total spent on bills
     * @param  tM  a parameter for total money made 
     * @return    the percentage spent on bills
     */
    public static double calculateBillsPercent(double tM,double sB)
    {
        double answer = (sB/tM)*100;
        return answer;
    }
    
    /**
     * This method calculates the total percentage spent on entertainment.
     *
     * @param  sE  a parameter for total spent on entertainment 
     * @param  tM  a parameter for total money made 
     * @return    the percentage spent on entertainment
     */
    public static double calculateEntertainmentPercent(double tM,double sE)
    {
        double answer = (sE/tM)*100;
        return answer;
    }
    
    /**
     * This method calculates the total percentage saved.
     *
     * @param  sC  a parameter for total spent on clothes
     * @param  sF  a parameter for total spent on food
     * @param  sR  a parameter for total spent on rent
     * @param  sB  a parameter for total spent on bills
     * @param  sE  a parameter for total spent on entertainment
     * @param  tM  a parameter for total money made 
     * @return    the percentage saved
     */
    public static double calculateSavedPercent(double tM,double sC, double sF, double sR, double sB, double sE)
    {
        double totalSpent= sC + sF + sR + sB + sE;
        double totalSaved = tM-totalSpent;
        double answer = (totalSaved/tM)*100;
        return answer;
    }
}
