package kg.megalab.natv.mapper;

import kg.megalab.natv.model.dto.PriceDto;
import kg.megalab.natv.model.entity.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PriceMapper extends BaseMapper<Price, PriceDto>{

    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);

}
