package day2;

import java.util.*;
//FoodOrderQueue
//A restaurant receives food orders.
//
//Orders are prepared in the order they arrive.
//
//Rahul  -> Pizza 🍕
//Priya  -> Burger 🍔
//Amit   -> Biryani 🍗
//Sneha  -> Ice Cream 🍨
//
//Kitchen prepares
//
//🍕 Pizza
//🍔 Burger
//🍗 Biryani
//🍨 Ice Cream
public class Demo05QuequDemoEx2 {

    public static void main(String[] args) {

        Queue<String> orders = new LinkedList<>();

        orders.offer("Pizza - Rahul");
        orders.offer("Burger - Priya");
        orders.offer("Biryani - Amit");
        orders.offer("Ice Cream - Sneha");

        while(!orders.isEmpty()){

            System.out.println("👨‍🍳 Preparing : " + orders.peek());

            orders.poll();

            System.out.println("Pending : " + orders);
            System.out.println("-------------------");
        }

        System.out.println("✅ All Orders Delivered");
    }
}