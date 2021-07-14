package br.com.dmb.workshopmongo.dto;

import java.io.Serializable;

import br.com.dmb.workshopmongo.domain.User;

public class UserDTO implements Serializable{
	/*No curso ele está buscando doas as informações, mas o DTO deveria ser apra buscar apenas informações necessárias
	 * Ex: Só Id ou Name 
	 */
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String  email;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
