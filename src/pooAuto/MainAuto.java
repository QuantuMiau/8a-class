package pooAuto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainAuto {
    public static void main(String[] args) {
        Moto moto1 = new Moto(2,"blue",2015,"sasd");
        Car car1 = new Car(4, "red", 2011, "nisan");

        moto1.avanzar();
        car1.avanzar();
    }
}