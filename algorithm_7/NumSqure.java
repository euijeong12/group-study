package algorithm_7;
import java.util.Scanner;

public class NumSqure {
	
	/* 문제url : http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=1316&sca=2010 
	 * length : 정사각형 한변의 길이 , kindOfOutput : 출력 종류
	 * */ 

	public static void main(String[] args) {
		
		int length , kindOfOutput = 0;
		
		Scanner scan = new Scanner(System.in);
		OutputProcess process = new OutputProcess();
		
		//System.out.println("해당 숫자 입력 : ");
		length = scan.nextInt();
		kindOfOutput = scan.nextInt();
		
		switch(kindOfOutput){
			case 1 : process.RowRepeat(length); break;
			case 2 : process.RowRecurse(length);break;
			case 3 : process.RowMultiple(length);break;
			default : System.out.println("해당되는 종류는 존재하지 않습니다."); break; 
		}
	}	
}

class OutputProcess {
	
	//case 1 : 
	public void RowRepeat(int length){	
		for(int i=1;i<=length;i++){
			for(int j=1;j<=length;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	//case 2 :
	public void RowRecurse(int length){
		int count,CurrentNum = 1;
		for(int i=1;i<=length;i++){
			//방향전환
			if(i%2==0) count = -1;
			else count = 1;
			//print
			for(int j=1;j<=length;j++){
				System.out.print(CurrentNum+" ");
				if(j!=length) CurrentNum += count;
			}
			System.out.println();
		}
	}
	
	//case 3 :
	public void RowMultiple(int length){
		for(int i=1;i<=length;i++){
			for(int j=1;j<=length;j++){
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}

