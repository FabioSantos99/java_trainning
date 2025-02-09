package entities;

public class fordKa implements Car {

    @Override
    public void sound() {
        System.out.println("vruum");
    }

    @Override
    public void km() {
       System.out.println(200);
    }

    public double value() {
        System.out.println(String.format("%.2f", 500000.00));
        return value();
    }


}
