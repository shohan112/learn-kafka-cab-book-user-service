package com.springbootwithkafka.cab_book_user.controller;

import com.springbootwithkafka.cab_book_user.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consume")
public class ConsumeDriverLocation {

    @Autowired
    private LocationService locationService;

    @GetMapping("/driver-location")
    public ResponseEntity consumeDriverLocation() {
        return new ResponseEntity<>(locationService.getCabLocation(), HttpStatus.OK);
    }
}
