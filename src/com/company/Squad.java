package com.company;

import java.util.ArrayList;

public class Squad {
    private ArrayList<Gun> Guns = new ArrayList<>();
    private String Name;

    public Squad(){};
    public Squad(String name)
    {
        Name = name;
    };

    ArrayList<Gun> GetSongs(){ return Guns; }
    String GetName(){ return Name; }

    void Add(Gun song){
        if(!(Guns.contains(song)))
            Guns.add(song);
    }

    public ArrayList<Gun> SearchByTarget(String target){
        ArrayList<Gun> temp = new ArrayList<>();
        for(int i =0; i < Guns.size(); i++)
        {
            if(Guns.get(i).GetTarget() == target)
                temp.add(Guns.get(i));
        }
        return temp;
    }
    void PrintGuns()
    {
        System.out.format("%20s%10s%10s",  "Name", "Length", "Price");
        System.out.println();
        for(int i = 0; i < Guns.size(); i++)
        {
            System.out.format("%20s%10d%10d$", Guns.get(i).GetName(), Guns.get(i).GetLength(),Guns.get(i).GetPrice());
            System.out.println();
        }
        System.out.println();
    }
}
