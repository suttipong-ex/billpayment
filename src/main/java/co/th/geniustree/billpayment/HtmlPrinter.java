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
public class HtmlPrinter implements Printer {

    @Override
    public void print(Bill bill) {
        System.out.println(" Html Printer ");
        double total = 0;
        System.out.println(bill.getName());
        for (int i = 0; i < bill.getItems().length; i++) {
            System.out.println("<tr> <td>"+(i+1)+"</td> <td>"+bill.getItems()[i].name+"</td> <td>"+bill.getItems()[i].amount+"</td> <td>"+bill.getItems()[i].qty+"</td> "
                    +"<td>"+bill.getItems()[i].amount * bill.getItems()[i].qty+"</td> </tr>");
            total += bill.getItems()[i].amount * bill.getItems()[i].qty;
        }
        System.out.println("===================== Thanks ===================");
        System.out.println("\t\t\t\ttotal  : " + total);
        System.out.println("\t\t\t\tCash   : " + bill.getCash());
        System.out.println("\t\t\t\tchange : " + (bill.getCash() - total));
        System.out.println("================================================");
    }
}
