package com.d288.d288.services;

import com.d288.d288.dao.*;
import com.d288.d288.entities.Cart;
import com.d288.d288.entities.CartItem;
import com.d288.d288.entities.Customer;
import com.d288.d288.enums.StatusType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private CartRepository cartRepository;
    private CartItemRepository cartItemRepository;

    @Autowired
    public CheckoutServiceImpl(CartRepository cartRepository, CartItemRepository cartItemRepository) {
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
    }


    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        //retrieve cart
        Cart cart = purchase.getCart();
        Customer customer = purchase.getCustomer();

        //generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        //set cart items
        Set<CartItem> cartItems = purchase.getCartItems();
        cartItems.forEach(item -> {
            item.setCart(cart);
            cart.add(item);
        });

        //save cart
        cart.setStatus(StatusType.ordered);
        cartRepository.save(cart);

        if (cartItems == null || cartItems.isEmpty()) {
            return new PurchaseResponse("Cart is empty");
        } else {
            return new PurchaseResponse(orderTrackingNumber);
        }
    }

    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}