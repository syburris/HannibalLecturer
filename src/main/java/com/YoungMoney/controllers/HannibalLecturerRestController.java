package com.YoungMoney.controllers;

import com.YoungMoney.entities.Review;
import com.YoungMoney.services.LecturerRepository;
import com.YoungMoney.services.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stevenburris on 11/2/16.
 */
@RestController
public class HannibalLecturerRestController {

    @Autowired
    LecturerRepository lecturers;

    @Autowired
    ReviewRepository reviews;



}
