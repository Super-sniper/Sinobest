package Mytest;

public class Demo {
	public static void main(String[] args) {
		System.out.println(find1(1));
	}
	
	public static int find1(int i){
		if(i==10){
			return 1;
		}
		if(i<1||i>10){
			System.out.println("输入不合法!");
			return -1;
		}
		return 2*(find1(i+1)+1);
	}
}
