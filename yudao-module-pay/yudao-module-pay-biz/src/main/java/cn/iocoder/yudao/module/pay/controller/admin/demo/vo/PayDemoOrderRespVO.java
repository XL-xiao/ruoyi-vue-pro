package cn.iocoder.yudao.module.pay.controller.admin.demo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDateTime;

/**
 * 示例订单 Base VO，提供给添加、修改、详细的子 VO 使用
 * 如果子 VO 存在差异的字段，请不要添加到这里，影响 Swagger 文档生成
 */
@Data
public class PayDemoOrderRespVO {

    @Schema(description = "订单编号", required = true, example = "1024")
    private Long id;

    @Schema(description = "用户编号", required = true, example = "23199")
    private Long userId;

    @Schema(description = "商品编号", required = true, example = "17682")
    private Long spuId;

    @Schema(description = "商家备注", example = "李四")
    private String spuName;

    @Schema(description = "价格，单位：分", required = true, example = "30381")
    private Integer price;

    @Schema(description = "是否已支付", required = true)
    private Boolean payed;

    @Schema(description = "支付订单编号", example = "16863")
    private Long payOrderId;

    @Schema(description = "订单支付时间")
    private LocalDateTime payTime;

    @Schema(description = "支付渠道", example = "alipay_qr")
    private String payChannelCode;

    @Schema(description = "支付退款编号", example = "23366")
    private Long payRefundId;

    @Schema(description = "退款金额，单位：分", required = true, example = "14039")
    private Integer refundPrice;

    @Schema(description = "退款时间")
    private LocalDateTime refundTime;

    @Schema(description = "创建时间", required = true)
    private LocalDateTime createTime;

}
