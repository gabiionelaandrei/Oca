package oca;
import java.util.Scanner;
import java.lang.Math;
public class TriangleArea {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Please, enter A side of a triangle: ");
				
				double firstSide = sc.nextDouble();
				System.out.print("Please, enter B side of a triangle: ");
			
				double secondSide = sc.nextDouble();
				System.out.print("Please, enter C side of a triangle: ");
				
				double thirdSide = sc.nextDouble();
				// p = semiperimentru; 
				double p = (firstSide + secondSide + thirdSide)/2;
				double triangleArea =   Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide));
				System.out.println("Triangle area is: " + triangleArea);
				sc.close();
			}

		
	}


