package kg.megalab.natv.model.dto;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelDiscountDto {

    Long id;
    Integer percent;
    Integer activeFromNumber;
    Date startDate;
    Date endDate;
    ChannelDto channelDto;
}
