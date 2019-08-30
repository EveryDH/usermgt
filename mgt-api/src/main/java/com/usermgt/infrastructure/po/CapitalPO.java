package com.usermgt.infrastructure.po;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;


@Data
@Table(name = "capital")
public class CapitalPO {
//        姓名 籍贯 投资时间 收支类型 收入 支出 账号资金

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String native_place;

    private Date investment_time;

    private String payment_type;

    private BigDecimal income;

    private BigDecimal expenditure;

    private BigDecimal user_capital;

    private String remarks;
}

