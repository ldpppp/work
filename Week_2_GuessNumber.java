import java.util.Random;
import java.util.Scanner;

class Cheak{
	public static int  check(int num,int userNum,int i){

		if(num< userNum){  //用户输入的数字偏大
			System.out.println("你输入的数字偏大,你已经操作了"+i+"次");
			return 2;
		}else if(num > userNum){ //用户输入的数字偏小
			System.out.println("你输入的数字偏小,你已经操作了"+i+"次");
			return 2;
		}else{
			System.out.println("你输入的数字正确,你已经操作了"+i+"次");
			return 3; //用户输入的数字正确
		}
	}
}


public class Week_2_GuessNumber {
	static Scanner in = new Scanner(System.in);
	public static void main(String args[]){
		Random rand = new Random();
		//产生随机数

		//int userNum = input();
		int userNum;
		int i = 1;
		
		int randnumber = 0;
		while(true){
			System.out.println("1、开始游戏；2、继续游戏；3、结束游戏");
			int choose = in.nextInt();
			//System.out.println("随机数："+randnumber);
			switch(choose){
			case 1: 
				randnumber = rand.nextInt(10001);
				System.out.println("随机数："+randnumber);
			    userNum = input();
			    choose = Cheak.check( randnumber, userNum,i);
			    break;
			case 2:userNum = input();
			System.out.println("用户数："+userNum);
			choose = Cheak.check( randnumber, userNum,i);
			break;
			case 3:System.out.println("游戏结束");
			return;
				
			}
			i++;
		}

	}


	public static int input(){
		System.out.println("请输入数字");
		int num = in.nextInt();
		return num;
	}

}
