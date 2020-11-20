package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class GunManager {
    private ArrayList<Gun> Guns;

    public GunManager(){};
    public GunManager(ArrayList<Gun> guns)
    {
        Guns = guns;
    }

    static class LengthComparator implements Comparator<Gun>
    {
        @Override

        public int compare(Gun g1, Gun g2)

        {
            return (g1.GetLength()>g2.GetLength())? 1:-1;
        }
    }
    class LengthDecComparator implements Comparator<Gun>
    {
        @Override
        public int compare(Gun g1, Gun g2)
        {
            return (g1.GetLength()<g2.GetLength())? 1:-1;
        }
    }
    private Comparator<Gun> PriceComparator = new Comparator<Gun>()
    {
        @Override
        public int compare(Gun g1, Gun g2)
        {
            return (g1.GetPrice()>g2.GetPrice())? 1:-1;
        }
    };

    public void SortByLength()
    {
        Guns.sort(new LengthComparator());
        PrintGuns();
    }
    public void SortByDecLength()
    {
        Guns.sort(new LengthDecComparator());
        PrintGuns();
    }
    public void SortByPrice()
    {
        Guns.sort(PriceComparator);
        PrintGuns();
    }
    public void SortByDecPrice()
    {
        Comparator<Gun> PriceDecComparator = ((x,y) ->
        {
            return (x.GetPrice()<y.GetPrice())? 1:-1;
        });
        Guns.sort(PriceDecComparator);
        PrintGuns();
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
        System.out.format("%20s%10s%10s", "Name", "Length", "Price");
        System.out.println();
        for(int i = 0; i < Guns.size(); i++)
        {
            System.out.format("%20s%10d%10d$", Guns.get(i).GetName(), Guns.get(i).GetLength(),Guns.get(i).GetPrice());
            System.out.println();
        }
        System.out.println();
    }
}

