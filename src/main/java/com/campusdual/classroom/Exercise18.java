package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
	int n = Utils.integer("Ingrese numeros naturales: ");
	int [] array = createAndInitializeArray(n);
		System.out.println("Elementos del array");

		showInlineArray(array);

	}
	//metodo
	public static int[]createAndInitializeArray (int n) {
		int[] array = new int[n];
		for (int i = 0; i<n; i++){
			array[i] = i + 1;
		}
		return array;
	}

	public static void showInlineArray(int[] array) {
		for (int i = 0; i<array.length; i++){
			System.out.print(array[i]);
			if(i < array.length -1) {
				System.out.println(" ");
			}
		}
		System.out.println();
	}
}
