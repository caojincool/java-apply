package com.shop.model.pojo;

import java.util.Date;

public class OdSaleafter {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.order_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.from_source
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private Integer fromSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.order_amount
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private Long orderAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.cost_amount
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private Long costAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.product_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.product_name
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.sku_num
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private String skuNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.apply_time
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private Date applyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.user_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.user_name
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.shop_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private Long shopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.shop_name
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private String shopName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.refund_type
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private Integer refundType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.refund_reason
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private String refundReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.saleafter_state
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private Integer saleafterState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.deal_time
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private Date dealTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.complete_time
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private Date completeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_saleafter.complain_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    private Long complainId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.id
     *
     * @return the value of od_saleafter.id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.id
     *
     * @param id the value for od_saleafter.id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.order_id
     *
     * @return the value of od_saleafter.order_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.order_id
     *
     * @param orderId the value for od_saleafter.order_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.from_source
     *
     * @return the value of od_saleafter.from_source
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public Integer getFromSource() {
        return fromSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.from_source
     *
     * @param fromSource the value for od_saleafter.from_source
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setFromSource(Integer fromSource) {
        this.fromSource = fromSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.order_amount
     *
     * @return the value of od_saleafter.order_amount
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public Long getOrderAmount() {
        return orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.order_amount
     *
     * @param orderAmount the value for od_saleafter.order_amount
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.cost_amount
     *
     * @return the value of od_saleafter.cost_amount
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public Long getCostAmount() {
        return costAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.cost_amount
     *
     * @param costAmount the value for od_saleafter.cost_amount
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setCostAmount(Long costAmount) {
        this.costAmount = costAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.product_id
     *
     * @return the value of od_saleafter.product_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.product_id
     *
     * @param productId the value for od_saleafter.product_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.product_name
     *
     * @return the value of od_saleafter.product_name
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.product_name
     *
     * @param productName the value for od_saleafter.product_name
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.sku_num
     *
     * @return the value of od_saleafter.sku_num
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public String getSkuNum() {
        return skuNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.sku_num
     *
     * @param skuNum the value for od_saleafter.sku_num
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setSkuNum(String skuNum) {
        this.skuNum = skuNum == null ? null : skuNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.apply_time
     *
     * @return the value of od_saleafter.apply_time
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.apply_time
     *
     * @param applyTime the value for od_saleafter.apply_time
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.user_id
     *
     * @return the value of od_saleafter.user_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.user_id
     *
     * @param userId the value for od_saleafter.user_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.user_name
     *
     * @return the value of od_saleafter.user_name
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.user_name
     *
     * @param userName the value for od_saleafter.user_name
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.shop_id
     *
     * @return the value of od_saleafter.shop_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.shop_id
     *
     * @param shopId the value for od_saleafter.shop_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.shop_name
     *
     * @return the value of od_saleafter.shop_name
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.shop_name
     *
     * @param shopName the value for od_saleafter.shop_name
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.refund_type
     *
     * @return the value of od_saleafter.refund_type
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public Integer getRefundType() {
        return refundType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.refund_type
     *
     * @param refundType the value for od_saleafter.refund_type
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.refund_reason
     *
     * @return the value of od_saleafter.refund_reason
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.refund_reason
     *
     * @param refundReason the value for od_saleafter.refund_reason
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.saleafter_state
     *
     * @return the value of od_saleafter.saleafter_state
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public Integer getSaleafterState() {
        return saleafterState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.saleafter_state
     *
     * @param saleafterState the value for od_saleafter.saleafter_state
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setSaleafterState(Integer saleafterState) {
        this.saleafterState = saleafterState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.deal_time
     *
     * @return the value of od_saleafter.deal_time
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public Date getDealTime() {
        return dealTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.deal_time
     *
     * @param dealTime the value for od_saleafter.deal_time
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.complete_time
     *
     * @return the value of od_saleafter.complete_time
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public Date getCompleteTime() {
        return completeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.complete_time
     *
     * @param completeTime the value for od_saleafter.complete_time
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_saleafter.complain_id
     *
     * @return the value of od_saleafter.complain_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public Long getComplainId() {
        return complainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_saleafter.complain_id
     *
     * @param complainId the value for od_saleafter.complain_id
     *
     * @mbggenerated Thu May 19 15:44:35 CST 2016
     */
    public void setComplainId(Long complainId) {
        this.complainId = complainId;
    }
}