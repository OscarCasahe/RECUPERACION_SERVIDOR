package org.iesalixar.dao;

import java.util.ArrayList;

import org.iesalixar.model.ProductLine;

public interface ProductLineDAO {

	public ProductLine getProductLine(String productLine);

	public ArrayList<ProductLine> getAllProductLine();

	public boolean updateProductLine(ProductLine productLine);

	public boolean removeProductLine(String productLine);

	public boolean createProductLine(ProductLine productLine);
}
