package cinema.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class CinemaHallRequestDto {
    @Min(value = 50)
    @Max(value = 200)
    private int capacity;
    private String description;

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }
}
