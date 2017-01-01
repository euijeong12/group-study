import java.util.Scanner;

public class numSquare {

	public static void main(String[] args) {
		
		System.out.println("2개의 숫자 입력 : ");
		//1. 입력값받기
		Scanner scan = new Scanner(System.in); 
		
		// n : 높이 , m : 너비
		int n = 0, m = 0;

		n = scan.nextInt();
		m = scan.nextInt();
		
		scan.close();
		
		//2. 알고리즘 
		numSquare(n,m);	
	}
	
	//알고리즘
	public static void numSquare(int n, int m){
		
//		int countNum = 1;
//		for (int j=0; j<n;j++){
//			for(int i=0;i<m;i++){
//				
//				if(j%2==0){
//					if(i==0)
//						countNum = j * m +1;
//					
//					System.out.print(countNum + " ");
//					countNum ++;
//				}
//				
//				else if(j%2==1){
//					if(i==0)
//						countNum = countNum + m -1;
//					
//					System.out.print(countNum + " ");
//					countNum --;
//				}
//			}
//			System.out.println();
//		}
		
		int line = 1;
		int lineFirstNum = 0;
		int factor = 1;
		for(int i = 1; i <= m*n; i++) {
			System.out.print((lineFirstNum += factor) + " ");
			
			if(i % m == 0) {
				line++;
				if(line % 2 == 0) {
					lineFirstNum = line * m + 1;
				} else {
					lineFirstNum = i;
				}
				factor *= -1;
				System.out.println();
			}
		}
		
	}
	 
}
