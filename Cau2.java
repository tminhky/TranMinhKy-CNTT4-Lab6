// Lop Hoc sinh
package Lab6;

public class HocSinh {
    protected String hoTen;
    protected String lop;
    protected double toan;
    protected double ly;
    protected double hoa;
    
    public HocSinh(String hoTen, String lop, double toan, double ly, double hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public double gettinhDiemTrungBinh() {
        return (toan + ly + hoa) / 3;
    }
}
// Lop HS chuyen Toan
package Lab6;

public class HocSinhChuyenToan extends HocSinh {
    public HocSinhChuyenToan(String hoTen, String lop, double toan, double ly, double hoa) {
        super(hoTen, lop, toan, ly, hoa);
    }
    
    @Override
    public double gettinhDiemTrungBinh() {
        return (toan * 2 + ly + hoa) / 4;
    }
}
// Ham main
package Lab6;

public class Main {
    public static void main(String[] args) {
        HocSinhChuyenToan hs = new HocSinhChuyenToan("Minh Ky", "CNTT4",10,8,8);
        System.out.println("Diem TB: " + hs.gettinhDiemTrungBinh());
}
}

