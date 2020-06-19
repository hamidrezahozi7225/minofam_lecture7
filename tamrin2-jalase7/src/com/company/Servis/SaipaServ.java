package com.company.Servis;

import com.company.Entity.SaipaEnti;
import com.company.Repository.SaipaRepo;

import java.util.List;

public class SaipaServ {
    private static SaipaServ ourInstance = new SaipaServ();

    public static SaipaServ getInstance() {
        return ourInstance;
    }

    private SaipaServ() {
    }
    public void save(SaipaEnti saipaEnti)throws Exception{
        try (SaipaRepo saipaRepo=new SaipaRepo()){
            saipaRepo.insert(saipaEnti);
        }
    }
    public void remove(int id)throws Exception{
        try (SaipaRepo saipaRepo=new SaipaRepo()){
            saipaRepo.delete(id);
        }
    }
}
