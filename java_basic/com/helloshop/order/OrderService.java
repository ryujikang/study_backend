package com.helloshop.order;
// 패키지 구성 : 서로 관련된 클래스는 하나의 패키지에 모으기 (관련이 적은 클래스는 다른 패키지로 분리)

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class OrderService {
    User user = new User();
    Product product = new Product();

    Order order = new Order(user, product);
}
