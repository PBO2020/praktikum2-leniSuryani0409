package kopii; 
import java.util.ArrayList;
import java.util.Scanner;

public class Kopii {
    public static void main(String[] args) {
        ArrayList<String> kopii   = new ArrayList<>();
        ArrayList<String>Nama_Topping = new ArrayList<>();
        ArrayList<String>Asal  = new ArrayList<>();

        MesinKopi robusta = new MesinKopi();
        robusta.setNama_Kopi("Robusta");
        robusta.setAsal_Kopi("Eropa");
        kopii.add(robusta.getNama_Kopi());
        Asal.add(robusta.getAsal_Kopi());

        MesinKopi florest = new MesinKopi();
        florest.setNama_Kopi("Florest");
        florest.setAsal_Kopi("Asia");
        kopii.add(florest.getNama_Kopi());
        Asal.add(florest.getAsal_Kopi());

        MesinKopi arabica = new MesinKopi();
        arabica.setNama_Kopi("Arabica");
        arabica.setAsal_Kopi("TimurTengah");
        kopii.add(arabica.getNama_Kopi());
        Asal.add(arabica.getAsal_Kopi());

        robusta.setNama_Topping("Cream");
        Nama_Topping.add(robusta.getNama_Topping());
        robusta.setNama_Topping("gula");
        Nama_Topping.add(robusta.getNama_Topping());

        for(int i=0; i< kopii.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+kopii.get(i) + " "+ Asal.get(i));
        }

        for(int i=0; i< Nama_Topping.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+Nama_Topping.get(i));
        }
        
        try{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;
        int pilihantopping = keyboard.nextInt() -1;

        System.out.println("Pesanan anda adalah kopi " + kopii.get(pilihanKopi)+"yang berasal dari "+  Asal.get(pilihanKopi) + "dengan topping " + Nama_Topping.get(pilihantopping));
    }catch (Exception E){
            System.out.println("\nInputan Anda Salah");
            System.out.println(E+"\n");
            
            }
    }
}

