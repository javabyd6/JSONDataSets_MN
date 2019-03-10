package pl.sda.airlines;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * @author nieckarz
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airlines {
    Airport airport;
    Statistics statistics;
    Time time;
    Carrier carrier;
}
