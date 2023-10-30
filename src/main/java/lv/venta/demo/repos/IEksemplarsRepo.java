package lv.venta.demo.repos;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.demo.models.Eksemplars;

public interface IEksemplarsRepo extends CrudRepository <Eksemplars, Integer>{

	// findAllEksemplarusByIDG
	ArrayList<Eksemplars> findAllEksemplarusByGramatasIDg(int gramataID);

}
