package example.shop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// OrderService 단위 테스트
class OrderServiceTest {

    private OrderService orderService;

    @BeforeEach
    void setUp() { // 필드 선언시 라이프 사이클 때문에 작성해줘야 하는 문법
        orderService = new OrderService(); // 인스턴스 생성
    }

    @Test
    @DisplayName("정상 주문 생성")
    void placeOrder_success() {
        // given
        List<OrderItem> items = List.of(
                new OrderItem("짜장면", 2, 10000)
                ,new OrderItem("짬뽕", 1 , 17000)
        );

        // when
        Order order = orderService.placeOrder(items);

        // then
        assertNotNull(order);
        assertEquals(2, order.getItems().size());
        assertEquals(3, order.totalPrice());
        Assertions.assertThat(order.getCreatedAt()).isNotNull();
        Assertions.assertThat(order.getId()).isPositive();

    }

    @Test
    @DisplayName("검증 실패 : 비어잇는 주문")
    void placeOrder_fail_empty() {
        // given
        List<OrderItem> empty = List.of();
        // when, then
        IllegalAccessError ex = assertThrows(
                IllegalAccessError.class,
                () ->orderService.placeOrder(empty)
        );
    }

    @Test
    @DisplayName("검증 실패 : 수량/가격 규칙 위반")
    void placeOrder_fail_rule() {

    }
}