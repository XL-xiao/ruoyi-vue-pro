package cn.iocoder.yudao.module.promotion.dal.dataobject.discount;

import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import cn.iocoder.yudao.module.promotion.enums.common.PromotionDiscountTypeEnum;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 限时折扣商品 DO
 *
 * @author 芋道源码
 */
@TableName(value = "promotion_discount_product", autoResultMap = true)
@KeySequence("promotion_discount_product_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
public class DiscountProductDO extends BaseDO {

    /**
     * 编号，主键自增
     */
    @TableId
    private Long id;
    /**
     * 限时折扣活动的编号
     * <p>
     * 关联 {@link DiscountActivityDO#getId()}
     */
    private Long activityId;
    /**
     * 商品 SPU 编号
     * <p>
     * 关联 ProductSpuDO 的 id 编号
     */
    private Long spuId;
    /**
     * 商品 SKU 编号
     * <p>
     * 关联 ProductSkuDO 的 id 编号
     */
    private Long skuId;

    /**
     * 折扣类型
     * <p>
     * 枚举 {@link PromotionDiscountTypeEnum}
     */
    private Integer discountType;
    /**
     * 折扣百分比
     * <p>
     * 例如，80% 为 80
     */
    private Integer discountPercent;
    /**
     * 优惠金额，单位：分
     * <p>
     * 当 {@link #discountType} 为 {@link PromotionDiscountTypeEnum#PRICE} 生效
     */
    private Integer discountPrice;

}
