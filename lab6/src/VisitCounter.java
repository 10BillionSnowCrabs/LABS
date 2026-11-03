public class VisitCounter {
    private static double visitFee = 2.5;
    private double paid;
    private int visitCount;


    public static void setVisitFee(double visitFee) {
        VisitCounter.visitFee = visitFee;
    }

    public static double balance(double paid, int visitCount){
        return (visitCount*visitFee - paid);
    }
}
