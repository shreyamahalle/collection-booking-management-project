package com.using.array.service;
import com.using.array.model.DeliveryAgent;
import com.using.array.model.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {

    private ArrayList orders = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(Order order){

        System.out.println(order);
    }
    private Order createOrder(){

            System.out.println("Please enter id");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Please enter type");
            String type = sc.nextLine();

            System.out.println("Please enter note");
            String note = sc.nextLine();

            System.out.println("Please enter paymentMethod");
            String paymentMethod = sc.nextLine();

            Order o = new Order();

            o.setId(id);
            o.setPaymentMethod(paymentMethod);
            o.setNote(note);
            o.setType(type);
            orders.add(orders);
            return o;
        }
    public void displayCustomers(){
        for(Object order : orders){
            System.out.println("Customer Info: " + order);
        }
    }
}