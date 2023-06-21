package sk.tripcrafter.tripcrafter_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.tripcrafter.tripcrafter_backend.domain.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
}
