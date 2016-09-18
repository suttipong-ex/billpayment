/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.th.geniustree.billpayment;

import java.util.Scanner;

/**
 *
 * @author suttipong
 */
public class Main {
    public static void main(String[] args) {
        Item[] items = loadData();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Cash = ");
        int cash = sc.nextInt();
        Bill bill = new Bill(items,cash,"==================OBJECT SHOP===================");
        Printer print = printerFactory();
        print.print(bill);
    }

    private static Printer printerFactory() {
        return new StandardPrinter();
    }

    private static Item[] loadData() {
        Item[] items = new Item[3];
        Item item1  = new Item("water", 2, 10);
        Item item2 = new Item("soap", 1, 12);
        Item item3 = new Item("bread", 3, 20);
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
        return items;
    }
}
