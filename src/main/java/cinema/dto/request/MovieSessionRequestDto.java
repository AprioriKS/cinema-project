package cinema.dto.request;

import java.time.LocalDateTime;
import javax.validation.constraints.Min;

public class MovieSessionRequestDto {
    @Min(value = 1)
    private Long movieId;
    @Min(value = 1)
    private Long cinemaHallId;
    private LocalDateTime showTime;

    public Long getMovieId() {
        return movieId;
    }

    public Long getCinemaHallId() {
        return cinemaHallId;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }
}
