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
public class StandardPrinter implements Printer{
    @Override
    public void print(Bill bill) {
        double total = 0;
        System.out.println(bill.getName());
        for (int i = 0; i < bill.getItems().length; i++) {
            System.out.printf("%d.\t%s\t\t%d\t%.2f\t%.2f\n",
                    (i + 1),
                    bill.getItems()[i].name,
                    bill.getItems()[i].amount,
                    bill.getItems()[i].qty,
                    bill.getItems()[i].amount * bill.getItems()[i].qty);
            total += bill.getItems()[i].amount * bill.getItems()[i].qty;
        }
        System.out.println("===================== Thanks ===================");
        System.out.println("\t\t\t\ttotal  : " + total);
        System.out.println("\t\t\t\tCash   : " + bill.getCash());
        System.out.println("\t\t\t\tchange : " + (bill.getCash() - total));
        System.out.println("================================================");
    }
    
}
