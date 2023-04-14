import java.awt.Desktop;

import java.io.File;
public class ImageTask {

		public static void main(String[] args) throws Exception {
			File fi= new File("C:\\Users\\prkumar\\Pictures\\Saved Pictures\\image.png");
			Desktop de = Desktop.getDesktop();
			de.open(fi);
			System.out.println("image opened");

	}

}
