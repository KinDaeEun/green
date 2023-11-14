package ch03;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Data
public class Owner {
	private String ownerName ;
	private List<Pet> petList = new ArrayList<Pet>();
}
