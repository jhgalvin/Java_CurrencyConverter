import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        chooseConversion c = new chooseConversion();

        final String CURRENCYQUESTION = "What currency would you like to convert to? (Type q to quit) ";
        String userChoice;

        final String CONVERSIONARR[] = {"Most Popular Conversions", "Indonesian Rupiah", "Australian Dollar", "Canadian Dollar", "Chinese Renminbi", "Euro", "Japanese Yen", "Pound Sterling", "Swiss Franc", "Swedish Krona", "New Zealand Dollar"};
        
        System.out.print("How much money, in dollars (USD) would you like to convert? ");
        final double userUSD = input.nextDouble();
        System.out.println();

        System.out.println(CURRENCYQUESTION);
        System.out.println("List of current currency conversions:");

        for (int idx = 0; idx < CONVERSIONARR.length; idx++){
            System.out.println(CONVERSIONARR[idx]);
        }

        userChoice = input.nextLine();

        c.conversionSelector(userChoice, userUSD, CURRENCYQUESTION);

        input.close();
    }
} 