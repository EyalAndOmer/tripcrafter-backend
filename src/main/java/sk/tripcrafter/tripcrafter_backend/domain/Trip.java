package sk.tripcrafter.tripcrafter_backend.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Trip")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "max_cost")
    private Double maxCost;

    @Column(name = "number_of_days")
    private Integer numberOfDays;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    // Constructors, getters, and setters
}
