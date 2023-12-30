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
		boolean falg = true;
		// 初始金额
		int balance = 10000;
		// 记录收支信息
		String info = "";
		while(falg){
			System.out.println("--------Hank记账软件--------\n");
			System.out.println("        1. 收支明细        ");
			System.out.println("        2. 登记收入        ");
			System.out.println("        3. 登记支出        ");
			System.out.println("        4. 退    出        \n");
			System.out.println("--------Hank记账软件--------");
			System.out.print("        请选择1-4：");
			// 用户输入 格式为char
			char key = Utility.readMenuSelection();
			switch(key){
				case '1':
					System.out.println("--------当前收支明细记录--------");
					System.out.println("收支\t账户金额\t收支金额\t说明");
					System.out.println(info);
					System.out.println("-------------------------------");
					break;
				case '2':
					System.out.print("本次收入金额：");
					// income 表示收入金额
					int income = Utility.readNumber();
					System.out.print("本次收入说明：");
					// illustrate 表示支出的说明
					String illustrate = Utility.readString();
					balance += income;
					info += "收入" + "\t" + balance + "\t\t" + income + "\t\t" + illustrate + "\n"; 
					System.out.println("-------------登记完成-------------");
					break;
				case '3':
					System.out.print("本次支出金额：");
					// expenditure 表示支出金额
					int expenditure = Utility.readNumber();
					System.out.print("本次支出说明：");
					// infomation 表示支出的说明
					String infomation = Utility.readString();
					balance -= expenditure;
					info += "支出" + "\t" + balance + "\t\t" + expenditure + "\t\t" + infomation + "\n"; 
					System.out.println("-------------登记完成-------------");
					break;
				// 退出的逻辑
				case '4':
					System.out.print("确认是否退出( Y / N ):");
					char exit = Utility.readConfirmSelection();
					if(exit == 'Y'){
						falg = false;
					}else{
						break;
					}
					break;
				
			}

		}
	}
}