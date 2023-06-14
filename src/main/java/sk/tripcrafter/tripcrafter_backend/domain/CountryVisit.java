package sk.tripcrafter.tripcrafter_backend.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Country_visit")
public class CountryVisit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    // Constructors, getters, and setters
}