package entity;

import lombok.Data;

import java.util.Date;

@Data
public class Items {
    private Integer id;
    private String name;
    private Date createTime;
    private Float price;
    private String pic;
    private String detail;
}
