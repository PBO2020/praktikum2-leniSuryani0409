package kopii;

public class Topping {
    private String Nama_Topping;
    private String Asal_Kopi;

    public void seNama_Topping(String JenisTopping) {
        this.Nama_Topping = Nama_Topping;
    }

    public void setAsal_Kopi(String Asal_Kopi) {

        this.Asal_Kopi= Asal_Kopi;
    }

    public String getNama_Topping() {
        return Nama_Topping;
    }

    public String getAsal_Kopi() {
        return Asal_Kopi;
    }
}
