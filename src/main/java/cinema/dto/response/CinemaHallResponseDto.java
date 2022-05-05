package cinema.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CinemaHallResponseDto {
    private Long id;
    private int capacity;
    private String description;
}
