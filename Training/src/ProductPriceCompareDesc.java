import java.util.Comparator;

public class ProductPriceCompareDesc implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getPrice() > o2.getPrice())
			return -1;
		else
			return 0;
	}

}
