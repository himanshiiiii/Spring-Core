package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
//        Database database= (Database) applicationContext.getBean("Database");
//        System.out.println(database);

        Restaurant restaurant= (Restaurant) applicationContext.getBean("teaRestaurant");
        restaurant.getHotDrink().prepareHotDrink();
        System.out.println(applicationContext.isPrototype("teaRestaurant"));

//        Complex complex= (Complex) applicationContext.getBean("complexBean");
//        System.out.println(complex);






        //for my understanding----------

//        HotDrink hotDrink=new Tea();
//        hotDrink.prepareHotDrink();
//        HotDrink hotDrink1=new ExpressTea();
//        hotDrink1.prepareHotDrink();


    }
}
