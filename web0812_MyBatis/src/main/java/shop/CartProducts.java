package shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class CartProducts {
	private int id;
	private String name;
	private String description;
	private double price;
	private int stock;
	private int product_id;
	private int quantity;
}
