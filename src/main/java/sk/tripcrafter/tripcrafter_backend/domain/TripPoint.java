package sk.tripcrafter.tripcrafter_backend.domain;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Trip_point")
public class TripPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;

    private Integer day;

    private String name;

    private String note;

    private String type;

    private Integer place_order;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPlace_order() {
        return place_order;
    }

    public void setPlace_order(Integer order) {
        this.place_order = order;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripPoint tripPoint = (TripPoint) o;
        return Objects.equals(id, tripPoint.id) && Objects.equals(user, tripPoint.user) && Objects.equals(trip, tripPoint.trip) && Objects.equals(day, tripPoint.day) && Objects.equals(name, tripPoint.name) && Objects.equals(note, tripPoint.note) && Objects.equals(type, tripPoint.type) && Objects.equals(place_order, tripPoint.place_order) && Objects.equals(createdAt, tripPoint.createdAt) && Objects.equals(updatedAt, tripPoint.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, trip, day, name, note, type, place_order, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "TripPoint{" +
                "id=" + id +
                ", user=" + user +
                ", trip=" + trip +
                ", day=" + day +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", type='" + type + '\'' +
                ", order=" + place_order +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}