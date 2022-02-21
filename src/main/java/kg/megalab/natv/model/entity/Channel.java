package kg.megalab.natv.model.entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Builder
@Table(name = "tb_channel")
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Channel extends AbstractPersistable<Long> {

    @Column(name = "name_of_channel", nullable = false)
    String nameOfChannel;

    @Column(name = "channel_numbers", nullable = false, unique = true)
    String channelNumbers;

    @Column(name = "image_source", nullable = false)
    String imageSource;
}
