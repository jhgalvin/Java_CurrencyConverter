import java.util.Scanner;

public class chooseConversion {
    public void conversionSelector (Scanner input, int userChoice, double userUSD, String question){
        runConversion f = new runConversion();

        while (userChoice != 12){
            switch(userChoice){
                case 1:
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
                case 2:
                    f.dollarToRupiah(userUSD);
                    break;
                case 3:
                    f.dollarToAustralian(userUSD);
                    break;
                case 4:
                    f.dollarToCanadian(userUSD);
                    break;
                case 5:
                    f.dollarToRenminbi(userUSD);
                    break;
                case 6:
                    f.dollarToEuro(userUSD);
                    break;
                case 7:
                    f.dollarToYen(userUSD);
                case 8:
                    f.dollarToPound(userUSD);
                    break;
                case 9:
                    f.dollarToFranc(userUSD);
                    break;
                case 10:
                    f.dollarToKrona(userUSD);
                    break;
                case 11:
                    f.dollarToNZD(userUSD);
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
