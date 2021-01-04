//Programmer: Marissa Gonçalves
//Date: August 28, 2017
//Purpose: This program should be able to print a sphere's volume and surface area, based on the typed radius value.

import java.util.Scanner;

public class Sphere

{
	public static void main (String[] args)

    {
	    Scanner keyboard = new Scanner(System.in);

        //allow the program to type an input of the radius, in order for the volume and the surface area to be calculated in the following steps;
	    System.out.print ("Enter the radius of the sphere: ");
	    double radius = keyboard.nextDouble ();

	    System.out.println ();

        //the sphere radius is identified as the input;
	    System.out.println ("Sphere Radius: " + radius);

        //calculate the volume based on the formula and its inputed radius;
	    double volume = (4.0/3.0) * Math.PI * (radius * radius * radius);
	    System.out.println ("Volume: " + volume);

        //calculate the area based on the formula and its inputed radius;
	    double surface_area = (4.0) * Math.PI * (radius * radius);
	    System.out.println ("Surface Area: " + surface_area);

        System.out.println ();
     }
 }