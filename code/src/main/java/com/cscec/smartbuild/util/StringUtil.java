package com.cscec.smartbuild.util;

import org.springframework.util.StringUtils;

import java.util.List;

/**
 * String工具类
 *
 * @author wangchun
 * @create 2018-04-27 15:42
 **/
public class StringUtil extends StringUtils
{
    /**
     * list是否为空判断
     * @param objectList
     * @return true/false
     */
    public static boolean isEmptyList(List<?> objectList )
    {
        if (objectList == null || objectList.isEmpty())
        {
            return true;
        }

        return false;
    }
}
