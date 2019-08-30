package com.usermgt.infrastructure.po;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author hao.dai
 * @date 2019/8/30
 */

@Data
@Table(name = "project_distribution")
public class ProjectDistributionPO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String data;
}
