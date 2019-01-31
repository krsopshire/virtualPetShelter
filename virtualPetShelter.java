package virtualPetShelter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class virtualPetShelter {
		Virtualpet adoptPet = new Virtualpet(null, null, 0, 0, 0, 0, 0);
		Map<String, Virtualpet> petSanctuary = new HashMap<String, Virtualpet>();

		public Collection<Virtualpet> inHousePets(){
			return petSanctuary.values();
		}
		
		public void admitPet(Virtualpet adoptPet) {
			String inHousePets = adoptPet.getPetName();
			petSanctuary.put(inHousePets, adoptPet);
		}
		
		
		public void feedAllPets() {
			for (Virtualpet pet : petSanctuary.values()) {
				pet.feedPets();
			}
		}
		
		
	}


