package sk.tripcrafter.tripcrafter_backend.payload.request;

import java.util.List;

public class TripRequest {
    private String name;
    private List<TripPointRequest> places;
    private Long userId;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TripPointRequest> getPlaces() {
        return places;
    }

    public void setPlaces(List<TripPointRequest> places) {
        this.places = places;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

