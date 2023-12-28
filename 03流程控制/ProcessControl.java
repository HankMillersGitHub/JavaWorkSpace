// process control 意思是流程控制
import java.util.Scanner;
class ProcessControl{
	public static void main(String[] args){
		/*
			
		*/
		for(int i = 1;i <= 9;i++){
			for(int j = 1;j <= i;j++){
				System.out.print(j + "*" + i + "=" + i * j +" ");
			}
			System.out.println("");
		}
	}
	
}