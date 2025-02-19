package com.using.array.service;
import com.using.array.model.Customer;
import com.using.array.model.DeliveryAgent;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryAgentService {
    private ArrayList<DeliveryAgent> deliveryAgents = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(DeliveryAgent deliveryAgent){

        System.out.println(deliveryAgent);
    }

    public DeliveryAgent createDeliveryAgent(){

        DeliveryAgent deliveryAgent = new DeliveryAgent();
        System.out.println("Please enter id");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter name");
        String name = sc.nextLine();

        System.out.println("Please enter city");
        String city = sc.nextLine();

        System.out.println("Please enter mobileNo");
        int mobileNo = Integer.parseInt(sc.nextLine());

        deliveryAgent.setId(id);
        deliveryAgent.setName(name);
        deliveryAgent.setCity(city);
        deliveryAgent.setMobileNo(mobileNo);
        if(deliveryAgents.contains(deliveryAgent))
            System.out.println("Already present ");
        else{
            deliveryAgents.add(deliveryAgent);
        }
        deliveryAgents.add(deliveryAgent);
        return deliveryAgent;
    }
    public DeliveryAgent deleteDeliveryAgent(int deleteDeliveryAgentId){
        DeliveryAgent removedDeliveryAgent = deliveryAgents.remove(deleteDeliveryAgentId);
        return removedDeliveryAgent;
    }
    public DeliveryAgent displayDeliveryAgent(int deleteDeliveryAgentId){
        DeliveryAgent deliveryAgent = deliveryAgents.get(deleteDeliveryAgentId);
        return deliveryAgent;
    }


    public void displayDeliveryAgent(){
        for(DeliveryAgent deliveryAgent : deliveryAgents){
            System.out.println("Customer Info: " + deliveryAgent);
        }
}
}

