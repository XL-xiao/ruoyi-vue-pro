package cn.iocoder.yudao.framework.sms.core.client;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;
import cn.iocoder.yudao.framework.sms.core.enums.SmsFrameworkErrorCodeConstants;

import java.util.function.Function;

/**
 * 将 API 的错误码，转换为通用的错误码
 *
 * @author 芋道源码
 * @see SmsCommonResult
 * @see SmsFrameworkErrorCodeConstants
 */
public interface SmsCodeMapping extends Function<String, ErrorCode> {
}
