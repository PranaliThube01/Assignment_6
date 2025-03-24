import java.util.Scanner;
class Demo{
        public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No:");
        int N = sc.nextInt();

        int start =100; 
        for(int i=0;i<N;i++){
                System.out.println(start + i);
		
        }
	}
}

