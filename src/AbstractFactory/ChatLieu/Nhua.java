package AbstractFactory.ChatLieu;

import AbstractFactory.SanPham.Ghe;

public class Nhua implements ChatLieu{
	String loai;
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public String getLoai() {
		return loai;
	}
	
	public Nhua(String loai) {
		super();
		this.loai = loai;
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return Nhua.class.getName()+":"+loai;
	}

}
