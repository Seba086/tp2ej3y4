package ej3tp2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		int[] arregl1 = new int[100000];
		int[] arregl2 = new int[100000];
		BubbleSort burbujita = new BubbleSort();

		for (int i = 0; i < 100000; i++) {
			int temp = (int) (Math.random() * 100000);
			arregl1[i] = temp;
			arregl2[i] = temp;
		}

		System.out.println();
		System.out.println("ARREGLO ORDENADO BURBUJA");
		Date inicioArray = new Date();
		burbujita.burbuja(arregl1);
		Date finalArray = new Date();
		
		
		
		

	// ------------------------ EJERCICIO 4 ----------------------
	MergeSort merge = new MergeSort();
	Date inicioMerge = new Date();
	merge.sort(arregl2);
	Date finalMerge = new Date();
	


	System.out.println();
	System.out.println(inicioArray);
	System.out.println(finalArray);
	
	long resultadoArray = finalArray.getTime() - inicioArray.getTime();
	System.out.println(resultadoArray / 1000 + "segundos BURBUJA");

	System.out.println();
	System.out.println(inicioMerge);
	System.out.println(finalMerge);
	
	long resultadoMerge = finalMerge.getTime() - inicioMerge.getTime();
	System.out.println(resultadoMerge / 1000 + "segundos MERGESORTE");
	
	
	for (int i = 0; i <1000 ; i++){
		System.out.print(arregl2[i] + " - ");
	}
	
}
}