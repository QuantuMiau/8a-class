package poo;
// clase abstract
abstract public class Animal {
    // encapsulacion
    private String name;
    private int age;
    private double height;
    protected boolean sleep;

    public Animal(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    /// metodos comunes

    public void sleep(){
        if (this.sleep) {
            System.out.println("Estoy sleep");
        }else {
            this.sleep = true;
            System.out.println("Me Voy a dormir");
        }
    }

    //metodo para obligar que lo tengas las hijas
    public abstract void sound();
}
//
//  /\_/\
// ( x.o )