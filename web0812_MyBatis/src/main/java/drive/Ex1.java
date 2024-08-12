package drive;

import shop.Product;
import shop.ProductDAO;

public class Ex1 {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		Product product = new Product(1, "샤프1", "최고의 샤프1", 12000, 5);  // 업데이트 할 내용
		dao.updateProduct(product);
		System.out.println("수정 완료");

	}

}
