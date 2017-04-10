package com.headfirstlabs.hfdp.composite;

import com.headfirstlabs.hfdp.iterator.DinnerMenu;
import com.headfirstlabs.hfdp.iterator.Menu;
import com.headfirstlabs.hfdp.iterator.PancakeHouseMenu;

import java.util.Arrays;


/**
 * Created by Ihar_Yudziankou on 4/5/2017.
 */
public class MenuTestDrive {
    public static void main(final String[] args) {
        final PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        final DinnerMenu dinnerMenu = new DinnerMenu();
        final CafeMenu cafeMenu = new CafeMenu();

        final Waitress waitress = new Waitress(Arrays.asList(new Menu[]{pancakeHouseMenu, dinnerMenu, cafeMenu}));

        waitress.printMenu();
    }
}
