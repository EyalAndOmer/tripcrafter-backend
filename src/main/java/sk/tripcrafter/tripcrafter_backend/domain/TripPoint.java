package sk.tripcrafter.tripcrafter_backend.domain;

import jakarta.persistence.*;
import java.util.Date;
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

    private Integer order;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    // Constructors, getters, and setters
}