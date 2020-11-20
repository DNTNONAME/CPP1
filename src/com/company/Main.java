package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

                Squad squad = new Squad("Squad");
                squad.Add(new Gun("Knife", 12, "Recon", 1400));
                squad.Add(new Gun("Shotgun", 99, "Assault", 1700));
                squad.Add(new Gun("Machine Gun", 183, "Assault", 1600));
                squad.Add(new Gun("M4A1", 112, "Assault", 1200));
                squad.Add(new Gun("M4", 101, "Assault", 1100));
                squad.Add(new Gun("SniperRifle", 100, "Recon", 1300));
                squad.Add(new Gun("Pistol", 70, "Recon", 1200));
                squad.PrintGuns();

                ArrayList<Gun> SearchedGuns = squad.SearchByTarget("Recon");
                GunManager manager = new GunManager(SearchedGuns);

                System.out.println("Searched by target: Recon");
                manager.PrintGuns();

                System.out.println("Sorted by length (using static inner class).");
                manager.SortByLength();

                System.out.println("Sorted by length in descending order (using inner class).");
                manager.SortByDecLength();

                System.out.println("Sorted by price (using anonymous inner class).");
                manager.SortByPrice();

                System.out.println("Sorted by price in descending order (lambda expression).");
                manager.SortByDecPrice();
    }
}
