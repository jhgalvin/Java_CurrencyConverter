import java.util.Scanner;

public class chooseConversion {
    public void conversionSelector (String userChoice, double userUSD, String question){
        runConversion f = new runConversion();
        Scanner input = new Scanner(System.in);

        while (userChoice != "q"){
            switch(userChoice){
                case "Most Popular Conversions":
                    f.dollarToEuro(userUSD);
                    f.dollarToYen(userUSD);
                    f.dollarToCanadian(userUSD);
                    f.dollarToAustralian(userUSD);
                    f.dollarToPound(userUSD);
                    f.dollarToFranc(userUSD);
                    f.dollarToRenminbi(userUSD);
                    f.dollarToKrona(userUSD);
                    f.dollarToNZD(userUSD);
                    break;
                case "Euro":
                    f.dollarToEuro(userUSD);
                    break;
                case "Japanese Yen":
                    f.dollarToYen(userUSD);
                case "Indonesian Rupiah":
                    f.dollarToRupiah(userUSD);
                    break;
                case "Canadian Dollar":
                    f.dollarToCanadian(userUSD);
                    break;
                case "Australian Dollar":
                    f.dollarToAustralian(userUSD);
                    break;
                case "Pound Sterling":
                    f.dollarToPound(userUSD);
                    break;
                case "Swiss Franc":
                    f.dollarToFranc(userUSD);
                    break;
                case "Chinese Renminbi":
                    f.dollarToRenminbi(userUSD);
                    break;
                case "Swedish Krona":
                    f.dollarToKrona(userUSD);
                    break;
                case "New Zealand Dollar":
                    f.dollarToNZD(userUSD);
                    break;
                case "q":
                    System.out.println("Goodbye!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("That is not an option!");
                    System.out.println("Options should be entered in title case format (i.e. Japanese Yen) ");
                    break;
            }
            if (userChoice != "q"){
                System.out.print(question);
                userChoice = input.nextLine();
                if (userChoice == "q"){
                    input.close();
                    System.exit(0);
                }
            }
        }
    }
    
}
