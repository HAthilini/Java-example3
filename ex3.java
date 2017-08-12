import java.util.Scanner;
class ex3{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);//Scanner.class
		
		System.out.print("Input a number : ");
		int x=input.nextInt();
		System.out.print("Input a number : ");
		int y=input.nextInt();		
		
		int z=x+y;
		System.out.println(x+" + "+y+" = "+z);
	}
}

