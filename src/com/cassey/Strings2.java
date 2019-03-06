package com.cassey;

public class Strings2 {

    public static void main(String[] args) {

        String mpesa ="NBS12MTPK Confirmed. Ksh 60000.00 sent to Tom Matata"+"+254923456789 on 28/2/19 at 6.10PM. New Mpesa balance is"+"Ksh 3400. Transaction cost, Ksh 15.00" ;

        int pos_ksh = mpesa.indexOf("Ksh");
        int pos_sent = mpesa.indexOf("sent");
        String amount = mpesa.substring(pos_ksh, pos_sent);
        System.out.println(amount);

        int pos_On= mpesa.indexOf(" on ")+3;
        int pos_at = mpesa.indexOf(" at ");
        String date = mpesa.substring(pos_On, pos_at);
        System.out.println(date);

        int pos_is= mpesa.indexOf("is")+2;
        int pos_trans = mpesa.indexOf("Transaction");
        String balance = mpesa.substring(pos_is, pos_trans);
        System.out.println(balance);







    }




}
