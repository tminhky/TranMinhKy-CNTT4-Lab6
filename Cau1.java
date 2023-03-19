// Lớp Nhân viên
package NhanVien;

public class NhanVien
{
	protected String ten;
	protected long luong ;
    protected String loaiNhanVien;
public NhanVien ( String ten , long luong )
{
	this.ten = ten ;
	this.luong = luong ;
}
public void tinhLuong(){
    System.out.println("Luong Nhan Vien");
}
public void xuatThongTin(){
    System.out.println("Thong tin nhan vien");
}
}
// Lớp Nhân viên parttime
package NhanVien;

public class NhanVienPartTime extends NhanVien{
    protected int gioLamViec;

	public NhanVienPartTime(String ten,long luong, int gioLamViec, String loaiNhanVien) {
        super(ten, luong);
        this.gioLamViec	= gioLamViec;	
        this.loaiNhanVien = loaiNhanVien;
	}
    public void tinhLuong ()
	{
		System.out.println( " Đây là lương Nhân Viên Parttime ");
	}
}
// Lớp nhân viên fulltime
package NhanVien;

public class NhanVienFullTime extends NhanVien
{
    protected int loaiChucVu;
	protected int ngayLamThem;
    protected String loaiNhanVien;
	public NhanVienFullTime(String ten,long luong, int loaiChucVu, int ngayLamThem, String loaiNhanVien ) {
        super(ten,luong);
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
        this.loaiNhanVien = loaiNhanVien;
    }
    public void tinhLuong ()
	{
		System.out.println(" Đây là lương Nhân Viên Fulltime");
	}
}
// Hàm main
package NhanVien;

public class Main {
    public static void main (String [] agrs)
	{
	NhanVien n = new NhanVien("A", 10);
	n.tinhLuong () ;
	n = new NhanVienFullTime("B", 15, 0, 5,"QC") ;
	n.tinhLuong () ;
	n = new NhanVienPartTime("C", 13, 8,"QC") ;
	n.tinhLuong () ;
	}
}





