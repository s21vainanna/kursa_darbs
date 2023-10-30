package lv.venta.demo.repos;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.demo.models.Lietotajs;

public interface ILietotajsRepo extends CrudRepository <Lietotajs, Integer>{
	// findAllBySurname(String surname)
	// findByIDl - bet nevajag pec id jo ir findById()
	// findAllByGramatas(Gramata gramata)
	// findAllByGramatasNosaukums(String nosaukums)
	// findAllByGramatasIzdevejs(Izdevejs izdevejs)
	// findAllByGramatasIzdevejsNosaukums(String nosaukums)

	// findAllBy ... <mainiga nosaukums>
	// findLietotajsBy ... <mainiga nosaukums> <mainiga nosaukums>
	// findBy ...  <mainiga nosaukums> <mainiga nosaukums> <mainiga nosaukums>

	// findByGramataIdG
	ArrayList<Lietotajs> findByGramatasIDg(int gramataID);

	// getLastReaderWhoIsUsingBookNow
	//String getLastReaderWhoIsUsingBookNow(int gramataID);

	// getAllUsers 
	// Nevajag, ir jau findAll() jau izveidots
	// ArrayList<Lietotajs> getAllUsers();

}
