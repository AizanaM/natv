package kg.megalab.natv.model.dto;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PriceDto {

    Long id;
    BigDecimal pricePerSymbol;
    Date startDate;
    Date endDate;
    ChannelDto channelDto;
}
