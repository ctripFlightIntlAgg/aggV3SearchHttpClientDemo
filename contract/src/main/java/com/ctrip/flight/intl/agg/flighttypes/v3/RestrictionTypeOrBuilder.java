// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

public interface RestrictionTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.flighttypes.v3.RestrictionType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 使用本地证件预订票的语言
   * </pre>
   *
   * <code>repeated string LanguageOfGovernmentIssuedPhotoId = 1;</code>
   */
  java.util.List<java.lang.String>
      getLanguageOfGovernmentIssuedPhotoIdList();
  /**
   * <pre>
   * 使用本地证件预订票的语言
   * </pre>
   *
   * <code>repeated string LanguageOfGovernmentIssuedPhotoId = 1;</code>
   */
  int getLanguageOfGovernmentIssuedPhotoIdCount();
  /**
   * <pre>
   * 使用本地证件预订票的语言
   * </pre>
   *
   * <code>repeated string LanguageOfGovernmentIssuedPhotoId = 1;</code>
   */
  java.lang.String getLanguageOfGovernmentIssuedPhotoId(int index);
  /**
   * <pre>
   * 使用本地证件预订票的语言
   * </pre>
   *
   * <code>repeated string LanguageOfGovernmentIssuedPhotoId = 1;</code>
   */
  com.google.protobuf.ByteString
      getLanguageOfGovernmentIssuedPhotoIdBytes(int index);

  /**
   * <pre>
   * 限制客人使用自身信用卡支付的信息
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.PaymentAgencyModelInfoType PaymentAgencyModelInfo = 2;</code>
   */
  boolean hasPaymentAgencyModelInfo();
  /**
   * <pre>
   * 限制客人使用自身信用卡支付的信息
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.PaymentAgencyModelInfoType PaymentAgencyModelInfo = 2;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.PaymentAgencyModelInfoType getPaymentAgencyModelInfo();
  /**
   * <pre>
   * 限制客人使用自身信用卡支付的信息
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.PaymentAgencyModelInfoType PaymentAgencyModelInfo = 2;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.PaymentAgencyModelInfoTypeOrBuilder getPaymentAgencyModelInfoOrBuilder();

  /**
   * <pre>
   * 票维度的人数范围限制(婴儿不算人头)
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.IntRangeType PassengerCountRange = 3;</code>
   */
  boolean hasPassengerCountRange();
  /**
   * <pre>
   * 票维度的人数范围限制(婴儿不算人头)
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.IntRangeType PassengerCountRange = 3;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.IntRangeType getPassengerCountRange();
  /**
   * <pre>
   * 票维度的人数范围限制(婴儿不算人头)
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.IntRangeType PassengerCountRange = 3;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.IntRangeTypeOrBuilder getPassengerCountRangeOrBuilder();
}
