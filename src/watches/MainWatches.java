package watches;

public class MainWatches {
    public static void main(String[] args) {
        Clock brClock = new BRLClock();
        brClock.setHour(25);
        brClock.setMinute(0);
        brClock.setSecond(0);
        System.out.println("BRL Clock Time: " + brClock.getTime());
        System.out.println(new USClock().convert(brClock).getTime());
    }
}
