/*
Corrigé de la prof lisa murphy
17 10 2022
*/

import java.util.*;

public class StarSignApp {
    public static void main(String args[]){
        //vars
        String month;
        int date;
        String sign;

       //objetcs
        Scanner keyboard;
        keyboard=new Scanner(System.in);
        StarSign myStarSign;
        myStarSign=new StarSign();

       //input
        System.out.println("enter birth month");
        month=keyboard.nextLine(); //grabs the String //Line is String

     	System.out.println("enter date of birth");
        date=keyboard.nextInt(); //grabs the int

      	//set
      	myStarSign.setMonth(month); //look for a method
		myStarSign.setDate(date); //look for a method

        //process
        myStarSign.compute();

        //output
        sign=myStarSign.getSign();
        System.out.println("Your star sign is "+sign);

    }
}