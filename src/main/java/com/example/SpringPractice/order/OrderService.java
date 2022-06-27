package com.example.SpringPractice.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
