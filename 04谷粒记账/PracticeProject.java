import java.util.Scanner;
class PracticeProject{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		/*
			假设家庭起始的生活基本金为10000元
			每次登记收入后，收入的金额应该累加到基本金上，并记录本次收入明细，以便日后查询
			每次登记支出后，指出的金额应该从基本金中扣除，并记录本次指出明细，以便日后查询
			查询收支明细时，显示所有的收入，支出明细列表
			
		*/ 
		// while(int i = 1){
			System.out.println("--------Hank记账软件--------\n");
			System.out.println("        1. 收支明细        ");
			System.out.println("        2. 登记收入        ");
			System.out.println("        3. 登记支出        ");
			System.out.println("        4. 退    出        \n");
			System.out.println("--------Hank记账软件--------");
			System.out.print("        请选择1-4：");
			char key = Utility.readMenuSelection();
			System.out.println(key);

		// }
	}
}