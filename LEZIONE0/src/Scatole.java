import java.awt.Rectangle;

public class Scatole {
	public static void main(String[] args) {
		Rectangle box1 = new Rectangle(10, 20, 15, 11);
		Rectangle box2 = new Rectangle(10, 20, 15, 11);
		
		Rectangle scatolaBiscotti = box1;
		Rectangle scatolaCaramelle = box2;
		
		Rectangle x = scatolaBiscotti;
		
		System.out.println(scatolaBiscotti.equals(x));
		System.out.println(scatolaCaramelle.equals(x));
		
		x.translate(5, 10);
		
		System.out.println(scatolaCaramelle.intersects(x));
		System.out.println(scatolaCaramelle.intersection(x));
		
		scatolaCaramelle.width -= 10;
		scatolaCaramelle.height -= 10;
		System.out.println(scatolaCaramelle.intersects(x));
		System.out.println(scatolaCaramelle.intersection(x));
	}
}
