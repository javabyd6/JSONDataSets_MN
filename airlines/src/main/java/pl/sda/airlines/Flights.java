package pl.sda.airlines;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nieckarz
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flights {
    int cancelled;
    int onTime;
    int total;
    int delayed;
    int diverted;
}
