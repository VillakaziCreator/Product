package Services.Implementation;

import Model.Product;
import Services.Interface.IProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {

    List<Product> productList = new ArrayList<>();

    @Override
    public String addProduct(Product model) {

        try
        {
            if(model != null)
            {
                return "Product successfully added!";
            }

        }catch(Exception ex)
        {
            return ex.getMessage();
        }
        return null;
    }

    @Override
    public Object[] getAllProducts() {
        return productList.toArray();
    }
}
