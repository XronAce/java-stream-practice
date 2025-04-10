package problem.medium;

import problem.medium.resources.Customer2;
import problem.medium.resources.Order;

import java.util.Comparator;
import java.util.List;

public class Problem55 {

    /**
     * 주어진 고객(Customer2) 리스트에서 'Bread' 제품을 가장 많이 주문한 고객의 이름을 반환합니다.
     * 동일한 수량을 주문한 고객이 여럿이면, 그 중 하나의 이름을 반환합니다.
     *
     * @param customers 고객 리스트
     * @return 'Bread' 제품을 가장 많이 주문한 고객의 이름
     */
    public static String getCustomerWhoOrderedMostBread(List<Customer2> customers) {
        return customers.stream()
            .max(Comparator.comparing(customer -> customer.getOrders().stream()
                .filter(order -> order.getProduct().equals("Bread"))
                .map(Order::getQuantity)
                .mapToInt(Integer::intValue)
                .sum()))
            .map(Customer2::getName)
            .orElse("");
    }
}
