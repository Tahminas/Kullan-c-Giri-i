/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		String KullaniciAdi, Sifre,karar,YeniSifre;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Kullanici Adını giriniz");
		KullaniciAdi=inp.nextLine();
		
		System.out.println("Sifre giriniz");
		Sifre=inp.nextLine();
		
		/* Normalde KullaniciAdi="Patika" diyerek tamamlardık 
		ancak string'te boyle calısmıyor equal kullanmak lazım KullaniciAdi.equals("Patika")*/
		
		
        if (KullaniciAdi.equals("patika") && Sifre.equals("patika123")){
            System.out.println("Giriş Basarili.");

        }else if (Sifre!="patika123"&& KullaniciAdi.equals("patika")){
            
            System.out.println("Yanlış Şifre !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            karar = inp.nextLine();
            
            if (karar.equals ("evet")){
                System.out.print("Yeni Şifrenizi Girin : ");
                Sifre=inp.nextLine();

                if (Sifre.equals("patika123")){
                    System.out.println("Şifre Oluşturulamadı Lütfen Başka Bir Şifre Girin.");

                }else if (Sifre.equals("patika")){
                    System.out.println("Kullanıcı adınızdan farklı bir şifre giriniz.");
                    
                }else {
                    System.out.println("Şifre oluşturuldu.");
                    
                }
            }else {

            }

            }else if (KullaniciAdi!="patika" && Sifre.equals("patika123")){
            System.out.println("Kullanıcı adını yanlış girdiniz !");
        }
        }
    }
