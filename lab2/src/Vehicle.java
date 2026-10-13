public class Vehicle {

    String marka;
    int rokProdukcji;

    void getDescription(){
        System.out.println("A tu mamy " + marka + " z roku " + rokProdukcji + "!");
    }
    public Vehicle(String marka, int rokProdukcji)
    {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
    }
    class Car extends Vehicle {

        int wymiary;
        Car(String marka, int rokProdukcji, int wymiary)
        {
            super(marka, rokProdukcji);
            this.wymiary = wymiary;
        }

        boolean isReal(){ if(wymiary==3)return true;else return false;}
    }

    public void main(String[] args){

        Car car1 = new Car("Bercedes", 2028, 3);
        Car car2 = new Car("Bolvo", 1863, 3);
        Car car4 = new Car("Bissan", 20222, 3);
        Car error = new Car("Bord", 0, 4);

    }
}
