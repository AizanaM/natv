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
@Table(name = "tb_order_dates")
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDates extends AbstractPersistable<Long> {

    @Column(name = "ad_dates", nullable = false)
    Date adDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_channel_id", referencedColumnName = "id", nullable = false)
    OrderChannel orderChannel;

}
