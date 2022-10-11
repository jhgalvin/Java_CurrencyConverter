import java.util.Scanner;

public class currencyConverter {  
    private static double getUserUSD(Scanner input){
        System.out.print("How much money, in dollars (USD) would you like to convert? ");
        double userUSD = input.nextDouble();
        while (userUSD <= 0){
            System.out.println("Dollar amount must be a positive value...");
            System.out.print("How much money, in dollars (USD) would you like to convert? ");
            userUSD = input.nextDouble();
        }

        return userUSD;
    }

    private static void printMenu(int n, String arr[]){
        System.out.println("List of current currency conversions:");
        for (int idx = 0; idx < n; idx++){
            System.out.println("    " + (idx + 1) + ") " + arr[idx]);
        }
        System.out.print("--> ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        chooseConversion chooseConversion = new chooseConversion();

        final String CURRENCYQUESTION = "What currency would you like to convert to? (Type the number desired) ";
        final String CONVERSIONARR[] = {"Most Popular Conversions", "Indonesian Rupiah", "Australian Dollar", "Canadian Dollar", "Chinese Renminbi", "Euro", "Japanese Yen", "Pound Sterling", "Swiss Franc", "Swedish Krona", "New Zealand Dollar"};
        
        int userChoice;
        double userUSD = getUserUSD(input);;

        System.out.println();

        System.out.println(CURRENCYQUESTION);

        printMenu(CONVERSIONARR.length, CONVERSIONARR);

        userChoice = input.nextInt();

        chooseConversion.conversionSelector(input, userChoice, userUSD, CURRENCYQUESTION);
    }
} 