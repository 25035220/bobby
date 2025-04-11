/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bobby;

/**
 *
 * @author PATIENT
 */
import java.util.Scanner;
public class Bobby {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in) ;
      
       System.out.print(" Enter your number of minutes ");
       double min =input.nextDouble();
double hours=min/60;
System.out.print("your number of hours is :"+hours);
double days=hours/24;
System.out.print("your number of days is:"+days);





    }}



