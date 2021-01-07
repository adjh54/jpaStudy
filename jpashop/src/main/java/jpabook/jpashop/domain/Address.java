package jpabook.jpashop.domain;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter @Setter @ToString
public class Address {

	
	private String city;
	private String street;
	private String zipCode;
	
	protected Address() {
		
	}
}
