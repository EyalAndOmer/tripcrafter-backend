package sk.tripcrafter.tripcrafter_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.tripcrafter.tripcrafter_backend.domain.Trip;
import sk.tripcrafter.tripcrafter_backend.domain.TripPoint;
import sk.tripcrafter.tripcrafter_backend.domain.User;
import sk.tripcrafter.tripcrafter_backend.payload.request.TripPointRequest;
import sk.tripcrafter.tripcrafter_backend.payload.request.TripRequest;
import sk.tripcrafter.tripcrafter_backend.repository.TripPointRepository;
import sk.tripcrafter.tripcrafter_backend.repository.TripRepository;
import sk.tripcrafter.tripcrafter_backend.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/trip")
@CrossOrigin(maxAge = 3600)
public class TripController {
    private final TripRepository tripRepository;
    private final TripPointRepository tripPointRepository;
    private final UserRepository userRepository;

    public TripController(TripRepository tripRepository, TripPointRepository tripPointRepository, UserRepository userRepository) {
        this.tripRepository = tripRepository;
        this.tripPointRepository = tripPointRepository;
        this.userRepository = userRepository;
    }

    @PostMapping("/add_trip")
    public ResponseEntity<String> saveTrip(@RequestBody TripRequest tripRequest) {
        try {
            Trip trip = new Trip();
            trip.setName(tripRequest.getName());

            tripRepository.save(trip);

            List<TripPoint> tripPoints = new ArrayList<>();
            for (TripPointRequest tripPointRequest : tripRequest.getPlaces()) {
                TripPoint tripPoint = new TripPoint();
                tripPoint.setName(tripPointRequest.getName());
                tripPoint.setCityName(tripPointRequest.getCity());
                tripPoint.setDescription(tripPointRequest.getDescription());
                tripPoint.setTrip(trip);
                Optional<User> optionalUser = userRepository.findById(tripRequest.getUserId());
                if (optionalUser.isPresent()) {
                    User user = optionalUser.get();
                    tripPoint.setUser(user);
                } else {
                    return ResponseEntity.badRequest().body("User not found for the provided userId");
                }

                tripPoints.add(tripPoint);
            }

            tripPointRepository.saveAll(tripPoints);

            return ResponseEntity.ok("Trip saved successfully!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save trip.");
        }
    }
}
