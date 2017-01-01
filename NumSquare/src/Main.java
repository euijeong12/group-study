import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		int[] D = new int[w+1];
		
		int Jp[] = new int[n];
		int Jw[] = new int[n];
		
		for (int i = 0; i < Jw.length; i++) {
			Jw[i] = sc.nextInt();
			Jp[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < Jw.length; i++) {
			D[Jw[i]] = Jp[i];
		}
		
		
		
		for (int i = 0; i < D.length; i++) {
			
			int max = 0;
			for (int j = 0; j < Jw.length; j++) {
				int m = 0;
				if(i-Jw[j] > 0)
					m = D[i - Jw[j]] + Jp[j];
				
				if(max < m){
					
					max = m;
					
				}
				
				
			}
			
			if(D[i] < max)
			D[i] = max;
		}
		
		
		int sol = 0;
		for (int i = 0; i <= w; i++) {
			System.out.println(D[i]);
			if(D[i] > sol)
				sol = D[i];
		}
		
		System.out.println(sol);
	}
}
