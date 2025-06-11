package com.helloshop.order;

// 다른 패키지의 기능이 필요하면 import 사용
// 접근제어자는 public
import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {

    User user;
    Product product;

    // 생성자
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
