package JAVA;

import java.util.Scanner;

public class EjemploArraysPorParametro {
	static Scanner entrada=new Scanner(System.in);
	static final int TAM=3;
	
	public static void main(String[] args) {
		int[] nums=new int[TAM];
		rellenaArray(nums);
		int[] numsX2=multiplicaPorDos(nums);
		
		for(int i=0;i<TAM;i++) {
			System.out.println(numsX2[i]);
		}

	}
	
	public static void rellenaArray (int[] nums) {
		System.out.println("Introduce "+TAM+" numeros:");
		for (int i=0;i<TAM;i++) {
			nums[i]=entrada.nextInt();
		}
	}
	
	public static int[] multiplicaPorDos (int[] nums) {
		int[] numsX2=new int[TAM];
		for(int i=0;i<TAM;i++) {
			numsX2[i]=nums[i]*2;
		}
		return numsX2;
	}

}