import java.util.Comparator;

public class ProductIDCompare implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getProductId()<o2.getProductId())
			return -1;
		else
			return 0;
	}

}
