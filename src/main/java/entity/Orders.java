package entity;

import lombok.Data;

import java.util.Date;

@Data
public class Orders {
    private Integer id;
    private Integer userId;
    private String number;
    private Date createTime;
    private String note;
}
