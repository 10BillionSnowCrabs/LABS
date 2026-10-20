package pl.edu.lab.model;

public class Product {
    private String nazwa;
    private float cena;

    public Product(String nazwa, float cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public float getCena() {
        return cena;
    }

    public void showProduct(){
        System.out.println(nazwa + ", price: " + cena);
    }
}
