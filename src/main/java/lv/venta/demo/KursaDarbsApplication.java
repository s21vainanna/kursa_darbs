package lv.venta.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lv.venta.demo.models.Autors;
import lv.venta.demo.models.Eksemplars;
import lv.venta.demo.models.Gramata;
import lv.venta.demo.models.Izdevejs;
import lv.venta.demo.models.Lietotajs;
import lv.venta.demo.models.Nodala;
import lv.venta.demo.repos.IAutorsRepo;
import lv.venta.demo.repos.IEksemplarsRepo;
import lv.venta.demo.repos.IGramataRepo;
import lv.venta.demo.repos.IIzdevejsRepo;
import lv.venta.demo.repos.ILietotajsRepo;
import lv.venta.demo.repos.INodalaRepo;

@SpringBootApplication
public class KursaDarbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KursaDarbsApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(IAutorsRepo autRepo, IEksemplarsRepo eksRepo, IGramataRepo gramRepo,
			IIzdevejsRepo izdRepo, ILietotajsRepo lietRepo, INodalaRepo nodRepo) {

		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				Lietotajs liet1 = new Lietotajs("Sabīne", "Jauka", 20905);
				Lietotajs liet2 = new Lietotajs("Alīna", "Jauka", 111101);
				lietRepo.save(liet1);
				lietRepo.save(liet2);
				
				Autors aut1 = new Autors("Karina", "Skirmante");
				Autors aut2 = new Autors("Raita", "Rollande");
				autRepo.save(aut1);
				autRepo.save(aut2);
				
				Nodala nod1 = new Nodala("Literatūra");
				Nodala nod2 = new Nodala("Autobiogrāfija");
				nodRepo.save(nod1);
				nodRepo.save(nod2);
				
				Izdevejs izd1 = new Izdevejs("Zvagzne ABC");
				Izdevejs izd2 = new Izdevejs("Jānis Roze");
				izdRepo.save(izd1);
				izdRepo.save(izd2);

				Gramata gr1 = new Gramata("HarijsPoters", new ArrayList<>(Arrays.asList(aut1)),
						nod1, 2090, izd1, new ArrayList<>(Arrays.asList(liet1)));
				gramRepo.save(gr1);

				Eksemplars eks1 = new Eksemplars(123000, new ArrayList<>(Arrays.asList(gr1)));
				Eksemplars eks2 = new Eksemplars(154000, new ArrayList<>(Arrays.asList(gr1)));
				eksRepo.save(eks1);
				eksRepo.save(eks2);
				
				
				/*Gramata gram1 = new Gramata("GramatasNosauk1", new ArrayList<>(Arrays.asList(aut1)),
						"Literatūra", 2090, "Zvaigzne ABC", new ArrayList<>(Arrays.asList(liet1)), 
					new ArrayList<>(Arrays.asList(eks1));
			Gramata gram2 = new Gramata("GramatasNosauk2", new ArrayList<>(Arrays.asList(aut2),
						drāma, 2089, 
						liet2, "Jānis Roze", 23000);
				
				public Gramata(String nosaukums, Collection<Autors> autori, Nodala nodala, int gads, Izdevejs izdevejs, Collection<Lietotajs> lietotaji, Collection<Eksemplars> eksemplari) {
					this.nosaukums = nosaukums;
					//this.IDa = IDa;
					this.autori = autori;
					//this.IDn = IDn;
					this.nodala = nodala;
					this.gads = gads;
					//this.IDl = IDl;
					this.lietotaji = lietotaji;
					//this.IDi = IDi;
					this.izdevejs = izdevejs;
					//this.IDe = IDe;
					this.eksemplari = eksemplari;

				}*/
				//gramRepo.save(gram1);
				//gramRepo.save(gram2);
				//gram1.addLietotajs(liet1);
				///gramRepo.save(liet1);
				
				

			}

		};
	}
}
