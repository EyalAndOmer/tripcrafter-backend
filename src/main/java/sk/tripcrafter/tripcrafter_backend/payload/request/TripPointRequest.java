package sk.tripcrafter.tripcrafter_backend.payload.request;

public class TripPointRequest {
    private String name;
    private String city;
    private String description;

    // Constructors

    public TripPointRequest() {
    }

    public TripPointRequest(String name, String city, String description) {
        this.name = name;
        this.city = city;
        this.description = description;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
