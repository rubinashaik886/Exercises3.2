public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here

        double mondayEggs, tuesdayEggs, wednesdayEggs;
        mondayEggs = 100;
        tuesdayEggs = 121;
        wednesdayEggs = 117;
        double dailyAverage = (mondayEggs+tuesdayEggs+wednesdayEggs)/3;
        double monthlyAverage = dailyAverage * 30;
        double eggPrice = 0.18;
        double monthlyProfit = monthlyAverage * eggPrice;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }

}
