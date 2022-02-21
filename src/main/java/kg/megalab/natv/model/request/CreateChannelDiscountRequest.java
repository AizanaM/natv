package kg.megalab.natv.model.request;
import kg.megalab.natv.model.dto.ChannelDto;
import java.util.Date;

public class CreateChannelDiscountRequest {

    Integer percent;
    Integer activeFromNumber;
    Date startDate;
    Date endDate;
    ChannelDto channelDto;
}
