package kg.megalab.natv.mapper;

import kg.megalab.natv.model.dto.ChannelDiscountDto;
import kg.megalab.natv.model.entity.ChannelDiscount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface ChannelDiscountMapper extends BaseMapper<ChannelDiscount, ChannelDiscountDto>{

    ChannelDiscountMapper INSTANCE = Mappers.getMapper(ChannelDiscountMapper.class);

}
