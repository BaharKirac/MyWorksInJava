package tall;
import javax.swing.*;
public class Avikshåndtering {
    public static void main (String [] args){
        String innStreng = JOptionPane.showInputDialog("Skriv inn et heltall : ");
        int tall ;
        try{
            tall = Integer.parseInt(innStreng);
        }
        catch (Exception e){
            tall = 0;
            System.out.println(e); //hata mesajini consola yazdirir
        }
        System.out.println("Tallet er "+tall);
    }
}
/* try blogu
Bu yapı, olası hataları yakalamak için kullanılır. try bloğundaki kod, hatasız çalıştırılmaya çalışılır,
ancak bir hata meydana gelirse,
catch bloğu devreye girer. */


/* catch (Exception e) { ... }:
Eğer String bir tam sayıya dönüştürülemezse
(örneğin, kullanıcı geçersiz bir giriş yaptıysa),
bu blok devreye girer. tall değişkeni 0 olarak ayarlanır
ve hata mesajı konsola yazdırılır (System.out.println(e);).
 */