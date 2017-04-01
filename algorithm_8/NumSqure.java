package algorithm_8;

import java.util.Scanner;

public class NumSqure {

	public static void main(String[] args) {
		int length = 0;
		
		Scanner scan = new Scanner(System.in);
		length = scan.nextInt();
		int arr[][] = new int[length][length]; 
		
		for(int i=0;i<length;i++){
			for(int j=0;j<length;j++){
				if (i % 2 == 0) {
                    arr[j][i] = func(length * i + j) + 65;
                    //System.out.println((length * i + j) + 65);
                } else {
                    arr[j][i] = func(length * (i + 1) - (j + 1)) + 65;
                	//System.out.println((length * (i+1) - (j+1))+65);
                }
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%c ", arr[i][j]);
            }
            System.out.println();
        }
	}
	
	static int func(int n){
		while(n > 25){
			n-=26;
		}
		return n;
	}

}
