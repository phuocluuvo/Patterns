package AbstractFactory.SanPham;

public class Ghe implements SanPham{
	String loai;
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public String getLoai() {
		return loai;
	}
	public Ghe(String loai) {
		super();
		this.loai = loai;
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return Ghe.class.getName()+":"+loai;
	}

}
