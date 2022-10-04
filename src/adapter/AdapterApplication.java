package adapter;

import adapter.HomeTurkey;
import adapter.Turkey;
import adapter.TurkeyToDuckAdapter;
import adapter.WildDuck;

public class AdapterApplication {

    public static void main(String[] args) {
        System.out.println("Let's use Adapter Patterns!");
        System.out.println();

        System.out.println("Duck says... quack()");
        new WildDuck().quack();
        System.out.println();

        System.out.println("Turkey says... gobble()");
        new HomeTurkey().gobble();
        System.out.println();

        System.out.println("Turkey -> Adapter -> Duck says... quack()");
        Turkey homeTurkey = new HomeTurkey();
        TurkeyToDuckAdapter turkeyToDuckAdapter = new TurkeyToDuckAdapter(homeTurkey);
        turkeyToDuckAdapter.quack();

    }

}
