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
public class Autors {
	
	@Setter(value = AccessLevel.NONE)
	@Column(name="IDa")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) // - unikāla
	private int IDa;
	
	@Column(name = "Vards")
	private String vards;
	
	@Column(name = "Uzvards")
	private String uzvards;	
	
	@ManyToMany(mappedBy = "autors")
	private ArrayList<Gramata> gramatas = new ArrayList<Gramata>();
	
	
	public Autors(String vards, String uzvards, ArrayList<Gramata> gramatas) {
		this.vards = vards;
		this.uzvards = uzvards;
		this.gramatas = gramatas;
	}
	
	

}
