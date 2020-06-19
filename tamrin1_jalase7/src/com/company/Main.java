package com.company;

import com.company.Entity.KarbarEnti;
import com.company.Repository.KarbarRepo;
import com.company.Servis.KarbarServ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.print("name karbari:");
        String name=scanner.next();
        System.out.print("password:");
        int pass=scanner.nextInt();
        System.out.print("mandeye hesab:");
        int hesab=scanner.nextInt();
        try {
            KarbarServ.getInstance().save(new KarbarEnti().setName(name).setPassword(pass).setHesab(hesab));
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            KarbarServ.getInstance().edit(new KarbarEnti().setHesab(hesab).setName(name));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
