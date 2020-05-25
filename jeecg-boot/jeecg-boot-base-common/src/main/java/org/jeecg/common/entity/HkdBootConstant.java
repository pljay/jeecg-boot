package org.jeecg.common.entity;

/**
 * 常量
 *
 * @author MrBird
 */
public class HkdBootConstant {

    // 排序规则：降序
    public static final String ORDER_DESC = "desc";
    // 排序规则：升序
    public static final String ORDER_ASC = "asc";

    // 用户APP_ID前缀
    public static final String USER_PREFIX = "hkdBoot";
    // 前端页面路径前缀
    public static final String VIEW_PREFIX = "hkdBoot/views/";


    // 允许下载的文件类型，根据需求自己添加（小写）
    public static final String[] VALID_FILE_TYPE = {"xlsx", "zip","pdf"};

    public static final String[] ACCESS_TYPE={"Web","Api"};

    // 存储在线用户的 zset前缀
    public static final String ACTIVE_USERS_ZSET_PREFIX = "hkdBoot.user.active";
    /**
     * 异步线程池名称
     */
    public static final String ASYNC_POOL = "hkdBootAsyncThreadPool";
    // token缓存前缀
    public static final String TOKEN_CACHE_PREFIX = "hkdBoot.cache.token.";

    //临时文件夹名
    public static final String TEMP_DIR = "hkdBootDir";
}
