package com.springbootwithkafka.cab_book_user.service;

import com.springbootwithkafka.cab_book_user.constant.UserConstant;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    String cabLoc = "";
    @KafkaListener(topics = UserConstant.CAB_LOCATION, groupId = UserConstant.USER_GROUP)
    public void cabLocation(String location) {
        System.out.println("Cab location: " + location);
        cabLoc = location;
    }

    public String getCabLocation() {
        return cabLoc;
    }

}
