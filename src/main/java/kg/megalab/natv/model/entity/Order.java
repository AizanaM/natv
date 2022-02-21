package kg.megalab.natv.model.entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Builder
@Table(name = "tb_order")
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order extends AbstractPersistable<Long> {

    @Column(name = "line_text", nullable = false)
    String lineText;

    @Column(name = "total_sum", nullable = false)
    BigDecimal totalSum;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    User user;

}
