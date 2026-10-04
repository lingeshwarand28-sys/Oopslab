// Main.java
import currency.CurrencyConvertor;
import distance.DistanceConvertor;
import time.TimeConvertor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int code, currencyCode, distanceCode, timeCode;
        Scanner sc = new Scanner(System.in);

        CurrencyConvertor currency = new CurrencyConvertor();
        DistanceConvertor distance = new DistanceConvertor();
        TimeConvertor time = new TimeConvertor();

        System.out.println("Enter the code 1: Currency\n2: Distance\n3: Time");
        code = sc.nextInt();

        if (code == 1) {
            System.out.println("Enter the Currency code 1: Euro\n2: Dollar\n3: Yen");
            currencyCode = sc.nextInt();

            if (currencyCode == 1) {
                currency.convertInrToEuro();
                currency.convertEuroToInr();
            } else if (currencyCode == 2) {
                currency.convertInrToDollar();
                currency.convertDollarToInr();
            } else if (currencyCode == 3) {
                currency.convertInrToYen();
                currency.convertYenToInr();
            } else {
                System.out.println("Invalid Code");
            }
        } else if (code == 2) {
            System.out.println("Enter the Distance code 1: Meter\n2: Miles");
            distanceCode = sc.nextInt();

            if (distanceCode == 1) {
                distance.convertMeterToKm();
                distance.convertKmToMeter();
            } else if (distanceCode == 2) {
                distance.convertMilesToKm();
                distance.convertKmToMiles();
            } else {
                System.out.println("Invalid Code");
            }
        } else if (code == 3) {
            System.out.println("Enter the Time code 1: Minutes\n2: Seconds");
            timeCode = sc.nextInt();

            if (timeCode == 1) {
                time.convertHourToMinute();
                time.convertMinuteToHour();
            } else if (timeCode == 2) {
                time.convertHourToSeconds();
                time.convertSecondsToHour();
            } else {
                System.out.println("Invalid Code");
            }
        } else {
            System.out.println("Invalid Code");
        }

        sc.close();
    }
}