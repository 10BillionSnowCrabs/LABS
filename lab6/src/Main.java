public class Main {
    public static void main(String[] args) {

        Product dwa = new Product("Dwa", 1.99, "liczba", true);
        System.out.println("Aktualna liczba produktów: " + dwa.getProductCount());
        Product grosz = new Product("grosz", 10.99, "waluta", false);
        dwa.printInfo();
        grosz.printInfo();
        System.out.println("Aktualna liczba produktów: " + grosz.getProductCount());
        LibraryMember plotter = new LibraryMember(1863, "Plotter", "0000");
        plotter.memberInfo();

        System.out.println(VisitCounter.balance(100, 25));
        System.out.println(VisitCounter.balance(25, 1298));
        VisitCounter.setVisitFee(4951);
        System.out.println(VisitCounter.balance(100, 25));
        System.out.println(VisitCounter.balance(25, 1298));
        VisitCounter.setVisitFee(2.5);
        System.out.println(VisitCounter.balance(100, 25));
        System.out.println(VisitCounter.balance(25, 1298));


    }
}