package kg.megalab.natv.model.request;

import kg.megalab.natv.model.dto.UserDto;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.List;

public class CreateOrderRequest {
    String lineText;
    BigDecimal totalSum;
    List<Data> dates;
    List<Long> ids;
    UserDto userDto;
}
