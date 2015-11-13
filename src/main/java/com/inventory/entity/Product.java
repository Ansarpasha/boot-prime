package com.inventory.entity;

import java.math.BigDecimal;
import java.util.List;

public interface Product {
		
	public Integer getId() ;
	

	public void setId(Integer id) ;
	

	public String getProductName() ;
	

	public void setProductName(String productName) ;
	

	public Brand getBrand() ;
	

	public void setBrand(Brand brand) ;
	

	public String getColor() ;
	

	public void setColor(String color) ;
	

	public BigDecimal getSellRate() ;
	

	public void setSellRate(BigDecimal sellRate) ;

	public BigDecimal getNetRate() ;
	
	public void setNetRate(BigDecimal netRate) ;

	public Integer getQuantity() ;

	public void setQuantity(Integer quantity) ;

	public Category getCategory() ;

	public void setCategory(Category category) ;

	public List<String> getImageUrls() ;

	public void setImageUrls(List<String> imageUrls) ;

	public String getDescription() ;

	public void setDescription(String description) ;

	public List<Product> getRecommendations() ;

	public void setRecommendations(List<Product> recommendations) ;
	
	public String getImgUrl() ;

	public void setImgUrl(String imgUrl) ;

}
