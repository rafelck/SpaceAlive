
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
public class galaxy_trading_guid {

   
    public static void main(String[] args) {
        Map<String, Integer> sumItem = new HashMap();

        System.out.println("The symbol value is:\nI 1\nV is 5\nX is 10\nL is 50\nC is 100\nD is 500\nM is 1,000");

        sumItem.put("I", 1);
        sumItem.put("V", 5);
        sumItem.put("X", 10);
        sumItem.put("L", 50);
        sumItem.put("C", 100);
        sumItem.put("D", 500);
        sumItem.put("M", 1000);

        Scanner value = new Scanner(System.in);
        System.out.println("Enter your value :");
        String getValue = value.next();

        if (sumItem.containsKey(getValue.toUpperCase())) {
            System.out.println("Input is " + getValue.toUpperCase() + " = " + sumItem.get(getValue));
        } else {
            System.out.println("I have no idea what you are talking about.");
        }
    }

}
