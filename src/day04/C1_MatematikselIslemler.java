package day04;
public class C1_MatematikselIslemler {
    public static void main(String[] args) {
    	
        int num1= 38 / 2 *( 4 + 3 ) * 2;
        System.out.println(num1); //266
        
        int num2 = 8 + 2 * ( 14 - 6 / 2 ) - 12 ;
        System.out.println(num2); // 18
        
        
        int num3=10;
        
        double num4 = num1 * num2 /num3; // 266 * 18 /10 = 478.8 ==> 478.0
                                         // dogru cevabı almak için  36. satı gibi yapmalıydık.
        // neden tamsayı ; eşitliğin sağ tarafı integer.üçüde integer.sol taraf double.
        // double integerden daha geniştir.
        // Java once esitligin sag tarafini yapar
        // bu ornekte sag tarafta tum degiskenler int oldugundan sonucu da int yapar
        // sonra assignment(atama)(=) islemi yapilir
        
        System.out.println(num4);   
                                    // neden tamsayı ;
        
        double num5=24.56;
        double num6=14.2;
        
        double num7 = num5 / num6 ; 
        
        System.out.println(num7); // 1.7295774647887323
        
        System.out.println(num5 / num3); // 24.56 / 10 = 2.456
                                         // biri dar biri geniş olduğunda geniş olana göre davranıyor
                                         // double ye göre davrandığı için 2.0 değil 2.456 çıkardı
        
        double num8 = (double) num1 * num2 /num3; // 478.8 
        System.out.println(num8); // 478.8 
        
    }
}

