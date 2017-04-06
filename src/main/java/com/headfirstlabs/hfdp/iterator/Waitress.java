package com.headfirstlabs.hfdp.iterator;

/**
 * Created by Ihar_Yudziankou on 4/5/2017.
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinnerMenu;

    public Waitress(final Menu pancakeHouseMenu, final Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        final java.util.Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        final java.util.Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("MENU\n----\nLUNCH");
        printMenu(dinnerIterator);
    }

    private void printMenu(final java.util.Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            final MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + "--");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printBreakfastMenu() {

    }

    public void printLunchMenu() {

    }

    public void printVegeterianMenu() {

    }

    public boolean isVegeterian(final String name) {
        return false;
    }

    public static void main(final String[] args) {
    }
}
