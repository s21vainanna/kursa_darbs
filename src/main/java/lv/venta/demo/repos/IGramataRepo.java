package lv.venta.demo.repos;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.demo.models.Gramata;

public interface IGramataRepo extends CrudRepository <Gramata, Integer>{

	// findByAuthorIdA
	ArrayList<Gramata> findByAutoriIDa(int authorID);

	// findBooksByLessThan
	ArrayList<Gramata> findBooksByGadsLessThan(int i);

	// findByNodalaIdN
	ArrayList<Gramata> findByNodalaIDn(int nodalaID);

	// findByPublisherIdI
	ArrayList<Gramata> findByIzdevejsIDi(int izdevejsID);

}
