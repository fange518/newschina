package com.hr.entity;

/*
    Created with IntelliJ IDEA.
    @author: wang sir
    Date: 2021/7/16
    Time: 16:01
    To change this template use File | Settings | File Templates.
    Description: 
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long nid;
    private long ntid;
    private String ntitle;
    private Date ncreateDate;
    private String nauthor;
    private String ncontent;
    private String nsummary;
    private Date nmodifyDate;


}