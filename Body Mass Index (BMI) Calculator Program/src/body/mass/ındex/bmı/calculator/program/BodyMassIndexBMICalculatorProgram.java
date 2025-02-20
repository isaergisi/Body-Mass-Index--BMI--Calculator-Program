
package body.mass.ındex.bmı.calculator.program;

import java.util.Scanner;

public class BodyMassIndexBMICalculatorProgram {
public static void main(String[] args) {
      /*Vücut Kitle İndeksi Hesaplama

Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)*/
    
Scanner input = new Scanner(System.in);

        System.out.println("once boyunuzu (metre cinsinden), ardindan kilonuzu (kg cinsinden) giriniz:");
        double boy = input.nextDouble();
        double kilo = input.nextDouble();

        double index = kilo / (boy * boy);

        System.out.println("Vucut Kitle indeksiniz: " + index);

    }
}















































}
    
}
