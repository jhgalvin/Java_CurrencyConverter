public class runConversion {
    private double IDR = 15303.70;
    private double CAD = 1.38;
    private double EURO = 1.02;
    private double YEN = 144.74;
    private double AUD = 1.56;
    private double GBP = 0.90;
    private double FRANC = 0.99;
    private double CNY = 7.12;
    private double SEK = 11.08;
    private double NZD = 1.79;

    public void dollarToRupiah(double input) {
        IDR = input * 15303.70;
        System.out.println("US Dollar to Rupiah Conversion");
        System.out.print("  ");
        System.out.printf("%.2f", input);
        System.out.print(" (USD) --> "); 
        System.out.printf("%.2f", IDR);
        System.out.println(" (IDR)");
    }

    public void dollarToCanadian(double input){
        CAD = input * 1.38;
        System.out.println("US Dollar to Canadian Dollar Conversion");
        System.out.print("  ");
        System.out.printf("%.2f", input);
        System.out.print(" (USD) --> ");
        System.out.printf("%.2f", CAD);
        System.out.println(" (CAD)");
    }

    public void dollarToEuro(double input){
        EURO = input * 1.02;
        System.out.println("US Dollar to Euro Conversion");
        System.out.print("  ");
        System.out.printf("%.2f", input);
        System.out.print(" (USD) --> ");
        System.out.printf("%.2f", EURO);
        System.out.println(" (EUR)");
    }

    public void dollarToYen(double input){
        YEN = input * 144.74;
        System.out.println("US Dollar to Japanese Yen Conversion");
        System.out.print("  ");
        System.out.printf("%.2f", input);
        System.out.print(" (USD) --> ");
        System.out.printf("%.2f", YEN);
        System.out.println(" (JPY)");
    }

    public void dollarToAustralian(double input){
        AUD = input * 1.56;
        System.out.println("US Dollar to Australian Dollar Conversion");
        System.out.print("  ");
        System.out.printf("%.2f", input);
        System.out.print(" (USD) --> ");
        System.out.printf("%.2f", AUD);
        System.out.println(" (AUD)");
    }

    public void dollarToPound(double input){
        GBP = input * 0.90;
        System.out.println("US Dollar to Pound Sterling Conversion");
        System.out.print("  ");
        System.out.printf("%.2f", input);
        System.out.print(" (USD) --> ");
        System.out.printf("%.2f", GBP);
        System.out.println(" (GBP)");
    }

    public void dollarToFranc(double input){
        FRANC = input * 0.99;
        System.out.println("US Dollar to Swiss Franc Conversion");
        System.out.print("  ");
        System.out.printf("%.2f", input);
        System.out.print(" (USD) --> ");
        System.out.printf("%.2f", FRANC);
        System.out.println(" (CHF)");
    }

    public void dollarToRenminbi(double input){
        CNY = input * 7.12;
        System.out.println("US Dollar to Chinese Renminbi Conversion");
        System.out.print("  ");
        System.out.printf("%.2f", input);
        System.out.print(" (USD) --> ");
        System.out.printf("%.2f", CNY);
        System.out.println(" (CNY)");
    }

    public void dollarToKrona(double input){
        SEK = input * 11.08;
        System.out.println("US Dollar to Swedish Krona Conversion");
        System.out.print("  ");
        System.out.printf("%.2f", input);
        System.out.print(" (USD) --> ");
        System.out.printf("%.2f", SEK);
        System.out.println(" (SEK)");
    }

    public void dollarToNZD(double input){
        NZD = input * 1.79;
        System.out.println("US Dollar to New Zealand Dollar Conversion");
        System.out.print("  ");
        System.out.printf("%.2f", input);
        System.out.print(" (USD) --> ");
        System.out.printf("%.2f", NZD);
        System.out.println(" (JPY)");
    }
}
