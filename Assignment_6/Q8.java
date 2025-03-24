import java.util.Scanner;
class Demo{
        public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No:");
        int N = sc.nextInt();

        for(int i=10;i>=1;i--){

                System.out.println(N*i);
        }
        }

}
