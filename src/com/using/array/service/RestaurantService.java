package com.using.array.service;

import com.using.array.model.Customer;
import com.using.array.model.Restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantService {
    private ArrayList restaurants = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(Restaurant restaurant){

        System.out.println(restaurant);
    }
    private Restaurant createRestaurant(){

            System.out.println("Please enter registerNo");
            int registerNo = Integer.parseInt(sc.nextLine());

            System.out.println("Please enter name");
            String name = sc.nextLine();

            System.out.println("Please enter city");
            String city = sc.nextLine();

            System.out.println("Please enter area");
            String area = sc.nextLine();

            Restaurant r = new Restaurant();

            r.setRegisterNo(registerNo);
            r.setName(name);
            r.setCity(city);
            r.setArea(area);
            return r;
        }
    public void displayRestaurant(){
        for(Object restaurant : restaurants){
            System.out.println("Customer Info: " + restaurant);
        }
    }
}