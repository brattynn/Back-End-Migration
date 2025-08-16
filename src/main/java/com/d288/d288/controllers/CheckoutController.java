package com.d288.d288.controllers;

import com.d288.d288.services.CheckoutService;
import com.d288.d288.services.Purchase;
import com.d288.d288.services.PurchaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    @Autowired
    private CheckoutService checkoutService;

    @CrossOrigin("http://localhost:4200")
    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse savedPurchase = checkoutService.placeOrder(purchase);

        PurchaseResponse purchaseResponse = new PurchaseResponse(savedPurchase.getCart().getOrderTrackingNumber());

        return savedPurchase;
    }



}







