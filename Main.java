package com.company;

class one{
    int a;
    char b;
//Here Even though data members are not initialized it prints default values
    public void print1(){
        System.out.println(a+"   "+b);

    }
  //But in this as we are defining variables inside the method, it is becoming local to this method only,compiler willn't allow not iniatialized values
   /* public void localPrint2(){

        float c;
        String  d;
        System.out.println(c+"     "+d);

    }*/
}
class Second {
   String c;
//Only Static variables can be accessed inside static methods
   /* public static String print3(String p) {
        c = p;
        return c;

    }*/

   public String print4(String p) {
        c = p;
        return c;


    }


}

public class Main {

    public static void main(String[] args) {

      one o=new one();
      o.print1();
    //o.localPrint2();
//Static methods can directly be accessed without creating objects by its class name
     //String q=   Second.print3("Mjcet");
    //System.out .println( q);
        Second s=new Second();
    String j=s.print4("qadeer");
        System.out .println(j);
    }

    }

