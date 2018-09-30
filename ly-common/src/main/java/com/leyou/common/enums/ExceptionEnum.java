package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author bystander
 * @date 2018/9/15
 */
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    BRAND_CREATE_FAILED(500, "新增品牌失败"),
    BRAND_NOT_FOUND(404, "品牌查询失败"),
    UPDATE_BRAND_FAILED(500, "品牌更新失败"),
    DELETE_BRAND_EXCEPTION(500, "删除品牌失败"),

    GOODS_SAVE_ERROR(500, "新增商品错误"),
    GOODS_NOT_FOUND(400, "商品未查询到"),
    GOODS_NOT_SALEABLE(400, "商品未上架"),
    GOODS_UPDATE_ERROR(500, "商品更新失败"),
    DELETE_GOODS_ERROR(500, "删除商品错误"),
    UPDATE_SALEABLE_ERROR(500, "更新商品销售状态错误"),

    CATEGORY_NOT_FOUND(204, "分类未查询到"),
    SPU_NOT_FOUND(201, "SPU未查询到"),
    SKU_NOT_FOUND(201, "SKU未查询到"),

    INVALID_FILE_FORMAT(400, "文件格式错误"),
    UPLOAD_IMAGE_EXCEPTION(500, "文件上传异常"),
    INVALID_PARAM(400, "参数错误"),
    VERIFY_CODE_NOT_MATCHING(400, "验证码错误"),
    PASSWORD_NOT_MATCHING(400, "密码错误"),
    USER_NOT_EXIST(404, "用户不存在"),

    SPEC_PARAM_NOT_FOUND(204, "规格参数查询失败"),
    UPDATE_SPEC_PARAM_FAILED(500, "商品规格参数更新失败"),
    DELETE_SPEC_PARAM_FAILED(500, "商品规格参数删除失败"),
    SPEC_PARAM_CREATE_FAILED(500, "新增规格参数失败"),


    SPEC_GROUP_CREATE_FAILED(500, "新增规格组失败"),
    SPEC_GROUP_NOT_FOUND(204, "规格组查询失败"),
    DELETE_SPEC_GROUP_FAILED(500, "商品规格组删除失败"),
    UPDATE_SPEC_GROUP_FAILED(500, "商品规格组更新失败"),


    ;
    int value;
    String message;

    public int value() {
        return this.value;
    }

    public String message() {
        return this.message;
    }


}
