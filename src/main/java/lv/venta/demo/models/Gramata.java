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

	@Column(name = "IDa")
	private int IDa;

	@Column(name = "IDn")
	private int IDn;

	@Column(name = "Gads")
	private int gads;

	@Column(name = "IDl")
	private int IDl;

	@Column(name = "IDi")
	private int IDi;

	@Column(name = "IDe")
	private int IDe;

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
	@JoinTable(joinColumns = @JoinColumn(name = "IDg"), inverseJoinColumns = @JoinColumn(name = "IDa"))
	private ArrayList<Autors> autori = new ArrayList<Autors>();

	@ManyToMany
	@JoinColumn(name = "IDe")
	private ArrayList<Eksemplars> eksemplari;

	@ManyToMany
	@JoinColumn(name = "IDl")
	private ArrayList<Lietotajs> lietotaji;

	public Gramata(String nosaukums, int IDa, int IDn, int gads, int IDl, int IDi, int IDe) {
		this.nosaukums = nosaukums;
		this.IDa = IDa;
		this.IDn = IDn;
		this.gads = gads;
		this.IDl = IDl;
		this.IDi = IDi;
		this.IDe = IDe;

	}

	public void addAutors(Autors autors) {

		autori.add(autors);
	}

}
