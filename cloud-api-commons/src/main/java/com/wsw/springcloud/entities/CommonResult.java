package com.wsw.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author WangSongWen
 * @Date: Created in 10:02 2020/10/10
 * @Description: 前后端分离交互 josn返回信息 实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
