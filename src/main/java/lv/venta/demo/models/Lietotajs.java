package lv.venta.demo.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Lietotajs {
	
	@Setter(value = AccessLevel.NONE)
	@Column(name="IDl")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) // - unikāla
	private int IDl;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Surname")
	private String surname;
	
	@Column(name = "PC")
	private int pc;
	
	@ManyToMany(mappedBy = "lietotajs")
	@ToString.Exclude
	private ArrayList<Gramata> gramatas;
	
	public Lietotajs(String name, String surname, int pc) {
		this.name = name;
		this.surname = surname;
		this.pc = pc;
	}
	
	

}
