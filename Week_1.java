import java.util.Scanner;

public class  Week_1{
	public static void main(String[] args){
		int m = 5;
		int n = 3;
		System.out.println("m="+m);
		System.out.println("n="+n);
		System.out.println("m+n="+(m+n));
		m++;
		System.out.println("m++后m为"+m);
		
		char c = '1';//字符练习
		int j = 2;
		System.out.println("j+'c'="+(j+'c'));
		
		double d=5.35;//小数练习
		System.out.println("d取整为"+(int)d);
		System.out.println("5326 / 1000 * 1000 ="+(5326 / 1000 * 1000 ));
		
		String s = "welcome to java";//字符串练习
		System.out.println(s);
		s += " and java is fun";
		System.out.println(s);		
		
		System.out.println("3 << 2 = "+(3 << 2));//位运算符练习
		System.out.println("3 << 2 = "+(12 >> 2));
		System.out.println("128 & 129 = "+(128 & 129 ));
		System.out.println("128 | 129 = "+(128 | 129 ));
		
		/*输入两个数字并转化为int类型*/
		Scanner input = new Scanner(System.in);//从键盘输入一个数字
		System.out.println("please enter a (int)number for a");
		String a = input.nextLine();
		System.out.println("please enter a (int)number for b");
		String b = input.nextLine();
		int inta = Integer.parseInt(a);//将string类型的数字转化为int类型
		int intb = Integer.parseInt(b);
		
		if(inta > intb){//if语句，用于true和false的判断
			switch (inta - intb){//switch语句，用于有多种结果的判断
			case 1:System.out.println("a 比  b 大 1");
				break;
			case 2:System.out.println("a 比  b 大 2");
				break;
			case 3:System.out.println("a 比  b 大3");
				break;
			case 4:System.out.println("a 比  b 大4");
				break;
			case 5:System.out.println("a 比  b 大5");
				break;
			default:System.out.println("a 比  b 大很多");
				break;
			}
		}
		else{
			if(intb - inta < 10){
			System.out.println("b到a之间的数依次为");
			/*for循环，用于多次重复判断*/
			for(int i = inta;i <= intb;i++)System.out.println(i);
				}
			}
		
	}
}
