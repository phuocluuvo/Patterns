package AbstractFactory.ChatLieu;

import AbstractFactory.SanPham.Ghe;

public class Go implements ChatLieu{
	String loai;
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public String getLoai() {
		return loai;
	}
	
	public Go(String loai) {
		super();
		this.loai = loai;
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return Go.class.getName()+":"+loai;
	}

}
