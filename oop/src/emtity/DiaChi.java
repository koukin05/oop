package emtity;

public class DiaChi {

    private String Duong;
    private String Quan;
    private String ThanhPho;
    private Long MaVung;

    public DiaChi(String Duong, String Quan, String ThanhPho, Long MaVung) {
        this.Duong = Duong;
        this.Quan = Quan;
        this.ThanhPho = ThanhPho;
        this.MaVung = MaVung;
    }

    @Override
    public String toString() {
        return Duong + "," + Quan + "," + ThanhPho + "," + MaVung;
    }
}
