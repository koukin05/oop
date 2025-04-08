package fontend;

import emtity.*;
import backend.QuanLySinhVien;

import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien[] danhSach;
        int n = 0;

        try {
            System.out.print("Nhập số sinh viên: ");
            n = Integer.parseInt(sc.nextLine());
            danhSach = new SinhVien[n];

            double maxTB = -1;
            int indexMax = -1;

            for (int i = 0; i < n; i++) {
                System.out.println("\n--- Sinh viên thứ " + (i + 1) + " ---");
                System.out.print("Họ: ");
                String ho = sc.nextLine();
                System.out.print("Tên: ");
                String ten = sc.nextLine();
                System.out.print("Chuyên ngành: ");
                String cn = sc.nextLine();

                System.out.println("Địa chỉ nhà:");
                String d1 = sc.nextLine();
                String q1 = sc.nextLine();
                String t1 = sc.nextLine();
                long mv1 = Long.parseLong(sc.nextLine());
                DiaChi dcNha = new DiaChi(d1, q1, t1, mv1);

                System.out.println("Địa chỉ trường:");
                String d2 = sc.nextLine();
                String q2 = sc.nextLine();
                String t2 = sc.nextLine();
                long mv2 = Long.parseLong(sc.nextLine());
                DiaChi dcTr = new DiaChi(d2, q2, t2, mv2);

                SinhVien sv = new SinhVien(ho, ten, dcNha, dcTr);
                sv.setChuyenNganh(cn);

                sv.setCotDiem(1, Double.parseDouble(sc.nextLine()));
                sv.setCotDiem(2, Double.parseDouble(sc.nextLine()));
                sv.setCotDiem(3, Double.parseDouble(sc.nextLine()));

                danhSach[i] = sv;

                if (sv.DiemTrungBinh() > maxTB) {
                    maxTB = sv.DiemTrungBinh();
                    indexMax = i;
                }
            }

            // Ghi file
            QuanLySinhVien.ghiFile("sinhvien.txt", danhSach);
            System.out.println("✅ Ghi file thành công!");

            // Đọc file
            System.out.println("\n📄 Dữ liệu từ file:");
            QuanLySinhVien.docFile("sinhvien.txt");

            // In sinh viên giỏi nhất
            System.out.println("\n🏆 SV điểm TB cao nhất:");
            System.out.println(danhSach[indexMax]);

        } catch (NumberFormatException e) {
            System.out.println("❌ Nhập sai định dạng số!");
        } catch (IOException e) {
            System.out.println("❌ Lỗi I/O: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Lỗi khác: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
