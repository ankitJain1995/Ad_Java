package com.market.service;

import com.market.model.CartBean;
import java.util.List;



public interface CartService {

	public String addProductToCart(String userId, String prodId, int prodQty);

	public String updateProductToCart(String userId, String prodId, int prodQty);

	public List<CartBean> getAllCartItems(String userId);

	public int getCartCount(String userId);

	public int getCartItemCount(String userId, String itemId);

	public String removeProductFromCart(String userId, String prodId);

	public boolean removeAProduct(String userId, String prodId);

}