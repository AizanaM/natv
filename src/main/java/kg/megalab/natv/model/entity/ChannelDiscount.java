package kg.megalab.natv.model.entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Builder
@Table(name = "tb_channel_discount")
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelDiscount extends AbstractPersistable<Long> {

    @Column(name = "percent", nullable = false)
    Integer percent;

    @Column(name = "active_from_number", nullable = false)
    Integer activeFromNumber;

    @Column(name = "start_date", nullable = false)
    Date startDate;

    @Column(name = "end_date", nullable = false)
    Date endDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "channel_id", referencedColumnName = "id", nullable = false)
    Channel channel;
}
