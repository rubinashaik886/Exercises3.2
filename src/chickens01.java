public class chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int chickenCount = 4;
        int eggsPerChicken = 8;
        int MondayEggs, TuesdayEggs, WednesdayEggs;
        MondayEggs = chickenCount * eggsPerChicken;
        chickenCount++;
        TuesdayEggs = chickenCount * eggsPerChicken;
        chickenCount = chickenCount / 2;
        WednesdayEggs = chickenCount * eggsPerChicken;

        int totalEggs;
        totalEggs = MondayEggs + TuesdayEggs + WednesdayEggs;

        System.out.println(totalEggs);
    }
}
