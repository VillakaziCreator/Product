package Services.Interface;

import Model.Product;

public interface IProductService {

    String addProduct(Product model);
    Object[] getAllProducts();
}
