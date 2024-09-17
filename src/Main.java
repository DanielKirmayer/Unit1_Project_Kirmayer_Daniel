import java.util.Scanner; //Imports scanner to be used to collect user input




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Scanner s = new Scanner(System.in); //Create a scanner to take in user input.
        System.out.print("Please enter your total bill: ");
        String totalBill = s.nextLine();
        System.out.print("Please enter your tip percentage: ");
        String tipPercent = s.nextLine();
        System.out.print("Please enter your party size: ");
        String totalPeople = s.nextLine();

        double totalBillDouble = (double) Double.parseDouble(totalBill); //Converting user input to doubles and integers.
        double tipPercentDouble = (((double) Double.parseDouble(tipPercent))/100)+1;
        int totalPeopleDouble = (int) Integer.parseInt(totalPeople);
        double finalBillDouble = (double) (Math.round(totalBillDouble * tipPercentDouble * 100)) /100; //Calculating final numbers & rounding to nearest hundredth.
        double finalTipDouble = (double) (Math.round((finalBillDouble - totalBillDouble) * 100)) /100;
        double finalTipPerPerson = (double) (Math.round(finalTipDouble*100/totalPeopleDouble))/100;
        double finalBillPerPerson = (double) (Math.round(finalBillDouble*100/totalPeopleDouble))/100;

        System.out.println("----------------"); //Displaying the final information to the users in a formatted manner.
        System.out.println("Total Bill: $"+finalBillDouble);
        System.out.println("----------------");
        System.out.println("Total Tip: $"+finalTipDouble);
        System.out.println("----------------");
        System.out.println("Total Bill Per Person: $"+ finalBillPerPerson);
        System.out.println("----------------");
        System.out.println("Total Tip Per Person: $"+finalTipPerPerson);



        s.close(); //Close scanner.






    }
}
