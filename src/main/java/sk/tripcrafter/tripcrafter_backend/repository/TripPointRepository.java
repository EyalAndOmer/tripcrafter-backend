package sk.tripcrafter.tripcrafter_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.tripcrafter.tripcrafter_backend.domain.TripPoint;

@Repository
public interface TripPointRepository extends JpaRepository<TripPoint, Long> {
}
