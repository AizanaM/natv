package kg.megalab.natv.model.dto;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDatesDto {

    Long id;
    Date adDate;
    OrderChannelDto orderChannelDto;
}
