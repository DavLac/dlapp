package fr.dla.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
    private Integer distance;
    private OrderStatusEnum status;
}
