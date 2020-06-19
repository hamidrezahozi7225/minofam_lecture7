package com.company;

import com.company.Entity.SaipaEnti;
import com.company.Servis.SaipaServ;
import com.intellij.ide.ui.EditorOptionsTopHitProvider;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        try {
            SaipaServ.getInstance().save(new SaipaEnti().setId(4).setName("dena").setPrice(60000000).setColor("ghermez"));
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            System.out.println("inter code mashin mored nazar");
            int i=scanner.nextInt();
            SaipaServ.getInstance().remove(i);
            System.out.println("kharid ba movafaghiat anjam shod");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
