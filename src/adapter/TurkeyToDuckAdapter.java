package adapter;

// Turkey -> Adapter -> Duck
public class TurkeyToDuckAdapter implements Duck{

    // Duck : Target interface (after)
    // Turkey : Adaptee interface (before)
    Turkey turkey;

    public TurkeyToDuckAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }

}
