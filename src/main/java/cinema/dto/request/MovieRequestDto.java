package cinema.dto.request;

import javax.validation.constraints.NotBlank;

public class MovieRequestDto {
    @NotBlank
    private String title;
    @NotBlank
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
