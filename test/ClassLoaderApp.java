package test;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ClassLoaderApp {

	public ClassLoaderApp() {
		//자바의 여러 클래스 중 클래스에 대한 정보를 가진 클래스를 Class
		//
		URL url=ClassLoader.getSystemResource("res/hero/images.jpg");
		
		//기존 Image 객체보다 크기나 사이즈조절이 간으한 이미지를 말함
		//따라서 Image보다 더 활용도가 높다.
		try {
			BufferedImage buffImag=ImageIO.read(url);
			System.out.println(buffImag);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		new ClassLoaderApp();
	}
}
