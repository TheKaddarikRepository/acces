package loging;

import java.util.ArrayList;
import java.util.List;

public class SecRessRole {
	private List<RolesAvailable> myRoles;
	
	public SecRessRole () {
		myRoles=new ArrayList<>();
		myRoles.add(RolesAvailable.Standard);
	}

	public void addRole(RolesAvailable oneMore) {
		
	}
	
	public List<RolesAvailable> getList(){
		return myRoles;
	}
}
