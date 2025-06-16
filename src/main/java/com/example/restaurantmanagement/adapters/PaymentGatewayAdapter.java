package com.example.restaurantmanagement.adapters;


import org.example.machineCoding.restaurentMgmtSystem.models.Payment;

public interface PaymentGatewayAdapter {

    Payment makePayment(long billId, double amount);
}
