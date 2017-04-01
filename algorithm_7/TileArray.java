package algorithm_7;

import java.util.Scanner;

public class TileArray {
	
	/* question : http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=687&sca=3050
	 * condition : 문제에서 준, 계산값을 나누는 정수
	 * */
	
	/** 1. 풀이법 
	public static void main(String[] args) {
		int input = 0;
		
		Scanner scan = new Scanner(System.in);
		TileArray tile = new TileArray();
		input = scan.nextInt();
		
		System.out.println(tile.OutputProcess(input));

	}
	
	public int OutputProcess(int input){
		int condition = 20100529;
		return (input<=1)?1:(OutputProcess(input-1) + 2*OutputProcess(input-2))%condition;
	}
	
	
	**/
	
	/** 2. 풀이법 **/
	 public static void main(String[] args) {
		int input,sum = 0;
		
		Scanner scan = new Scanner(System.in);
		TileArray tile = new TileArray();
		input = scan.nextInt();
		
		for(int i=1;i<=input;i++){
			if(i<=1)
				sum=1;
			else if(i>1 && i%2==1)
				sum = (2*sum -1)%20100529;
			else if(i>1 && i%2==0)
				sum = (2*sum +1)%20100529;
		}
		
		System.out.println(sum);

	}
	
}


