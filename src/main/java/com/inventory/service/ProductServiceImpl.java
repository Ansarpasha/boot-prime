/**
 * 
 */
package com.inventory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import com.inventory.entity.Product;

import proto.ProductSearchRequest;
import proto.ProductSearchResonse;


/**
 * @author apasha
 *
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private InventoryRepoService inventoryRepoService;
	
	@Override
	public Integer addProductToInventory(proto.Product productProto) {
		//getProduct object from proto object.
		Product product = buildProductEntity(productProto);
		return inventoryRepoService.addProductToInventory(product);
	}
	@Override
	public ProductSearchResonse getProductsForFilter(ProductSearchRequest productSearchRequest) {
		ProductFilter productFilter = buildProductEntity(productSearchRequest);
		List<Product> productResults =inventoryRepoService.getProductByFilter(productFilter);
		return buildProductSearchResponse(productResults);
	}
	
	private Product buildProductEntity(proto.Product productProto) {
		// TODO Auto-generated method stub
		return null;
	}
	private ProductSearchResonse buildProductSearchResponse(List<Product> productResults) {
		// TODO Auto-generated method stub
		return null;
	}
	private ProductFilter buildProductEntity(ProductSearchRequest productSearchRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ProductSearchResonse getProductById(Integer id) {
		Product product = inventoryRepoService.getProductsById(id);
		List<Product> productList = new ArrayList<>();
		productList.add(product);
		return buildProductSearchResponse(productList);
	}
	

	
}
