package com.xbw.springbootbs.utils;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

public class TokenUtils {
    public static String genToken(String userId,String sign) {
        return JWT.create().withAudience(userId)// 将userid保存到token里面作为载荷
                .withExpiresAt(DateUtil.offsetHour(new Date(),2))//两小时后过期
                .sign(Algorithm.HMAC256(sign));//passsword作为token的密钥
    }
}
