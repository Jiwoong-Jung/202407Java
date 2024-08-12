package drive;

import shop.CartDAO;
import shop.CartProducts;

public class Ex3 {

	public static void main(String[] args) {
		CartDAO dao = new CartDAO();
		 for (CartProducts cartProducts : dao.viewCart()) {
			 System.out.println(cartProducts);
		 }

	}

}
