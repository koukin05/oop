package backend;

import emtity.DiaChi;
import emtity.SinhVien;

import java.io.*;

public class QuanLySinhVien {

    public static void ghiFile(String fileName, SinhVien[] danhSach) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (SinhVien sv : danhSach) {
            writer.write(sv.toString());
            writer.newLine();
            writer.write("------------");
            writer.newLine();
        }
        writer.close();
    }

    public static void docFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
