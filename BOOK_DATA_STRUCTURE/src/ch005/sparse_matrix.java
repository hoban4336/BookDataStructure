package ch005;

import java.util.List;

public class sparse_matrix {

	public static void main(String[] args) {
		// 일반 배열
		int[][] h_array = new int[][] { { 0, 0, 0, 9 }, { 0, 1, 0, 0 },
				{ 0, 0, 0, 0 }, { 0, 0, 7, 0 }, { 0, 0, 0, 0 }, { 3, 0, 0, 0 },
				{ 0, 0, 0, 0 } };
		//전치 행렬 논리 구조.
		int[][] logicArray = null;
		int[][] reverse_logicArray = null;
		// 일반 배열 구조 
		int notZeroCount = 0;
				
		for (int i = 0; i < h_array.length; i++) 
		{
			for (int j = 0; j < h_array[0].length; j++)
			{
				System.out.print(h_array[i][j] + "\t");
				if(h_array[i][j]>0)
				{
					notZeroCount ++;
				}
			}
			System.out.println();
		}
		
		//-----------------------------------------------
		
		//일반 배열 -> 논리적 구조 저장 
		logicArray = new int[notZeroCount+1][3];
		reverse_logicArray = new int[notZeroCount+1][3];
		
		logicArray[0][0] =h_array.length ;
		logicArray[0][1] =h_array[0].length ;
		logicArray[0][2] = notZeroCount;
		
		notZeroCount = 0; 
		for (int i = 0; i < h_array.length; i++) 
		{
			for (int j = 0; j < h_array[0].length; j++)
			{
				if(h_array[i][j]>0)
				{
					notZeroCount ++;
					logicArray[notZeroCount][0] =i  ; 
					logicArray[notZeroCount][1] =j ;
					logicArray[notZeroCount][2] =h_array[i][j] ;
				}
			}
		}
		System.out.println();
		System.out.println();
		//-----------------------------------------------
		//논리 구조 Print
		
		for( int i = 0; i <logicArray.length ; i++){
			
			for( int j = 0; j< logicArray[i].length ; j++){
				 System.out.print(logicArray[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//-----------------------------------------------
		//일반 배열 구조 전치하기
		for (int i = 0; i < h_array[0].length; i++)
		{
			for (int j = 0; j < h_array.length; j++) 
			{
				System.out.print(h_array[j][i] + "\t");			
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//-----------------------------------------------
		//논리 구조 전치하기
		
		int h_array_length = logicArray[0][0];
		int h_array0_length = logicArray[0][1];
		
		reverse_logicArray[0][0] = logicArray[0][1]; //  h_array0_length
		reverse_logicArray[0][1] = logicArray[0][0];  // h_array_length
		reverse_logicArray[0][2] = logicArray[0][2];
		
		int p = 1;
		for(int i = 0; i < h_array0_length; i++){
			for( int j = 1 ; j <= logicArray[0][2]; j++){
				if(logicArray[j][1]== i ){
					reverse_logicArray[p][0] =  logicArray[j][1];
					reverse_logicArray[p][1] =  logicArray[j][0];
					reverse_logicArray[p][2] =  logicArray[j][2];
					p++;
				}
			}
		}
		
		System.out.println();
		System.out.println();
		//-----------------------------------------------
		//논리 구조 reverse_logicArray
		
		for( int i = 0; i <reverse_logicArray.length ; i++){
			
			for( int j = 0; j< reverse_logicArray[i].length ; j++){
				 System.out.print(reverse_logicArray[i][j] + "\t");
			}
			System.out.println();
		}
		
		

		
		

		
		
		
	}

}
