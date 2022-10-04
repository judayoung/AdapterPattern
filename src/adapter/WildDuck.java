package adapter;

public class WildDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Wild duck : quack! quack!");
    }

    @Override
    public void fly() {
        System.out.println("Wild duck : fly~ fly~");
    }

}
