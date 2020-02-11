package kopii;
public class MesinKopi {
    private String Nama_Kopi;
    private String Asal_Kopi;
    private String Nama_Topping;

    public void setNama_Kopi(String Nama_Kopi){
        this.Nama_Kopi=Nama_Kopi;
    }
    public void setAsal_Kopi(String Asal_Kopi){
        this.Asal_Kopi=Asal_Kopi;
    }
    public void setNama_Topping(String Nama_Topping){
        this.Nama_Topping=Nama_Topping;
    }
    public String getNama_Kopi(){
        return Nama_Kopi;
    }
    public String getAsal_Kopi(){
        return Asal_Kopi;
    }
    public String getNama_Topping(){
        return Nama_Topping;
    }
}
