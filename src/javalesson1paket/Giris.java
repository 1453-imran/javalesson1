
import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {

        Scanner yıl = new Scanner(System.in);
        int artıkYıl;
        System.out.print(" Yılınızı Giriniz : ");
        artıkYıl=yıl.nextInt();
        if(((artıkYıl%4==0) && (artıkYıl %100 !=0)) || (artıkYıl%400==0)){
            System.out.print("Girdiğiniz yıl artık bir yıldır : ");
        }
        else {
            System.out.print("Girdiğiniz yıl artık yıl değildir ");
        }

    }
}








