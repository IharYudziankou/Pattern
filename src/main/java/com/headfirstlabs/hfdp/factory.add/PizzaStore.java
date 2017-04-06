package com.headfirstlabs.hfdp.factory.add;

import com.headfirstlabs.hfdp.factory.add.ingredient.PizzaIngredientFactory;
import com.headfirstlabs.hfdp.factory.add.pizza.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public abstract class PizzaStore {
    private Map<String, Class<? extends Pizza>> menu;

    public PizzaStore() {
        Map<String, Class<? extends Pizza>> map = new HashMap<>();
        map.put("cheese", CheesePizza.class);
        map.put("pepperoni", PepperoniPizza.class);
        map.put("clam", ClamPizza.class);
        map.put("veggie", VeggiePizza.class);

        menu = map;
    }


    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public Map<String, Class<? extends Pizza>> getMenu() {
        return menu;
    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = getIngredientFactory();

        Class<? extends Pizza> pizzaClass = menu.get(type);
        try {
            Constructor<? extends Pizza> constructor = pizzaClass.getConstructor(PizzaIngredientFactory.class);
            pizza = constructor.newInstance(ingredientFactory);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return pizza;
    }

    abstract PizzaIngredientFactory getIngredientFactory();

}
