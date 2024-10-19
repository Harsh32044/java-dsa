package com.kunal;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class JsonToArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of User
        List<User> userList = new ArrayList<>();

        // Manually adding the data to the ArrayList
        userList.add(new User("john_doe", "john.doe@example.com", "Twitter"));
        userList.add(new User("jane_smith", "jane.smith@example.com", "Facebook"));
        userList.add(new User("mark_jones", "mark.jones@example.com", "Instagram"));
        userList.add(new User("emma_wilson", "emma.wilson@example.com", "LinkedIn"));
        userList.add(new User("sophia_lee", "sophia.lee@example.com", "Snapchat"));
        userList.add(new User("michael_brown", "michael.brown@example.com", "TikTok"));
        userList.add(new User("oliver_davis", "oliver.davis@example.com", "Pinterest"));
        userList.add(new User("ava_martin", "ava.martin@example.com", "Reddit"));
        userList.add(new User("liam_white", "liam.white@example.com", "YouTube"));
        userList.add(new User("isabella_clark", "isabella.clark@example.com", "WhatsApp"));
        userList.add(new User("isabella_clark", "isabella.clark@example.com", "WhatsApp"));
        userList.add(new User("isabella_clark", "isabella.caaa@example.com", "WhatsApp"));
        Map<String, String> mp=new HashMap<>();
        for(User u: userList){
//            mp.putIfAbsent(u.getSocial_media(),0);
            mp.put(u.getUsername(),u.getEmail());
        }

        Map<String, Long> map = userList.stream().collect(Collectors.groupingBy(
                User::getSocial_media, Collectors.counting()
        ));

        System.out.println(
                userList.stream().collect(Collectors.toMap(
                        User::getUsername,
                        User::getEmail,
                        (existing, newer) -> newer
                )).entrySet().stream().sorted()
        );

//        System.out.println(mp);
    }

    static class User {
        private final String username;
        private final String email;
        private final String social_media;

        public User(String username, String email, String social_media) {
            this.username = username;
            this.email = email;
            this.social_media = social_media;
        }

        public String getSocial_media(){
            return this.social_media;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", email='" + email + '\'' +
                    ", social_media='" + social_media + '\'' +
                    '}';
        }
    }
}