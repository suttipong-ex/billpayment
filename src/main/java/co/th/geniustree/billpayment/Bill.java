/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.th.geniustree.billpayment;

/**
 *
 * @author suttipong
 */
public class Bill {

    private Item[] items;
    private String name;
    private double total;
    private double cash;

    public Bill(Item[] items,double  cash,String name) {
        this.cash = cash;
        this.items = items;
        this.name = name;
    }
    
    public Item[] getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    public double getTotal() {
        return total;
    }

    public double getCash() {
        return cash;
    }
}
