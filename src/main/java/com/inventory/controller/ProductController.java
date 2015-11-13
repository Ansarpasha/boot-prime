/**
 * 
 */
package com.inventory.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inventory.service.ProductService;

import proto.Product;
import proto.ProductSearchRequest;
import proto.ProductSearchResonse;

/**
 * @author apasha
 *
 */
@Controller
public class ProductController {
	@Autowired
	private ProductService productService ;
	
	@RequestMapping("/test")
	public @ResponseBody String test() {
		return "Tested and its working";
	}

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public @ResponseBody String addProducts(final InputStream inputStream)  {
		proto.Product product = null;
		
		try {
			product = proto.Product.parseFrom(inputStream);
		} catch (IOException e) {
			String message = "Unable to get probuf from input stream";
			System.err.println(message);
			e.printStackTrace();
			throw new RuntimeException(message);
		}
		Integer id =productService.addProductToInventory(product);
		
		return id.toString();
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public @ResponseBody ProductSearchResonse getProducts(final InputStream inputStream) {
		ProductSearchRequest productSearchRequest = null ;
		try {
			productSearchRequest =ProductSearchRequest.parseFrom(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return productService.getProductsForFilter(productSearchRequest);
	}
	
	@RequestMapping(value = "/products/{productId}", method = RequestMethod.GET)
	public @ResponseBody ProductSearchResonse getProduct(final @PathVariable("productId") int productId) {
		return productService.getProductById(productId);
	}

	@RequestMapping(value = "/products", method = RequestMethod.PUT)
	public @ResponseBody String updateProducts() {
		return "Tested and its working";
	}

	@RequestMapping(value = "/products", method = RequestMethod.DELETE)
	public @ResponseBody String deleteProducts() {
		return "Tested and its working";
	}
}
