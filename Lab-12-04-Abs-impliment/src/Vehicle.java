public abstract class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle");
    }
    public abstract void move();
    public void carry(){
        System.out.println("Carry method");
    }
}
