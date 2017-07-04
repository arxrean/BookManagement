package com.crazybooks.etity;

import java.text.ParseException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
public class BookCart {
	private float totalPrice;
	public Map<Integer,BookCartItem> cartMap=new LinkedHashMap<Integer,BookCartItem>();
	Collection<Books> cartItems;
	public void setCartMap(Map<Integer, BookCartItem> cartMap) {
		this.cartMap = cartMap;
	}
	public Map<Integer, BookCartItem> getCartMap() {
		return cartMap;
	}
	public Collection<BookCartItem> getCartItems()
	{
		return cartMap.values();
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void addToCart(BookCartItem bookCartItem ) throws ParseException
	{
		if(cartMap.containsKey(bookCartItem))
		{
			cartMap.get(bookCartItem.getBook().getId()).num++;
		}else{
			cartMap.put(bookCartItem.getBook().getId(), bookCartItem);
		}
		totalPrice=totalPrice+bookCartItem.getSubTotal();
	}
	public void removItem(int bid) throws ParseException {
		// TODO Auto-generated method stub
		totalPrice=totalPrice-cartMap.get(bid).getSubTotal();
	    this.cartMap.remove(bid);
	}
}
