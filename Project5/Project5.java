
/**
 * Write a description of class Project5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Project5
{
    public static void main (String[] args)
    {
        Account account = new Account(120, 20, 20, 20, 20, 20);
        //calling methods to calculate percent spent on different categories and printing 
        //out the percentage
        double spent = account.calculateTotal(20,20,20,20,20);
        System.out.println("You spent a total of" + spent + "dollars.");
        double totalSaved = account.calculateTotalSaved(120,20,20,20,20,20);
        System.out.println("You have saved" + totalSaved + "dollars.");
        double clothes = account.calculateClothesPercent(120, 20);
        System.out.println("You spent" + clothes + "percent on clothes.");
        double food = account.calculateFoodPercent(120,20);
        System.out.println("You spent" + food + "percent on food.");
        double rent = account.calculateRentPercent(120,20);
        System.out.println("You spent" + rent + "percent on rent.");
        double bills = account.calculateBillsPercent(120,20);
        System.out.println("You spent" + bills + "percent on bills.");
        double entertainment = account.calculateEntertainmentPercent(120,20);
        System.out.println("You spent" + entertainment + "percent on entertainment.");
        double saved = account.calculateSavedPercent(120,20,20,20,20,20);
        System.out.println("You saved" + saved + "percent.");
        //figuring out what the user spent the most money on
        if(clothes>food && clothes>rent && clothes>bills && clothes>entertainment &&clothes>saved){
            System.out.println("You spent the most on clothes.");
        }else if(food>clothes && food>rent && food> bills && food>entertainment && food>saved){
            System.out.println("You spent the most on food.");
        }else if(rent>clothes && rent>food && rent>bills && rent>entertainment && rent>saved){
            System.out.println("You spent the most on rent.");
        }else if(bills>clothes && bills>food && bills>rent && bills>entertainment && bills>saved){
            System.out.println("You spent the most on bills.");
        }else if(entertainment>clothes && entertainment>food && entertainment>rent && entertainment>bills && entertainment>saved){
            System.out.println("You spent the most on entertainment.");
        }else if(saved>clothes && saved>food && saved>rent && saved>bills && saved>entertainment){
            System.out.println("You saved the most.");
        }else{
            System.out.println("You spent the same amount on everything.");
        }
}
}