package com.rtpl.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("customerBean")
public class Item {
	/*private String name;

	private int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", quantity=" + quantity + "]";
	}
*/
	
	/*Second Way For this Example With Annotations*/
	
	
	
	@Value("#{itemBean}")
	private Item item;

	@Value("#{itemBean.name}")
	private String itemName;
	
	
}
