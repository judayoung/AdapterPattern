package adapter;

public class HomeTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Home turkey : gobble! gobble!");
    }

    @Override
    public void fly() {
        System.out.println("Home turkey : fly~ fly~");
    }

}
