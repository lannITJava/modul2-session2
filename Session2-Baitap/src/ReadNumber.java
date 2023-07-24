import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d is ",number);
        int hangdonvi = number%10;
        int hangchuc = (number/10)%10;
        int hangtram = number/100;
        String donvi, chuc="", tram="", output="";
        switch (hangdonvi){
            case 0:
                donvi = "Zero";
                break;
            case 1:
                donvi = "One";
                break;
            case 2:
                donvi = "Two";
                break;
            case 3:
                donvi = "Three";
                break;
            case 4:
                donvi = "Four";
                break;
            case 5:
                donvi = "Five";
                break;
            case 6:
                donvi = "Six";
                break;
            case 7:
                donvi = "Seven";
                break;
            case 8:
                donvi = "Eight";
                break;
            default:
                donvi = "Nine";
        }
        switch (hangchuc){
            case 1:
                switch (hangdonvi){
                    case 0:
                        chuc = "Ten";
                        break;
                    case 1:
                        chuc = "Eleven";
                        break;
                    case 2:
                        chuc = "Twelve";
                        break;
                    case 5:
                        chuc = "Fifteen";
                        break;
                    default:
                        chuc = donvi + "teen";
                }
                break;
            case 2:
                chuc = "Twenty";
                break;
            case 3:
                chuc = "Thirty";
                break;
            case 4:
                chuc = "Fourty";
                break;
            case 5:
                chuc = "Fivety";
                break;
            case 6:
                chuc = "Sixty";
                break;
            case 7:
                chuc = "Seventy";
                break;
            case 8:
                chuc = "Eighty";
                break;
            default:
                chuc = "Ninety";
        }
        if (number<10){
            output = donvi;
        } else if (number<20) {
            output = chuc;
        } else if (number<100) {
            if (hangdonvi==0){
                output = chuc;
            }else {
                output = chuc +donvi;
            }
        } else if (number<1000) {
            switch (hangtram){
                case 1:
                    donvi = "One";
                    break;
                case 2:
                    donvi = "Two";
                    break;
                case 3:
                    donvi = "Three";
                    break;
                case 4:
                    donvi = "Four";
                    break;
                case 5:
                    donvi = "Five";
                    break;
                case 6:
                    donvi = "Six";
                    break;
                case 7:
                    donvi = "Seven";
                    break;
                case 8:
                    donvi = "Eight";
                    break;
                default:
                    donvi = "Nine";
            }
            tram += "hundred";
            if (hangchuc==0){
                if (hangdonvi==0){
                    output = tram;
                }else {
                    output = tram+ donvi;
                }
            }else if (hangchuc==1){
                output = tram + chuc;
            }else {
                if (hangdonvi==0){
                    output = tram + chuc;
                }else {
                    output = tram + chuc+ donvi;
                }
            }
        }
        System.out.println(output);
    }
}
