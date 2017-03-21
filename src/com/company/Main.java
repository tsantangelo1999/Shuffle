package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws IOException
    {
	    Scanner sc = new Scanner(new File("names.txt"));
        ArrayList<String> names = new ArrayList<>();
        while(sc.hasNextLine())
        {
            names.add(sc.nextLine());
        }
        shuffle(names);
        for(String s : names)
            System.out.println(s);
    }

    public static void shuffle(ArrayList<String> init)
    {
        int value = 0;
        while(value < init.size())
        {
            int index = (int)(Math.random() * (init.size() - value)) + value; //random from remaining elements, "+ value" shifts index past shuffled area
            {
                //Swap
                String temp = init.get(value);
                init.set(value, init.get(index));
                init.set(index, temp);
            }
            value++;
        }
    }
}
