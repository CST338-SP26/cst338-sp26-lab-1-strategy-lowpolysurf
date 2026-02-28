import java.util.ArrayList;
import java.util.HashMap;

public class Driver {
    static void main() {
        HashMap<String, Integer> items = new HashMap<String, Integer>();
        items.put("Gold", 5);
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(1, 5, items));

        for(Monster m : monsters){
            System.out.println(m);
        }
    }

}
