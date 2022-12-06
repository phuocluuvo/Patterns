package Factory;

public class Nexus implements Car{
	 private String thongTinXe;
	 private String cauHinh;
	 private String nsx;
	 private String tinhNang;
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Goi xe Nexus";
	}
	public String getThongTinXe() {
		return thongTinXe;
	}
	public void setThongTinXe(String thongTinXe) {
		this.thongTinXe = thongTinXe;
	}
	public String getCauHinh() {
		return cauHinh;
	}
	public void setCauHinh(String cauHinh) {
		this.cauHinh = cauHinh;
	}
	public String getNsx() {
		return nsx;
	}
	public void setNsx(String nsx) {
		this.nsx = nsx;
	}
	public String getTinhNang() {
		return tinhNang;
	}
	public void setTinhNang(String tinhNang) {
		this.tinhNang = tinhNang;
	}
	 

}
