import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int km,yas,ytipi;
        double ntutar,yindirimi,itutar,ttutar,gdtutar;

        System.out.print("Mesafeyi Giriniz: ");
        km=girdi.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas=girdi.nextInt();
        System.out.println("Yolculuk Tipi Seciniz: \n1-Tek Yön \n2-Gidiş-Dönüş");
        ytipi=girdi.nextInt();

        if (km>0 && yas>0)
        {
            System.out.println("işleminiz Devam Etkemktedir.");
        }
        else{
            System.out.println("Hatalı Veri Girdiniz");
        }
        ntutar=km*0.10;
        System.out.println("Normal Tutarınız: "+ntutar+ "Tl");

        switch (ytipi){
          case 1:

        if (yas<12){
            yindirimi=ntutar*0.50;
            itutar=ntutar-yindirimi;
            System.out.print("Toplam ödiyeceğiniz tutarınız:"+itutar+"Tl");
        } else if (yas>12 && yas<=24) {
            yindirimi=ntutar*0.10;
            itutar=ntutar-yindirimi;
            System.out.print("Toplam ödiyeceğiniz tutarınız:"+itutar+"Tl");
        } else if (yas>24 && yas<=65) {
            ntutar=km*0.10;
            System.out.print("Toplam ödiyeceğiniz tutarınız: "+ntutar +"Tl");
        } else if (yas>65) {
            yindirimi=ntutar*0.30;
            itutar=ntutar-yindirimi;
            System.out.print("Toplam ödiyeceğiniz tutarınız "+itutar+"Tl");
        }
        else {
            System.out.print("");
        }
              break;
            case 2:
                ntutar=km*0.10;
                if (yas<12){
                    yindirimi=ntutar*0.50;
                    itutar=ntutar-yindirimi;
                    gdtutar=itutar*0.20;
                    ttutar=(itutar-gdtutar)*2;
                    System.out.print("Toplam ödiyeceğiniz tutarınız:"+ttutar+"Tl");
                } else if (yas>12 && yas<=24) {
                    yindirimi=ntutar*0.10;
                    itutar=ntutar-yindirimi;
                    gdtutar=itutar*0.20;
                    ttutar=(itutar-gdtutar)*2;
                    System.out.print("Toplam ödiyeceğiniz tutarınız:"+ttutar+"Tl");
                } else if (yas>24 && yas<=65) {
                    ntutar=(km*0.10)*0.20;
                    System.out.print("Toplam ödiyeceğiniz tutarınız: "+ntutar +"Tl");
                } else if (yas>65) {
                    yindirimi=ntutar*0.30;
                    itutar=ntutar-yindirimi;
                    gdtutar=itutar*0.20;
                    ttutar=(itutar-gdtutar)*2;
                    System.out.print("Toplam ödiyeceğiniz tutarınız: "+ttutar+"Tl");
                }
                else {
                    System.out.print("");
                }
              break;
            default: System.out.println("Hatalı Veri Girdiniz");
                break;
        }

    }
}
