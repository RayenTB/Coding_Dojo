package com.example.SaveTravels.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SaveTravels.Models.Travel;

@Repository
public interface TravelRepository extends CrudRepository<Travel, Long> {
 List<Travel> findAll();
}