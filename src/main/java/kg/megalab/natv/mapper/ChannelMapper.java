package kg.megalab.natv.mapper;

import kg.megalab.natv.model.dto.ChannelDto;
import kg.megalab.natv.model.entity.Channel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChannelMapper extends BaseMapper<Channel, ChannelDto>{

    ChannelMapper INSTANCE = Mappers.getMapper(ChannelMapper.class);

}
