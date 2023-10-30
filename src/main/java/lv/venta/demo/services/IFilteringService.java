package lv.venta.demo.services;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;

import lv.venta.demo.models.Eksemplars;
import lv.venta.demo.models.Gramata;
import lv.venta.demo.models.Lietotajs;

public interface IFilteringService {

	//kas būs ieejas parametrs
	//un kas ir kā rezultāts šajai funkcijai
	
	//Atrast grāmatas pēc autora
	public abstract ArrayList<Gramata> getAllBooksByAuthorByID(int authorID);	
	
	//Atrast grāmatas pēc eksemplāru skaita (eksemplaru skaita minimums)
	public abstract ArrayList<Gramata> getAllBooksByTheirNumber();
	//Atrast visas grāmatas, kas atrodas konkrētajā nodaļā
	public abstract ArrayList<Gramata> getAllBooksByTheirDivision(int nodalaID);
	//Atrast cik grāmatai ir bijuši lietotāji
	public abstract ArrayList<Lietotajs> getAllBookUsersByID(int gramataID);
	//Atrast grāmatas tagadējo lietotāju
	public abstract String getUserWhoIsUsingTheBookNow(int gramataID);
	//Atrast grāmatu pēc izdevēja
	public abstract ArrayList<Gramata> getAllBooksByPublisherByID(int izdevejsID);
	//Atrast visas grāmatnīcas lietotājus 
	public abstract ArrayList<Lietotajs> getAllLibraryUsers();
	//Atrast visus eksemplārus by id
	//                                              IDg???
	//@Query(value = "SELECT * FROM Eksemplars WHERE IDG = ?1", nativeQuery = true)// - es nezinu
	public abstract ArrayList<Eksemplars> getAllEksemplarusByID(int gramataID);
}
