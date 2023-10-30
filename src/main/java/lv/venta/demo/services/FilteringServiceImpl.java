package lv.venta.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lv.venta.demo.models.Eksemplars;
import lv.venta.demo.models.Gramata;
import lv.venta.demo.models.Lietotajs;
import lv.venta.demo.repos.IEksemplarsRepo;
import lv.venta.demo.repos.IGramataRepo;
import lv.venta.demo.repos.ILietotajsRepo;

@Service
public class FilteringServiceImpl implements IFilteringService {

	@Autowired
	private IEksemplarsRepo eksRepo;
	@Autowired
	private IGramataRepo gramRepo;
	@Autowired
	private ILietotajsRepo lietRepo;
	
	
	@Override
	public ArrayList<Gramata> getAllBooksByAuthorByID(int authorID) {
		ArrayList<Gramata> result = gramRepo.findByAutoriIDa(authorID);
		return result;
	}

	@Override
	public ArrayList<Gramata> getAllBooksByTheirNumber() {
		ArrayList<Gramata> result = gramRepo.findBooksByGadsLessThan(153000);
		return result;
	}

	@Override
	public ArrayList<Gramata> getAllBooksByTheirDivision(int nodalaID) {
		ArrayList<Gramata> result = gramRepo.findByNodalaIDn(nodalaID);
		return result;
	}

	@Override
	public ArrayList<Lietotajs> getAllBookUsersByID(int gramataID) {
		ArrayList<Lietotajs> result = lietRepo.findByGramatasIDg(gramataID);
		return result;
	}

	@Override
	public String getUserWhoIsUsingTheBookNow(int gramataID) {
		//String result = lietRepo.getLastReaderWhoIsUsingBookNow(gramataID);
		//return result;
		return null;
	}

	@Override
	public ArrayList<Gramata> getAllBooksByPublisherByID(int izdevejsID) {
		ArrayList<Gramata> result = gramRepo.findByIzdevejsIDi(izdevejsID);
		return result;
	}

	@Override
	public ArrayList<Lietotajs> getAllLibraryUsers() {
		ArrayList<Lietotajs> result = (ArrayList<Lietotajs>) lietRepo.findAll();
		return result;
	}

	@Override
	public ArrayList<Eksemplars> getAllEksemplarusByID(int gramataID) {
		ArrayList<Eksemplars> result = eksRepo.findAllEksemplarusByGramatasIDg(gramataID);
		return result;
	}

	
}
