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
public class Time {
    String label;
    int year;
    int month;

}
