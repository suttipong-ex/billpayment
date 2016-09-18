/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.th.geniustree.billpayment;

import java.util.jar.Attributes;

/**
 *
 * @author suttipong
 */
public class Item {
    public String name;
    public int amount;
    public double qty;
    public Item(String name, int amount, double qty) {
        this.name = name;
        this.amount = amount;
        this.qty = qty;
    } 
}
