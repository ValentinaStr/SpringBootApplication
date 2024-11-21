package com.example.ec.repo;

import java.util.List;
import java.util.Optional;
import com.example.ec.domain.TourRating;
import org.springframework.data.repository.CrudRepository;

public interface TourRatingRepository extends CrudRepository {
    List<TourRating> findByPkTourId(Integer tourId);

    Optional<TourRating> findByPkTourIdAndPkCustomerId(Integer tourId, Integer customerId);
}
