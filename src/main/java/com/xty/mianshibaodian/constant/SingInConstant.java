package com.xty.mianshibaodian.constant;

public interface SingInConstant {
    /**
     * 用户签到记录的 Redis Key 前缀
     */
    String USER_SIGN_IN_REDIS_KEY_PREFIX  = "user:singins";

    /**
     * 获取用户签到记录的 Redis Key
     * @param year 年份
     * @param userId 用户 id
     * @return 拼接好的 Redis Key
     */
    static String getUserSingInRedisKey(Integer year, Long userId){
        return String.format("$s:%s:%s",USER_SIGN_IN_REDIS_KEY_PREFIX, year, userId);
    }
}
