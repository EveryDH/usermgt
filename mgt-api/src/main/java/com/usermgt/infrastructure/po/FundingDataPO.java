package com.usermgt.infrastructure.po;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 资金数据
 */
@Data
@Table(name = "funding_data")
public class FundingDataPO {

//    name、data

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String province;

    private String data;
}
