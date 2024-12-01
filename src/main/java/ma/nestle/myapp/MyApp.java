package ma.nestle.myapp;

import ma.nestle.myapp.service.MyService;


public class MyApp {


public static void main (String[] args){
    if (args.length!= 2) {
        System.out.println("entrer deux valeurs");
        System.exit(0);
        
    }
    double a,b;
    a=Double.parseDouble(args[0]);
    b=Double.parseDouble(args[1]);


    MyService myService=new MyService();
 System.out.println("la somme de "+ a+" et "+ b+" est :" + myService.somme(a,b));

 }
}