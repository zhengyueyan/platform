package com.zyy.entity;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


/**
 * 系统用户Token
 */
@Data
@Accessors(chain = true)
public class SysUserTokenEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//用户ID
	private Long userId;
	//token
	private String token;
	//过期时间
	private Date expireTime;
	//更新时间
	private Date updateTime;

}
