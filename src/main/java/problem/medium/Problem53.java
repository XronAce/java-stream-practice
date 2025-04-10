package problem.medium;

import problem.medium.resources.Customer2;
import problem.medium.resources.Order;

import java.util.List;

public class Problem53 {

    /**
     * 주어진 고객(Customer2) 리스트에서 각 고객별로 주문한 'Milk' 제품의 총 수량을 계산합니다.
     *
     * @param customers 고객 리스트
     * @return 각 고객별 'Milk' 제품의 총 주문 수량을 나타내는 리스트 (예: ["Alice: 2", "John: 5"]
     */
    public static List<String> getTotalMilkOrdersForEachCustomer(List<Customer2> customers) {
        return customers.stream()
            .map(customer -> {
                int totalMilkQuantity = customer.getOrders().stream()
                    .filter(order -> order.getProduct().equals("Milk"))
                    .mapToInt(Order::getQuantity)
                    .sum();
                return totalMilkQuantity == 0 ? customer.getName() + ": " + 0 : customer.getName() + ": " + totalMilkQuantity;
            })
            .toList();
    }
}
