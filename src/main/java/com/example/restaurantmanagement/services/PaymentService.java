package com.example.restaurantmanagement.services;


import org.example.machineCoding.restaurentMgmtSystem.exceptions.InvalidBillException;
import org.example.machineCoding.restaurentMgmtSystem.models.Payment;

public interface PaymentService {
    Payment makePayment(long billId) throws InvalidBillException;
}
