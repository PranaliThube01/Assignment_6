import java.util.Scanner;
class Demo{
        public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No:");
        int N = sc.nextInt();
int count =0;
        for(int i=1;i<=N;i+=2){
 	count ++;
		
        }
	System.out.println(count);
        }

}
