
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-24
 */
public class pbomario {
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 20;
        
        double nilaiC = 10;
        double nilaiD = 9;
        
        Boolean isPlus = true;
       
        System.out.println("nilai A: "+ nilaiA);
        System.out.println("nilai B: "+ nilaiB);
        System.out.println("nilai C: "+ nilaiC);
        System.out.println("nilai D: "+ nilaiD);  
        System.out.println("is Plus: "+ isPlus);
        
        Scanner input = new Scanner (System.in);
        System.out.println("Silahkan input nilai A: ");
        nilaiA = input.nextInt();
        System.out.println("Silahkan input nilai B: ");
        nilaiB = input.nextInt();
        System.out.println("Silahkan input nilai C: ");
        nilaiC = input.nextDouble();
        System.out.println("Silahkan inputnilai D: ");
        nilaiD = input.nextDouble();
        System.out.println("Silahkan input nilai Boolean: ");
        isPlus = input.nextBoolean();
        
        String nama = "Mario";
        System.out.println("Silahkan input nama anda: ");
        nama = input.nextLine();
        nama = input.nextLine();
        System.out.println("Mario Yudha Pratama; "+ nama);
        

    }
    }
    
    

