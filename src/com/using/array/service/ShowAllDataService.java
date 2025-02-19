package com.using.array.service;
import com.using.array.model.Customer;
import com.using.array.model.ShowAllData;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowAllDataService {
    private ArrayList<ShowAllData> showAllData = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(ShowAllData showAllData) {

        System.out.println(showAllData);
    }

    public ShowAllData createShowAllData() {
        ShowAllData sd = new ShowAllData();
        System.out.println("All Data:");
        String nameshow = sc.nextLine();

        sd.setNameshow(nameshow);
        showAllData.add(sd);
        return sd;
    }
    public void displayShow() {
        for (ShowAllData sd : showAllData) {
            System.out.println("show data: " + sd);
        }
    }
}