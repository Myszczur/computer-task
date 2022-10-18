package pl.urbanik.computerapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "The computer name cannot be empty")
    @Size(max = 50, message = "The name cannot exceed 50 characters")
    private String name;
    private Double usdCost;
    private Double plnCost;
    private LocalDate dataRate;
    private LocalDate accountingDate;

    @PrePersist
    public void prePersist() {
        accountingDate = LocalDate.now();
    }
}
