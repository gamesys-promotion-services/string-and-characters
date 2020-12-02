package com.example.demo.exercise;

import com.example.demo.enums.*;

/**
 * Exercise:
 * Run the main() below
 * Should be able to check if the emailSubject
 * is valid together with the it's amount
 * sample output if valid would be:
 * "November 2020 - COVID_DATA_ALLOWANCE with the amount of 2500.0 is valid"
 */
public class LastExercise {
    public static void main(String[] args) {
        System.out.println(validateReimbursementAmount("   November 2020 - COVID_DATA_ALLOWANCE  ", 2500));
    }

    public static String validateReimbursementAmount(String emailSubject, double amount) {
        String message = "invalid";
        for (EnumReimbursement reimbursement: EnumReimbursement.values()) {
            if(emailSubject.contains(reimbursement.toString()) && amount <= reimbursement.getAllowance()) {
                message = emailSubject.trim().concat(" with the amount of ").concat(String.valueOf(amount)).concat(" is valid") ;
            }
        }
        return message;
    }
}
