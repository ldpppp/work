import java.util.Random;
import java.util.Scanner;

class Cheak{
	public static int  check(int num,int userNum,int i){

		if(num< userNum){  //�û����������ƫ��
			System.out.println("�����������ƫ��,���Ѿ�������"+i+"��");
			return 2;
		}else if(num > userNum){ //�û����������ƫС
			System.out.println("�����������ƫС,���Ѿ�������"+i+"��");
			return 2;
		}else{
			System.out.println("�������������ȷ,���Ѿ�������"+i+"��");
			return 3; //�û������������ȷ
		}
	}
}


public class Week_2_GuessNumber {
	static Scanner in = new Scanner(System.in);
	public static void main(String args[]){
		Random rand = new Random();
		//���������

		//int userNum = input();
		int userNum;
		int i = 1;
		
		int randnumber = 0;
		while(true){
			System.out.println("1����ʼ��Ϸ��2��������Ϸ��3��������Ϸ");
			int choose = in.nextInt();
			//System.out.println("�������"+randnumber);
			switch(choose){
			case 1: 
				randnumber = rand.nextInt(10001);
				System.out.println("�������"+randnumber);
			    userNum = input();
			    choose = Cheak.check( randnumber, userNum,i);
			    break;
			case 2:userNum = input();
			System.out.println("�û�����"+userNum);
			choose = Cheak.check( randnumber, userNum,i);
			break;
			case 3:System.out.println("��Ϸ����");
			return;
				
			}
			i++;
		}

	}


	public static int input(){
		System.out.println("����������");
		int num = in.nextInt();
		return num;
	}

}
