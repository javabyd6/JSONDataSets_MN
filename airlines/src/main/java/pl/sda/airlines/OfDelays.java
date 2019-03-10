package pl.sda.airlines;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nieckarz
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OfDelays {
    int lateAircraft;
    int weather;
    int security;
    int nationalAviationSystem;
    int carrier;
}
