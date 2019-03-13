// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

public interface PriceDetailTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.flighttypes.v3.PriceDetailType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *变化 使用CNY表示人民币币种
   * </pre>
   *
   * <code>string Currency = 1;</code>
   */
  java.lang.String getCurrency();
  /**
   * <pre>
   *变化 使用CNY表示人民币币种
   * </pre>
   *
   * <code>string Currency = 1;</code>
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>double SalePrice = 2;</code>
   */
  double getSalePrice();

  /**
   * <code>double Tax = 3;</code>
   */
  double getTax();

  /**
   * <code>double PublishPrice = 4;</code>
   */
  double getPublishPrice();

  /**
   * <code>double AccountPrice = 5;</code>
   */
  double getAccountPrice();

  /**
   * <code>double NetPrice = 6;</code>
   */
  double getNetPrice();
}
