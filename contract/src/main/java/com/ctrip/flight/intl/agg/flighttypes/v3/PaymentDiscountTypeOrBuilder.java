// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

public interface PaymentDiscountTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.flighttypes.v3.PaymentDiscountType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * id
   * </pre>
   *
   * <code>int32 PaymentDiscountID = 1;</code>
   */
  int getPaymentDiscountID();

  /**
   * <pre>
   * 让利总费用=所有乘客让利之和
   * </pre>
   *
   * <code>double DiscountTotalFee = 2;</code>
   */
  double getDiscountTotalFee();

  /**
   * <pre>
   * 币种
   * </pre>
   *
   * <code>string Currency = 3;</code>
   */
  java.lang.String getCurrency();
  /**
   * <pre>
   * 币种
   * </pre>
   *
   * <code>string Currency = 3;</code>
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <pre>
   * 让利支付方式
   * </pre>
   *
   * <code>int32 DiscountSettle = 4;</code>
   */
  int getDiscountSettle();

  /**
   * <pre>
   * 发卡行(空表示不限)
   * </pre>
   *
   * <code>string BankCode = 5;</code>
   */
  java.lang.String getBankCode();
  /**
   * <pre>
   * 发卡行(空表示不限)
   * </pre>
   *
   * <code>string BankCode = 5;</code>
   */
  com.google.protobuf.ByteString
      getBankCodeBytes();

  /**
   * <pre>
   * 让利卡等级(空表示不限)
   * </pre>
   *
   * <code>string CardLevel = 6;</code>
   */
  java.lang.String getCardLevel();
  /**
   * <pre>
   * 让利卡等级(空表示不限)
   * </pre>
   *
   * <code>string CardLevel = 6;</code>
   */
  com.google.protobuf.ByteString
      getCardLevelBytes();

  /**
   * <pre>
   * 让利明细
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.DiscountDetailType DiscountDetail = 7;</code>
   */
  java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.DiscountDetailType> 
      getDiscountDetailList();
  /**
   * <pre>
   * 让利明细
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.DiscountDetailType DiscountDetail = 7;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.DiscountDetailType getDiscountDetail(int index);
  /**
   * <pre>
   * 让利明细
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.DiscountDetailType DiscountDetail = 7;</code>
   */
  int getDiscountDetailCount();
  /**
   * <pre>
   * 让利明细
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.DiscountDetailType DiscountDetail = 7;</code>
   */
  java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.DiscountDetailTypeOrBuilder> 
      getDiscountDetailOrBuilderList();
  /**
   * <pre>
   * 让利明细
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.DiscountDetailType DiscountDetail = 7;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.DiscountDetailTypeOrBuilder getDiscountDetailOrBuilder(
      int index);
}