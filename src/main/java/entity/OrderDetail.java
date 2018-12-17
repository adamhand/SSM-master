package entity;

import lombok.Data;

@Data
public class OrderDetail {
    private Integer id;
    private Integer ordersId;
    private Integer itemsId;
    private Integer itemsNum;
}
