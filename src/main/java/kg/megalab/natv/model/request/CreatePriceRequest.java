package kg.megalab.natv.model.request;

import java.math.BigDecimal;
import java.util.Date;

public class CreatePriceRequest {
    BigDecimal pricePerSymbol;
    Date startDate;
    Date endDate;
    Long channelId;
}
