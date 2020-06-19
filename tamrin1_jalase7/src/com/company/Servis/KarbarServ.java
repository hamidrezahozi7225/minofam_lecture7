package com.company.Servis;

import com.company.Entity.KarbarEnti;
import com.company.Repository.KarbarRepo;

import java.util.Scanner;

public class KarbarServ {

    Scanner scanner=new Scanner(System.in);
    private static KarbarServ ourInstance = new KarbarServ();

    public static KarbarServ getInstance() {
        return ourInstance;
    }

    private KarbarServ() {
    }
    public void save(KarbarEnti karbarEnti)throws Exception{
        try (KarbarRepo karbarRepo=new KarbarRepo()){
            karbarRepo.insert(karbarEnti);
            karbarRepo.commit();
        }
    }
    public void edit(KarbarEnti karbarEnti)throws Exception{
        try (KarbarRepo karbarRepo=new KarbarRepo()){
            System.out.println("1.2gig:1000tomn");
            System.out.println("2.4gig:2000tomn");
            System.out.println("3.10gig:5000tomn");
            System.out.println("4.25gig:10000tomn");
            System.out.print("whitch one:");
            int i=scanner.nextInt();
            switch (i){
                case 1:
                    karbarEnti.setHesab(karbarEnti.getHesab()- 1000 - karbarEnti.getHesab()* 9/100);
                    System.out.println("2gig sharj shod");
                karbarRepo.update(karbarEnti);
                    karbarRepo.commit();break;
                case 2 :
                karbarEnti.setHesab(karbarEnti.getHesab()- 2000 - karbarEnti.getHesab()* 9/100);
                System.out.println("4gig sharj shod");
                karbarRepo.update(karbarEnti);
                    karbarRepo.commit();break;
                case 3:
                karbarEnti.setHesab(karbarEnti.getHesab()- 5000 - karbarEnti.getHesab()* 9/100);
                System.out.println("10gig sharj shod");
                karbarRepo.update(karbarEnti);
                    karbarRepo.commit();break;
                case 4:
                karbarEnti.setHesab(karbarEnti.getHesab()- 10000 - karbarEnti.getHesab()* 9/100);
                System.out.println("25gig sharj shod");
                karbarRepo.update(karbarEnti);
                    karbarRepo.commit();break;
            }
        }
    }
}
