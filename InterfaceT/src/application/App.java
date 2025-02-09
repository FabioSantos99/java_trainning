package application;
import entities.fordKa;

public class App {
    public static void main(String[] args) throws Exception {
        fordKa mycar = new fordKa();

        mycar.sound();
        mycar.km();
        mycar.value();
    }
}
