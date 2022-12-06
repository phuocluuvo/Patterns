package AbstractFactory;

import AbstractFactory.ChatLieu.ChatLieu;
import AbstractFactory.SanPham.SanPham;

public class MainDemo {
	public static void main(String[] args) {
		AbstractFactory abcl = FactoryProducer.getFactory("ChatLieu");
		AbstractFactory absp = FactoryProducer.getFactory("SanPham");
		
		ChatLieu cl = abcl.getChatLieu("Go","Nhat Ban");
		System.out.println(cl.getInfo());
		
		SanPham sp = absp.getSanPham("Ban","Hoc");
		System.out.println(sp.getInfo());
	}
}
