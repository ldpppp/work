import java.util.Scanner;

public class  Week_1{
	public static void main(String[] args){
		int m = 5;
		int n = 3;
		System.out.println("m="+m);
		System.out.println("n="+n);
		System.out.println("m+n="+(m+n));
		m++;
		System.out.println("m++��mΪ"+m);
		
		char c = '1';//�ַ���ϰ
		int j = 2;
		System.out.println("j+'c'="+(j+'c'));
		
		double d=5.35;//С����ϰ
		System.out.println("dȡ��Ϊ"+(int)d);
		System.out.println("5326 / 1000 * 1000 ="+(5326 / 1000 * 1000 ));
		
		String s = "welcome to java";//�ַ�����ϰ
		System.out.println(s);
		s += " and java is fun";
		System.out.println(s);		
		
		System.out.println("3 << 2 = "+(3 << 2));//λ�������ϰ
		System.out.println("3 << 2 = "+(12 >> 2));
		System.out.println("128 & 129 = "+(128 & 129 ));
		System.out.println("128 | 129 = "+(128 | 129 ));
		
		/*�����������ֲ�ת��Ϊint����*/
		Scanner input = new Scanner(System.in);//�Ӽ�������һ������
		System.out.println("please enter a (int)number for a");
		String a = input.nextLine();
		System.out.println("please enter a (int)number for b");
		String b = input.nextLine();
		int inta = Integer.parseInt(a);//��string���͵�����ת��Ϊint����
		int intb = Integer.parseInt(b);
		
		if(inta > intb){//if��䣬����true��false���ж�
			switch (inta - intb){//switch��䣬�����ж��ֽ�����ж�
			case 1:System.out.println("a ��  b �� 1");
				break;
			case 2:System.out.println("a ��  b �� 2");
				break;
			case 3:System.out.println("a ��  b ��3");
				break;
			case 4:System.out.println("a ��  b ��4");
				break;
			case 5:System.out.println("a ��  b ��5");
				break;
			default:System.out.println("a ��  b ��ܶ�");
				break;
			}
		}
		else{
			if(intb - inta < 10){
			System.out.println("b��a֮���������Ϊ");
			/*forѭ�������ڶ���ظ��ж�*/
			for(int i = inta;i <= intb;i++)System.out.println(i);
				}
			}
		
	}
}
