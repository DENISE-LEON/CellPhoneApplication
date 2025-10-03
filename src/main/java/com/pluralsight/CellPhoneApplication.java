package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //prompt user
        System.out.println("What is the serial number?");
        int serialNum = scanner.nextInt();

        scanner.nextLine();

        System.out.println("What model is your phone");
        String model = scanner.nextLine();

        System.out.println("Who is your carrier?");
        String carrier = scanner.nextLine();

        System.out.println("What is your phone number?");
        String phoneNum = scanner.nextLine();

        System.out.println("What is your name?");
        String ownerName = scanner.nextLine();

        //initiating cellphone class
        CellPhone dPhone = new CellPhone(serialNum, model, carrier, phoneNum, ownerName);

        System.out.println(dPhone.getModel());


    }
}

//prompt user for info
//call cell phone class
//