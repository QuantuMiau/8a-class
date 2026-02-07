package poo;

public class Perro extends Animal{
    public Perro(String name, int age, double height) {
        super(name, age, height);
    }

    @Override
    public void sound() {
        System.out.println("Guau guau !!");
    }


}
//
//  /\_/\
// ( x.o )