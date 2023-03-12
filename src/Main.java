import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        x= scanner.nextInt();
        System.out.println("nhap y");
        y= scanner.nextInt();
        for (int i=x;i<=y;i++){
            if (i%10==0){
                System.out.println("cac so chia het cho 10 la:"+i);
            }
        }
    }
}