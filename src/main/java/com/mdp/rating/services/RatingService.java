package com.mdp.rating.services;

import com.mdp.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);


    //get all ratings
    List<Rating> getRatings();

    //get all by userID
    List<Rating> getRatingsByUserId(String userId);

    //get all by hotel
    List<Rating> getRatingsByHotelId(String hotelId);
}
