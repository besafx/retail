package com.retial.app.domain.service;

import com.retial.app.domain.entity.Bill;
import com.retial.app.domain.entity.Item;
import com.retial.app.domain.entity.User;
import com.retial.app.domain.enums.UserType;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillServiceTest {

    private final BillService billService = new BillService();

    @Test
    public void testCalculateNetPrice_Employee() {

        User user = User.builder()
                .id(1L)
                .name("User1")
                .type(UserType.EMPLOYEE)
                .build();

        Bill bill = Bill.builder()
                .id(1L)
                .items(
                        Arrays.asList(
                                Item.builder().id(1L).name("Item1").price(100).isGrocery(false).build(),
                                Item.builder().id(2L).name("Item2").price(200).isGrocery(true).build(),
                                Item.builder().id(3L).name("Item3").price(300).isGrocery(false).build()
                        )
                )
                .build();

        double net = billService.calculateNetPrice(user, bill);
        assertEquals(450, net);
    }

    @Test
    public void testCalculateNetPrice_Affiliate() {
        User user = User.builder()
                .id(2L)
                .name("User2")
                .type(UserType.AFFILIATE)
                .build();

        Bill bill = Bill.builder()
                .id(2L)
                .items(
                        Arrays.asList(
                                Item.builder().id(1L).name("Item1").price(100).isGrocery(false).build(),
                                Item.builder().id(2L).name("Item2").price(200).isGrocery(true).build(),
                                Item.builder().id(3L).name("Item3").price(300).isGrocery(false).build()
                        )
                )
                .build();

        double net = billService.calculateNetPrice(user, bill);
        assertEquals(530, net);
    }

    @Test
    public void testCalculateNetPrice_LoyalCustomer() {
        User user = User.builder()
                .id(3L)
                .name("User3")
                .type(UserType.CUSTOMER)
                .build();

        Bill bill = Bill.builder()
                .id(3L)
                .items(
                        Arrays.asList(
                                Item.builder().id(1L).name("Item1").price(100).isGrocery(false).build(),
                                Item.builder().id(2L).name("Item2").price(200).isGrocery(true).build(),
                                Item.builder().id(3L).name("Item3").price(300).isGrocery(false).build()
                        )
                )
                .build();

        double net = billService.calculateNetPrice(user, bill);
        assertEquals(550, net);
    }

    @Test
    public void testCalculateNetPrice_NoPercentageDiscount() {
        User user = User.builder()
                .id(3L)
                .name("User4")
                .build();

        Bill bill = Bill.builder()
                .id(4L)
                .items(
                        Arrays.asList(
                                Item.builder().id(1L).name("Item1").price(100).isGrocery(false).build(),
                                Item.builder().id(2L).name("Item2").price(200).isGrocery(true).build(),
                                Item.builder().id(3L).name("Item3").price(300).isGrocery(false).build()
                        )
                )
                .build();

        double net = billService.calculateNetPrice(user, bill);
        assertEquals(570, net);
    }

}