package entities;

import java.util.ArrayList;
import java.util.List;


public class Client {

    private String email;
    private String name;

	List<Client> x = new ArrayList<Client>();

    public Client(String email, String name){

        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Client other = (Client) obj;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

public String toString(){
    return "NOME : "+getName().toUpperCase() + " , "+"E-MAIL : "+getEmail().toUpperCase();     
}


    
    
}