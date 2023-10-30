package lv.venta.demo.models;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Table
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Gramata {

	@Setter(value = AccessLevel.NONE)
	@Column(name = "IDg")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // - unikāla
	private int IDg;

	@Column(name = "Nosaukums")
	private String nosaukums;

//	@Column(name = "IDa")
//	private int IDa;
//
//	@Column(name = "IDn")
//	private int IDn;

	@Column(name = "Gads")
	private int gads;

//	@Column(name = "IDl")
//	private int IDl;
//
//	@Column(name = "IDi")
//	private int IDi;
//
//	@Column(name = "IDe")
//	private int IDe;

	@ManyToOne
	@JoinColumn(name = "IDn")
	private Nodala nodala;

	@ManyToOne
	@JoinColumn(name = "IDi")
	private Izdevejs izdevejs;
	/*
	 * @ManyToMany
	 * 
	 * @JoinColumn(name = "IDa") private ArrayList<Autors> autori;
	 */

	// izveidoju starptabulu
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "IDg"),
	inverseJoinColumns = @JoinColumn(name = "IDa"))
	@ToString.Exclude
	private Collection<Autors> autori = new ArrayList<Autors>();
/*
	@ManyToMany
	@JoinColumn(name = "IDe")
	private ArrayList<Eksemplars> eksemplari;
*/
	// izveidoju starptabulu
		@ManyToMany
		@JoinTable(joinColumns = @JoinColumn(name = "IDg"), 
		inverseJoinColumns = @JoinColumn(name = "IDe"))
		@ToString.Exclude
		private Collection<Eksemplars> eksemplari = new ArrayList<Eksemplars>();
	/*
	@ManyToMany
	@JoinColumn(name = "IDl")
	private ArrayList<Lietotajs> lietotaji;*/

	// izveidoju starptabulu
		@ManyToMany
		@JoinTable(joinColumns = @JoinColumn(name = "IDg"), 
		inverseJoinColumns = @JoinColumn(name = "IDl"))
		@ToString.Exclude
		private Collection<Lietotajs> lietotaji = new ArrayList<Lietotajs>();
	
	public Gramata(String nosaukums, Collection<Autors> autori, Nodala nodala, int gads, Izdevejs izdevejs, Collection<Lietotajs> lietotaji) {
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
		//this.eksemplari = eksemplari;

	}

	public void addAutors(Autors autors) {

		autori.add(autors);
	}
	
	public void addEksemplars(Eksemplars eksemplars) {

		eksemplari.add(eksemplars);
	}
	
	public void addLietotajs(Lietotajs lietotajs) {

		lietotaji.add(lietotajs);
	}

}
