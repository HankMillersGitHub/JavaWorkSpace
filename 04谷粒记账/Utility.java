import java.util.Scanner;
/**
	Utility工具类，将不同的功能封装为方法，就是可以直接通过调用方法使用它的功能，无需考虑实现细节
*/
class Utility{
	private static Scanner scanner = new Scanner(System.in);
	/**
		用于界面菜单的选择，如果输入正确字符，则方法返回，返回值为用户输入值，如果输入错误，重新输入
	*/
	public static char readMenuSelection(){
		char c ;
		for(;;){
			String str = readKeyBoard(1);
			c = str.charAt(0);
			if(c != '1' && c != '2' && c != '3' && c != '4'){
				System.out.println("选择错误，请重新输入：");
			}else{
				break;
			}
		}
		return c;
	}
	/**
		用于收入和指出金额的输入，该方法从键盘读取一个不超过四位数长度的整数，并将其作为方法的返回值
	*/
	public static int readNumber(){
		int n;
		for(;;){
			String str = readKeyBoard(4);
			try{
				n = Integer.parseInt(str);
				break;
			}catch(NumberFormatException e){
				System.out.println("数字输入错误，请重新输入：");
			}
		}
		return n;
	}
	/**
		用于收支说明的输入，该方法从键盘读取一个长度不超过8的字符串，并将其作为方法的返回值
	*/
	public static String readString(){
		String str = readKeyBoard(8);
		return str;
	}
	/**
		用于确认选择的输入，该方法从键盘读取y或n，并将其作为方法的返回值
	*/
	public static char readConfirmSelection(){
		char c;
		for(;;){
			String str = readKeyBoard(1).toUpperCase();
			c = str.charAt(0);
			if(c == 'Y' || c == 'N'){
				break;
			}else{
				System.out.println("输入错误，请重新输入:");
			}
			
		}
		return c;
	}
	/**
		该方法用于检测输入的数据是否符合调用该方法的要求，
		一个参数，表示要接受的字符串的最大长度
	*/
	private static String readKeyBoard(int limit){
		String line = "";
		while(scanner.hasNext()){
			line = scanner.nextLine();
			if(line.length() < 1 || line.length() > limit){
				System.out.println("输入错误，请重新输入：");
				continue;
			}
			break;
		}
		return line;
	}
}