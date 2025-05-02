import java.util.Scanner;
class FindGrade{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks");
		int grade=sc.nextInt();
		if(grade < 35){
			System.out.println("Your Fail");
		}else if(grade > 35 && grade <50){
			System.out.println("You have D grade");
		}else if(grade > 50 && grade < 75){
			System.out.println("Your have C grade");
		}else if(grade > 75 && grade < 90){
			System.out.println("You have B grade");
		}else if(grade > 90 && grade < 100){
			System.out.println("You have A grade");
		}
	}
}