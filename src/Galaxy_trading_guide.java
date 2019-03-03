
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
        Map<String, String> itemData = new HashMap();

        System.out.println("The symbol value is:\nI 1\nV is 5\nX is 10\nL is 50\nC is 100\nD is 500\nM is 1,000");

        sumItem.put("I", 1);
        sumItem.put("V", 5);
        sumItem.put("X", 10);
        sumItem.put("L", 50);
        sumItem.put("C", 100);
        sumItem.put("D", 500);
        sumItem.put("M", 1000);

        System.out.println("");
        Scanner catageory = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        Scanner item = new Scanner(System.in);

        System.out.print("How much your item category? ");
        int vCategory = catageory.nextInt();

        for (int i = 1; i <= vCategory; i++) {
            System.out.println("Please input yours item :");
            String vitem = item.next();
            String getValue = value.next();
            
            itemData.put(vitem, getValue);
        }

        System.out.println(itemData);

//        if (sumItem.containsKey(getValue.toUpperCase())) {
//            System.out.println("Input is " + getValue.toUpperCase() + " = " + sumItem.get(getValue.toUpperCase()));
//        } else {
//            System.out.println("I have no idea what you are talking about.");
//        }
    }

}
