package emtity;

public class SinhVien implements ChuyenNganh {

    private String Ho;
    private String Ten;
    private DiaChi DiaChiNha;
    private DiaChi DiaChiTruong;
    private double Diem01;
    private double Diem02;
    private double Diem03;
    private String TenCN;

    public SinhVien(String Ho, String Ten, DiaChi DiaChiNha, DiaChi DiaChiTruong) {
        this.Ho = Ho;
        this.Ten = Ten;
        this.DiaChiNha = DiaChiNha;
        this.DiaChiTruong = DiaChiTruong;
    }

    @Override
    public void setChuyenNganh(String cn) {
        this.TenCN = cn;
    }

    @Override
    public String getChuyenNganh() {
        return this.TenCN;
    }

    public void setCotDiem(int loai, double Diem) {
        switch (loai) {
            case 1:
                Diem01 = Diem;
                break;
            case 2:
                Diem02 = Diem;
                break;
            case 3:
                Diem03 = Diem;
                break;
            default:
                System.out.println("Diem Khong Hop Le!");
        }
    }

    public double getCotDiem(int loai) {
        switch (loai) {
            case 1:
                return Diem01;
            case 2:
                return Diem02;
            case 3:
                return Diem03;
            default:
                return -1;
        }
    }

    public double DiemTb() {
        return (Diem01 + Diem02 + Diem03) / 3;
    }

    @Override
    public String toString() {
        return "Ho va Ten: " + Ho + " " + Ten
                + "/n Dia Chi Nha" + DiaChiNha
                + "/n Dia Chi Truong" + DiaChiTruong
                + "/n Diem Trung Binh" + DiemTb();
    }
}
