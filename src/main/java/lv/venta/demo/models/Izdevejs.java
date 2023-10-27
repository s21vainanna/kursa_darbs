package lv.venta.demo.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Izdevejs {
	
	@Setter(value = AccessLevel.NONE)
	@Column(name="IDi")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) // - unikāla
	private int IDi;
	
	@Column(name = "Nosaukums")
	private String nosaukums;
	
	@OneToMany(mappedBy = "izdevejs")
	@ToString.Exclude
	private ArrayList<Gramata> gramatas;
	
	public Izdevejs(String nosaukums) {
		this.nosaukums = nosaukums;
		
	}
	
	

}
