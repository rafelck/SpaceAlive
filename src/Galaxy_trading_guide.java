
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafel
 */
public class Galaxy_trading_guide {

    public static void main(String[] args) {
        Map<String, Integer> sumItem = new HashMap();
        Map<String, String> itemData = new HashMap(); //save input data to hashmap

        System.out.println("The symbol value is:\nI 1\nV is 5\nX is 10\nL is 50\nC is 100\nD is 500\nM is 1,000");

        sumItem.put("I", 1);
        sumItem.put("V", 5);
        sumItem.put("X", 10);
        sumItem.put("L", 50);
        sumItem.put("C", 100);
        sumItem.put("D", 500);
        sumItem.put("M", 1000); //enter the roman data

        System.out.println("");
        
        Scanner catageory = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        Scanner item = new Scanner(System.in);
        //create scanner object        

        System.out.print("How much your item category? ");
        int vCategory = catageory.nextInt(); //get total of category item

        String vitem;
        String getValue;
        for (int i = 1; i <= vCategory; i++) {
            System.out.println("Item "+i+" : ");
            System.out.print("Please input yours item :");
            vitem = item.next();
            System.out.print("Please input symbol value :");
            getValue = value.next();

            itemData.put(vitem.toUpperCase(), getValue.toUpperCase());
            System.out.println("");
        }
        
        for (Map.Entry<String, String> entry : itemData.entrySet()) {
            String key = entry.getKey();
            String value1 = entry.getValue();
            
            if(sumItem.containsKey(value1))
                System.out.println(key+" is "+sumItem.get(value1)+" Credit");
            
            else System.out.println("I have no idea what you are talking about");
        }

    }

}
