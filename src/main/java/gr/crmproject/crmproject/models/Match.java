package gr.crmproject.crmproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Match {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID matchId;
    private String typeOfMatching = "Automatic";
    private String status;
    private double percentage;
    private LocalDate finalisedDate;

    @ManyToOne
    private Applicant applicant;

    @ManyToOne
    private JobOffer jobOffer;

}
