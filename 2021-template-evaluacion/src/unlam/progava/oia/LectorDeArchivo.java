package unlam.progava.oia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class LectorDeArchivo {

	public static Almacenamiento leer(String path) {
		Almacenamiento almacenamiento = new Almacenamiento();
		
		File file = new File(path);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);

			int cant = scanner.nextInt();
			almacenamiento.setEspacio(scanner.nextInt());
			for (int i = 0; i < cant; i++) {
				almacenamiento.agregar(scanner.nextInt());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return almacenamiento;
	}

}
