import java.util.Scanner;

public class chooseConversion {
    public void conversionSelector (Scanner input, int userChoice, double userUSD, String question){
        runConversion runConversion = new runConversion();

        while (userChoice != 12){
            switch(userChoice){
                case 1:
                    runConversion.dollarToEuro(userUSD);
                    runConversion.dollarToYen(userUSD);
                    runConversion.dollarToCanadian(userUSD);
                    runConversion.dollarToAustralian(userUSD);
                    runConversion.dollarToPound(userUSD);
                    runConversion.dollarToFranc(userUSD);
                    runConversion.dollarToRenminbi(userUSD);
                    runConversion.dollarToKrona(userUSD);
                    runConversion.dollarToNZD(userUSD);
                    break;
                case 2:
                    runConversion.dollarToRupiah(userUSD);
                    break;
                case 3:
                    runConversion.dollarToAustralian(userUSD);
                    break;
                case 4:
                    runConversion.dollarToCanadian(userUSD);
                    break;
                case 5:
                    runConversion.dollarToRenminbi(userUSD);
                    break;
                case 6:
                    runConversion.dollarToEuro(userUSD);
                    break;
                case 7:
                    runConversion.dollarToYen(userUSD);
                case 8:
                    runConversion.dollarToPound(userUSD);
                    break;
                case 9:
                    runConversion.dollarToFranc(userUSD);
                    break;
                case 10:
                    runConversion.dollarToKrona(userUSD);
                    break;
                case 11:
                    runConversion.dollarToNZD(userUSD);
                    break;
                case 12:
                    System.out.println("Goodbye!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("That is not an option!");
                    System.out.println("Options should be entered in title case format (i.e. Japanese Yen) ");
                    break;
            }
            if (userChoice != 12){
                System.out.print(question);
                userChoice = input.nextInt();
                if (userChoice == 12){
                    System.exit(0);
                }
            }
        }
    }
    
}
