package pl.sda.airlines;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author nieckarz
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Statistics {
    Flights flights;
    OfDelays ofDelays;
    MinutesDelayed minutesDelayed;


}
