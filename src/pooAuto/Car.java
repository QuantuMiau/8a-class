package pooAuto;

public class Car extends Vehiculo{
    public Car(int wheelsqty, String color, int year, String model) {
        super(wheelsqty, color, year, model);
    }

    @Override
    public void avanzar() {
        System.out.println("Avanza con el aceledador del pie ?");
    }
}
//
//  /\_/\
// ( x.o )