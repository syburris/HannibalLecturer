package com.YoungMoney.controllers;

import com.YoungMoney.services.LecturerRepository;
import com.YoungMoney.services.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by stevenburris on 11/2/16.
 */
@Controller
public class HannibalLecturerController {

    @Autowired
    LecturerRepository lecturers;

    @Autowired
    ReviewRepository reviews;

    @RequestMapping(path = "/lecturers", method = RequestMethod.POST)
    String addLecturer(String name, String topic, String image) {
        return "redirect:/";
    }

    @RequestMapping(path = "/reviews", method = RequestMethod.POST)
    String addReview(String author, String text, boolean isGood, int lecturerId) {
        return "redirect:/";
    }
}
