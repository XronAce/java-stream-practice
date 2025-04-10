package problem.easy;

import problem.easy.resources.Customer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem10 {

    /**
     * 주어진 Customer 객체 리스트를 나이(age)별로 그룹화하여 Map으로 반환합니다.
     *
     * @param customers Customer 객체 리스트
     * @return 나이별로 그룹화된 Map
     */
    public static Map<Integer, List<Customer>> groupCustomersByAge(List<Customer> customers) {
        return customers.stream()
            .collect(Collectors.groupingBy(
                Customer::getAge,
                Collectors.toList()
            ));
    }
}