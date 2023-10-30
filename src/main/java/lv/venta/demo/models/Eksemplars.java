package lv.venta.demo.models;

import java.util.ArrayList;
import java.util.Collection;

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
public class Eksemplars {
	
	@Setter(value = AccessLevel.NONE)
	@Column(name="IDe")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) // - unikāla
	private int IDe;
	
	@Column(name = "Skaits")
	private int skaits;
	
	@ManyToMany(mappedBy = "eksemplari")
	@ToString.Exclude
	private Collection<Gramata> gramatas = new ArrayList<Gramata>();
	
	
	public Eksemplars(int skaits, Collection<Gramata> gramatas) {
		this.skaits = skaits;
		this.gramatas = gramatas;
	}
	
	

}
