package kg.megalab.natv.model.entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@Table(name = "tb_order_channel")
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderChannel extends AbstractPersistable<Long> {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
    Order order;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cannel_id", referencedColumnName = "id", nullable = false)
    Channel channel;

}
