import java.util.Scanner;

    public class saat {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int saatDilimi = 0, saat = 0, dakika = 0;

            // Saat dilimi değerini iste ve kontrol et
            try {
                System.out.print("Saat dilimini girin (0-23): ");
                saatDilimi = Integer.parseInt(scanner.nextLine());

                if (saatDilimi < 0 || saatDilimi > 23) {
                    throw new Exception("Hatalı saat dilimi değeri girdiniz!");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                return;
            }

            // Saat değerini iste ve kontrol et
            try {
                System.out.print("Saat değerini girin (0-23): ");
                saat = Integer.parseInt(scanner.nextLine());

                if (saat < 0 || saat > 23) {
                    throw new Exception("Hatalı saat değeri girdiniz!");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                return;
            }

            // Dakika değerini iste ve kontrol et
            try {
                System.out.print("Dakika değerini girin (0-59): ");
                dakika = Integer.parseInt(scanner.nextLine());

                if (dakika < 0 || dakika > 59) {
                    throw new Exception("Hatalı dakika değeri girdiniz!");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                return;
            }

            // Akrep ve yelkovanın açılarını hesaplamak için gerekli değerler
            double akrepAcisi = (saat % 12) * 30 + dakika * 0.5;
            double yelkovanAcisi = saat * 30 + dakika * 0.5;

            // Saat dilimine göre yelkovanın açısını düzeltme
            yelkovanAcisi += (saatDilimi - 12) * 15;

            // Açı farkını hesapla ve pozitif değer alacak şekilde ayarla
            double aciFarki = Math.abs(akrepAcisi - yelkovanAcisi);
            if (aciFarki > 180) {
                aciFarki = 360 - aciFarki;
            }

            // Sonucu ekrana yazdır
            System.out.println("Akrep ve yelkovan arasındaki açı: " + aciFarki + " derece");
        }
    }

}
