package pooAuto;

public abstract class Vehiculo {
    private int wheelsqty;
    private String color;
    private int year;
    private String model;
    private boolean status;

    public Vehiculo(int wheelsqty, String color, int year, String model) {
        this.wheelsqty = wheelsqty;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public int getWheelsqty() {
        return wheelsqty;
    }

    public void setWheelsqty(int wheelsqty) {
        this.wheelsqty = wheelsqty;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public  void turnOn(){
        if (status) {
            System.out.println("ya esta encendido");
        } else {
            System.out.println("Encendido");
            status = true;
        }
    }

    public void turnOf(){
        if (!status) {
            System.out.println("ya esta apagado");
        } else {
            System.out.println("Apagado");
            status = false;
        }
    }

    public abstract void avanzar();

}


//
//  /\_/\
// ( x.o )