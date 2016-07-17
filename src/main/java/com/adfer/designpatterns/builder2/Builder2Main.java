package com.adfer.designpatterns.builder2;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class Builder2Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Adrian", "Ferenc").build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("Greta", "Romanów").age(26).build();
        System.out.println(user2);

        User user3 = new User.UserBuilder("Jan", "Nowak").address("Streat 12/3, 27-500 Jarosław").build();
        System.out.println(user3);
    }
}
