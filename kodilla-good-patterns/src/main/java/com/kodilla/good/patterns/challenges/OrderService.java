package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderService {
    boolean order(User user, String product, int quantity);
}
