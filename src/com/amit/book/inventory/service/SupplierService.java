package com.amit.book.inventory.service;

import com.amit.book.inventory.model.Supplier;

import java.util.HashSet;
import java.util.Scanner;

public class SupplierService {

    private HashSet<Supplier> suppliers = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    public void acceptingSupplierInfo(){

        Supplier supplier = new Supplier();

        System.out.println("Enter supplier id");
        int supplierId = Integer.parseInt(scanner.nextLine());
        supplier.setSupplierID(supplierId);

        System.out.println("Enter supplier name");
        String name = scanner.nextLine();
        supplier.setSupplierName(name);

        System.out.println("Enter supplier address");
        String address = scanner.nextLine();
        supplier.setSupplierAddress(address);

        System.out.println("Enter supplier contact number");
        Long contact = Long.valueOf(scanner.nextLine());
        supplier.setSupplierContact(contact);

        System.out.println("Enter supplier Email ID");
        String emailID = scanner.nextLine();
        supplier.setSupplierEmailId(emailID);

        suppliers.add(supplier);
    }

    public void displaySupplierInfo(){
        for (Supplier supplier : suppliers){
            System.out.println("Supplier Info : " +supplier);
        }
    }

}