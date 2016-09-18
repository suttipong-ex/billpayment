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
        Bill bill = new Bill(items, cash, "================================================\n\t\t OBJECT SHOP\n================================================");
        Printer print = printerFactory();
        print.print(bill);
    }

    private static Printer printerFactory() {
        return new HtmlPrinter();
    }

    private static Item[] loadData() {
        Item item1 = new Item("water", 2, 10);
        Item item2 = new Item("soap", 1, 12);
        Item item3 = new Item("bread", 3, 20);
        Item item4 = new Item("soda", 2, 15);
        Item item5 = new Item("food", 1, 70);
        Item item6 = new Item("yom", 1, 90);
        Item[] items = new Item[]{item1,item2,item3,item4,item5,item6};
        return items;
    }
}
