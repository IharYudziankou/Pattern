package com.headfirstlabs.hfdp.composite;

/**
 * Created by Ihar_Yudziankou on 4/5/2017.
 */
public class MenuTestDrive {
    public static void main(final String[] args) {
        final MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        final MenuComponent dinnerMenu = new Menu("DINNER MENU", "Lunch");
        final MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        final MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        final MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);


        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choise of blueberries or strawberries", true, 3.59));

        dinnerMenu.add(new MenuItem("Vegeterian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinnerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinnerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
        dinnerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onion, topped with scheese", false, 3.05));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito, with wholke pinto beans, salsa, guacamole", true, 4.29));

        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie with a flakey crust, topped with vanilla icecream", true, 1.59));


        final Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();

        waitress.printVegetarianMenu();
    }
}
