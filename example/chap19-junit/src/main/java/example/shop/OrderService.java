package example.shop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// 주문 서비스 : 주문 항목을 받아 order 만들고 list에 저장
public class OrderService {
    // 프로그램 실행 되는 동안만 주문 보관 조정소
    private final List<Order> orders = new ArrayList<>();

    // 주문 번호 카운팅 변수
    private long sequence = 0;

    // 주문 생성 : 검증 > 번호 발급 > 생성 시간 기록 > 리스트 저장
    public Order placeOrder(List<OrderItem> items) {
        validate(items); // 걸렸을 경우 exception 에러가 터지고, 아닌 경우

        sequence++; // 주문 번호 증가

        Order order = new Order(
            sequence, items, LocalDateTime.now() // 생성 기록 저장
        );

        orders.add(order); // 주문 저장
        return null;
    }

    // 전체 주문 목록 조회
    public List<Order> getOrders() {
        return orders;
    }

    // 인증 검증 전용 private 메소드
    private void validate(List<OrderItem> items) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("주문 항목이 비어있습니다.");
        }

        boolean invalid = items.stream()
                .anyMatch(i -> i.getQuantity() <= 0 || i.getQuantity() < 0);

        if (invalid) {
            throw new IllegalArgumentException("수령은 1 이상, 가격은 0 이상이어야 한다.");
        }
    }

}
