package cinema.dto.response;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponseDto {
    private Long id;
    private List<Long> ticketIds;
    private Long userId;
    private LocalDateTime orderTime;
}
