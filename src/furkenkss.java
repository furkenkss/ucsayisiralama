import java.util.Scanner;

public class furkenkss {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("1.sayıyı gir:");
        int sayi1=input.nextInt();
        System.out.println("2.sayıyı gir:");
        int sayi2=input.nextInt();
        System.out.println("3.sayıyı gir:");
        int sayi3=input.nextInt();

        if (sayi1<sayi2&&sayi1<sayi3){
            if (sayi2<sayi3){
                System.out.println(sayi1+"<"+sayi2+"<"+sayi3);
            } else if (sayi3<sayi2) {
                System.out.println(sayi1+"<"+sayi3+"<"+sayi2);
            }
        } else if (sayi2<sayi1&&sayi2<sayi3) {
            if (sayi1<sayi3){
                System.out.println(sayi2+"<"+sayi1+"<"+sayi3);
            } else if (sayi3<sayi1) {
                System.out.println(sayi2+"<"+sayi3+"<"+sayi1);
            }
        }else if (sayi3<sayi1&&sayi3<sayi2) {
            if (sayi1<sayi2){
                System.out.println(sayi3+"<"+sayi1+"<"+sayi2);
            } else if (sayi2<sayi1) {
                System.out.println(sayi3+"<"+sayi2+"<"+sayi1);
            }
        }else {
            System.out.println("hatalı sayı girişi yaptınız...!!!!!");
        }

    }
}
