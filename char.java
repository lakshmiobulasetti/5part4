/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{

        String line;
        int value;
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        System.out.println("Enter a String :");
        line = sc.nextLine();
        for (int i=0; i<line.length(); i++) 
        {
            if(map.containsKey(line.charAt(i)))
            {
                value = map.get(line.charAt(i));
                value ++;
                map.put(line.charAt(i),value);
                }
                else
            {
                map.put(line.charAt(i),1);
            }
        }
        for ( Character key : map.keySet())
        {
            System.out.println("Character : '"+key+"' Count :"+map.get(key));
        }
    }
}
