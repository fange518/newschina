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

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nid;
    private Long ntid;
    @Column(name="ntitle")
    private String ntitle;
    @Column(name = "ncreateDate")
    private Date ncreateDate;
    private String nauthor;
    private String ncontent;
    private String nsummary;
    private Date nmodifyDate;


}