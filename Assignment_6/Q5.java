import java.util.Scanner;
class Demo{
        public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No:");
        int N = sc.nextInt();

        for(int i=1;i<=N;i+=2){

             System.out.println(i);
        }
        }

}

