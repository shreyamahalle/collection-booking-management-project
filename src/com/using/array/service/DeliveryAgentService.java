package com.using.array.service;
import com.using.array.model.Customer;
import com.using.array.model.DeliveryAgent;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryAgentService {
    private ArrayList deliveryAgents = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(DeliveryAgent da){

        System.out.println(da);
    }
    private DeliveryAgent createDeliveryAgent(){

        System.out.println("Please enter id");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter name");
        String name = sc.nextLine();

        System.out.println("Please enter city");
        String city = sc.nextLine();

        System.out.println("Please enter mobileNo");
        int mobileNo = Integer.parseInt(sc.nextLine());

        DeliveryAgent da = new DeliveryAgent();
        da.setId(id);
        da.setName(name);
        da.setCity(city);
        da.setMobileNo(mobileNo);
        deliveryAgents.add(da);
        return da;
    }

    public void displayDeliveryAgent(){
        for(Object da : deliveryAgents){
            System.out.println("Customer Info: " + da);
        }
    }
}


