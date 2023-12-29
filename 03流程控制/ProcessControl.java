// process control 意思是流程控制
import java.util.Scanner;
class ProcessControl{
	public static void main(String[] args){
		/*
			只能被自己和1整除的整数称为素数
		*/
		
		for(int i = 2;i<100;i++){
			boolean flag = false;
			for(int j = 2;j<i;j++){
				if(i%j==0){
					flag = true;
				}
			}
			if(!flag){
				System.out.println(i);
			}
		}

	}
	
}