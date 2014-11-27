package engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Logic {

    private Random rnd;
    private int count;
    private Map<Integer, String> items = new HashMap();

    public Logic(){
        String boots = "Boots";
        String crocodile = "Crocodile";
        String polarbear  = "Polarbear";
        String cactus = "Cactus";
        String wolf = "Wolf";
        String rat = "Rat";
        String card = "Card";
        String lighter = "Lighter";
        String deo = "Deodorant";
        String spider = "Spider";
        String honeyComb = "Honeycomb";
        items.put(0, boots);
        items.put(1, crocodile);
        items.put(2, crocodile);
        items.put(3, polarbear);
        items.put(4, polarbear);
        items.put(5, wolf);
        items.put(6, wolf);
        items.put(7, rat);
        items.put(8, rat);
        items.put(9, card);
        items.put(10, card);
        items.put(11, card);
        items.put(12, card);
        items.put(13, lighter);
        items.put(14, deo);
        items.put(15, spider);
        items.put(16, honeyComb);
        items.put(17, cactus);
        items.put(18, cactus);
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }

    private String spin(){
        rnd = new Random();
        int temp = rnd.nextInt(19);
        String s = items.get(temp).toString();
        return s;
    }

    public String getSpin(){
        String result = "";
        switch(this.count){

            case 1:
                result = spin();
                break;
            case 2:
                result = spin() + "\n" + spin();
                break;
            case 3:
                result = spin() + "\n" + spin() + "\n" + spin();
                break;
            case 4:
                result = spin() + "\n" + spin() + "\n" + spin() + "\n" + spin();
                break;
            default:
                result = spin();
                break;
        }
        return result;
    }

}
