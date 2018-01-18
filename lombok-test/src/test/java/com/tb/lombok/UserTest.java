package com.tb.lombok;

import org.junit.Test;

/**
 * @Author tb
 * @Date 2018/1/18 13:35
 */
public class UserTest {
    @Test
    public void testUser() {
        User user = new User(1);
        System.out.println(user.name("Tong Bin").age(20).flag(true));
    }
}
