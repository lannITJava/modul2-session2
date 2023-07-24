import java.util.Scanner;

public class Tinhnamnhuan {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập vào một năm dương lịch");
        int year = scanner.nextInt();
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println("Năm "+year+" là năm nhuận");
        }else {
            System.out.println("Năm "+year+" không phải là năm nhuận");
        }
    }
}
