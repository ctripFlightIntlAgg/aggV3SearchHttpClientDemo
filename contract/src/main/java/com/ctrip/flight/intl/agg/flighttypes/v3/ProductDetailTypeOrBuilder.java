// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

public interface ProductDetailTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.flighttypes.v3.ProductDetailType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string BookingChannel = 1;</code>
   */
  java.lang.String getBookingChannel();
  /**
   * <code>string BookingChannel = 1;</code>
   */
  com.google.protobuf.ByteString
      getBookingChannelBytes();

  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PriceInfoType PriceInfo = 2;</code>
   */
  java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.PriceInfoType> 
      getPriceInfoList();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PriceInfoType PriceInfo = 2;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.PriceInfoType getPriceInfo(int index);
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PriceInfoType PriceInfo = 2;</code>
   */
  int getPriceInfoCount();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PriceInfoType PriceInfo = 2;</code>
   */
  java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.PriceInfoTypeOrBuilder> 
      getPriceInfoOrBuilderList();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.PriceInfoType PriceInfo = 2;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.PriceInfoTypeOrBuilder getPriceInfoOrBuilder(
      int index);

  /**
   * <pre>
   * string ValidatingCarrierName = 4 ; // 根据ValidatingCarrier从airline ref中取得，删除
   * </pre>
   *
   * <code>string ValidatingCarrier = 3;</code>
   */
  java.lang.String getValidatingCarrier();
  /**
   * <pre>
   * string ValidatingCarrierName = 4 ; // 根据ValidatingCarrier从airline ref中取得，删除
   * </pre>
   *
   * <code>string ValidatingCarrier = 3;</code>
   */
  com.google.protobuf.ByteString
      getValidatingCarrierBytes();

  /**
   * <pre>
   *None = 0;
   *Exclusive = 1;
   *Cloud = 2;
   *Prioritizing = 4;
   *LowestPrice = 8;
   *FlagShipStore = 16;
   * </pre>
   *
   * <code>int32 ProductCategory = 5;</code>
   */
  int getProductCategory();

  /**
   * <pre>
   *None = 0;
   *Platforms = 1;
   *PlatformsPrivate = 2;
   *OverseasPrivate = 3;
   *Overseas = 4;
   *Owner = 5;
   *Pseat = 6;
   *RTSeat = 7;
   *CSD = 8;
   *CSDPrivate = 9;
   *Airline = 10;
   *LowestPrice = 11;
   *KWPrivate = 12;
   *CSDPublish = 13;
   *OSeat = 14;
   * </pre>
   *
   * <code>int32 SubProductCategory = 6;</code>
   */
  int getSubProductCategory();

  /**
   * <code>string InvoiceType = 7;</code>
   */
  java.lang.String getInvoiceType();
  /**
   * <code>string InvoiceType = 7;</code>
   */
  com.google.protobuf.ByteString
      getInvoiceTypeBytes();

  /**
   * <code>string PenaltiesKey = 8;</code>
   */
  java.lang.String getPenaltiesKey();
  /**
   * <code>string PenaltiesKey = 8;</code>
   */
  com.google.protobuf.ByteString
      getPenaltiesKeyBytes();

  /**
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.PriceUnitType PriceUnit = 10;</code>
   */
  boolean hasPriceUnit();
  /**
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.PriceUnitType PriceUnit = 10;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.PriceUnitType getPriceUnit();
  /**
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.PriceUnitType PriceUnit = 10;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.PriceUnitTypeOrBuilder getPriceUnitOrBuilder();

  /**
   * <pre>
   * 变化 从PriceType中移动过来
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType PenaltyRules = 11;</code>
   */
  boolean hasPenaltyRules();
  /**
   * <pre>
   * 变化 从PriceType中移动过来
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType PenaltyRules = 11;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType getPenaltyRules();
  /**
   * <pre>
   * 变化 从PriceType中移动过来
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesType PenaltyRules = 11;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.PenaltyRulesTypeOrBuilder getPenaltyRulesOrBuilder();

  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType Tag = 12;</code>
   */
  java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType> 
      getTagList();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType Tag = 12;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType getTag(int index);
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType Tag = 12;</code>
   */
  int getTagCount();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType Tag = 12;</code>
   */
  java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder> 
      getTagOrBuilderList();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType Tag = 12;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder getTagOrBuilder(
      int index);

  /**
   * <code>int32 CacheInfoID = 13;</code>
   */
  int getCacheInfoID();

  /**
   * <pre>
   * 限制
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.RestrictionType Restriction = 14;</code>
   */
  boolean hasRestriction();
  /**
   * <pre>
   * 限制
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.RestrictionType Restriction = 14;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.RestrictionType getRestriction();
  /**
   * <pre>
   * 限制
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.RestrictionType Restriction = 14;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.RestrictionTypeOrBuilder getRestrictionOrBuilder();

  /**
   * <pre>
   *ExtendFields
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ExtendFields = 15;</code>
   */
  java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType> 
      getExtendFieldsList();
  /**
   * <pre>
   *ExtendFields
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ExtendFields = 15;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType getExtendFields(int index);
  /**
   * <pre>
   *ExtendFields
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ExtendFields = 15;</code>
   */
  int getExtendFieldsCount();
  /**
   * <pre>
   *ExtendFields
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ExtendFields = 15;</code>
   */
  java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder> 
      getExtendFieldsOrBuilderList();
  /**
   * <pre>
   *ExtendFields
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ExtendFields = 15;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder getExtendFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * 无证件标识 0:不支持无证件 1:支持无证件
   * </pre>
   *
   * <code>int32 NoIdentityCardInd = 16;</code>
   */
  int getNoIdentityCardInd();

  /**
   * <pre>
   * 供应商资质信息
   * </pre>
   *
   * <code>string AgencyLicenseUrl = 17;</code>
   */
  java.lang.String getAgencyLicenseUrl();
  /**
   * <pre>
   * 供应商资质信息
   * </pre>
   *
   * <code>string AgencyLicenseUrl = 17;</code>
   */
  com.google.protobuf.ByteString
      getAgencyLicenseUrlBytes();
}
