package com.headfirstlabs.hfdp.iterator;

/**
 * Created by Ihar_Yudziankou on 4/5/2017.
 */
public class MenuTestDrive {
    public static void main(final String[] args) {
        final PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        final DinnerMenu dinnerMenu = new DinnerMenu();

        final Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);

        waitress.printMenu();
    }
}
