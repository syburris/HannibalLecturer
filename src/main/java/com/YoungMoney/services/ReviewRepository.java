package com.YoungMoney.services;

import com.YoungMoney.entities.Review;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by stevenburris on 11/2/16.
 */
public interface ReviewRepository extends CrudRepository<Review, Integer> {
}
