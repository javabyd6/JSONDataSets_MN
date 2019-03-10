package pl.sda.airlines;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nieckarz
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MinutesDelayed {
    int lateAircraft;
    int weather;
    int carrier;
    int security;
    int total;
    int nationalAviationSystem;

}
