package com.d288.d288.services;

import com.d288.d288.dao.CartItemRepository;
import com.d288.d288.dao.CartRepository;
import com.d288.d288.entities.Cart;
import com.d288.d288.entities.CartItem;
import com.d288.d288.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    public CheckoutServiceImpl(CartRepository cartRepository, CartItemRepository cartItemRepository) {
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
    }


    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        Cart cart = purchase.getCart();
        Customer customer = purchase.getCustomer();

        //Generate an order tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        purchase.getCart().setOrderTrackingNumber(orderTrackingNumber);

        //Get items from the purchase
        Set<CartItem> cartItems = purchase.getCartItems();
        cartItems.forEach(item -> {item.setCart(cart); cart.add(item);});

        //save to database
        cartRepository.save(cart);

        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}
