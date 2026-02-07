package pooAuto;

public class Moto extends Vehiculo{
    public Moto(int wheelsqty, String color, int year, String model) {
        super(wheelsqty, color, year, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Encendido como moto idk w");
    }

    @Override
    public void turnOf() {
        System.out.println("Apagado llave idk");
    }

    @Override
    public void avanzar() {
        System.out.println("Avanza con acelerador en la mano");
    }
}
//
//  /\_/\
// ( x.o )