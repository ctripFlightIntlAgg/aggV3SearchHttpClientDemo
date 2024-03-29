// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

public interface FlightTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.flighttypes.v3.FlightType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string FlightID = 1;</code>
   */
  java.lang.String getFlightID();
  /**
   * <code>string FlightID = 1;</code>
   */
  com.google.protobuf.ByteString
      getFlightIDBytes();

  /**
   * <pre>
   *变化 AirlineInfoType
   * </pre>
   *
   * <code>string MarketingCarrierCode = 2;</code>
   */
  java.lang.String getMarketingCarrierCode();
  /**
   * <pre>
   *变化 AirlineInfoType
   * </pre>
   *
   * <code>string MarketingCarrierCode = 2;</code>
   */
  com.google.protobuf.ByteString
      getMarketingCarrierCodeBytes();

  /**
   * <code>string FlightNo = 3;</code>
   */
  java.lang.String getFlightNo();
  /**
   * <code>string FlightNo = 3;</code>
   */
  com.google.protobuf.ByteString
      getFlightNoBytes();

  /**
   * <pre>
   *变化 AirlineInfoType
   * </pre>
   *
   * <code>string OperatingCarrierCode = 4;</code>
   */
  java.lang.String getOperatingCarrierCode();
  /**
   * <pre>
   *变化 AirlineInfoType
   * </pre>
   *
   * <code>string OperatingCarrierCode = 4;</code>
   */
  com.google.protobuf.ByteString
      getOperatingCarrierCodeBytes();

  /**
   * <code>string OperatingFlightNo = 5;</code>
   */
  java.lang.String getOperatingFlightNo();
  /**
   * <code>string OperatingFlightNo = 5;</code>
   */
  com.google.protobuf.ByteString
      getOperatingFlightNoBytes();

  /**
   * <pre>
   *变化 string CityInfoType
   * </pre>
   *
   * <code>string DepartureCityCode = 6;</code>
   */
  java.lang.String getDepartureCityCode();
  /**
   * <pre>
   *变化 string CityInfoType
   * </pre>
   *
   * <code>string DepartureCityCode = 6;</code>
   */
  com.google.protobuf.ByteString
      getDepartureCityCodeBytes();

  /**
   * <pre>
   *变化 string CityInfoType
   * </pre>
   *
   * <code>string ArrivalCityCode = 7;</code>
   */
  java.lang.String getArrivalCityCode();
  /**
   * <pre>
   *变化 string CityInfoType
   * </pre>
   *
   * <code>string ArrivalCityCode = 7;</code>
   */
  com.google.protobuf.ByteString
      getArrivalCityCodeBytes();

  /**
   * <pre>
   *变化 AirportInfoType
   * </pre>
   *
   * <code>string DepartureAirportCode = 8;</code>
   */
  java.lang.String getDepartureAirportCode();
  /**
   * <pre>
   *变化 AirportInfoType
   * </pre>
   *
   * <code>string DepartureAirportCode = 8;</code>
   */
  com.google.protobuf.ByteString
      getDepartureAirportCodeBytes();

  /**
   * <pre>
   *变化 AirportInfoType
   * </pre>
   *
   * <code>string ArrivalAirportCode = 9;</code>
   */
  java.lang.String getArrivalAirportCode();
  /**
   * <pre>
   *变化 AirportInfoType
   * </pre>
   *
   * <code>string ArrivalAirportCode = 9;</code>
   */
  com.google.protobuf.ByteString
      getArrivalAirportCodeBytes();

  /**
   * <pre>
   * 变化 从AirportInfoType迁移过来
   * </pre>
   *
   * <code>string DepartureTerminal = 10;</code>
   */
  java.lang.String getDepartureTerminal();
  /**
   * <pre>
   * 变化 从AirportInfoType迁移过来
   * </pre>
   *
   * <code>string DepartureTerminal = 10;</code>
   */
  com.google.protobuf.ByteString
      getDepartureTerminalBytes();

  /**
   * <pre>
   * 变化 从AirportInfoType迁移过来
   * </pre>
   *
   * <code>string ArrivalTerminal = 11;</code>
   */
  java.lang.String getArrivalTerminal();
  /**
   * <pre>
   * 变化 从AirportInfoType迁移过来
   * </pre>
   *
   * <code>string ArrivalTerminal = 11;</code>
   */
  com.google.protobuf.ByteString
      getArrivalTerminalBytes();

  /**
   * <code>string TakeoffDateTime = 12;</code>
   */
  java.lang.String getTakeoffDateTime();
  /**
   * <code>string TakeoffDateTime = 12;</code>
   */
  com.google.protobuf.ByteString
      getTakeoffDateTimeBytes();

  /**
   * <code>string ArrivalDateTime = 13;</code>
   */
  java.lang.String getArrivalDateTime();
  /**
   * <code>string ArrivalDateTime = 13;</code>
   */
  com.google.protobuf.ByteString
      getArrivalDateTimeBytes();

  /**
   * <code>string EquipmentCode = 14;</code>
   */
  java.lang.String getEquipmentCode();
  /**
   * <code>string EquipmentCode = 14;</code>
   */
  com.google.protobuf.ByteString
      getEquipmentCodeBytes();

  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.StopType Stop = 15;</code>
   */
  java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.StopType> 
      getStopList();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.StopType Stop = 15;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.StopType getStop(int index);
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.StopType Stop = 15;</code>
   */
  int getStopCount();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.StopType Stop = 15;</code>
   */
  java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.StopTypeOrBuilder> 
      getStopOrBuilderList();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.StopType Stop = 15;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.StopTypeOrBuilder getStopOrBuilder(
      int index);

  /**
   * <code>int32 Duration = 16;</code>
   */
  int getDuration();

  /**
   * <code>int32 ArrivalDays = 17;</code>
   */
  int getArrivalDays();

  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType Tag = 18;</code>
   */
  java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType> 
      getTagList();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType Tag = 18;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType getTag(int index);
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType Tag = 18;</code>
   */
  int getTagCount();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType Tag = 18;</code>
   */
  java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder> 
      getTagOrBuilderList();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType Tag = 18;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder getTagOrBuilder(
      int index);

  /**
   * <pre>
   *交通工具类型：0-飞机，1-火车，2-汽车，3-水上飞机
   * </pre>
   *
   * <code>int32 TransportType = 19;</code>
   */
  int getTransportType();

  /**
   * <pre>
   *虚拟航班供应商
   * </pre>
   *
   * <code>string Supplier = 20;</code>
   */
  java.lang.String getSupplier();
  /**
   * <pre>
   *虚拟航班供应商
   * </pre>
   *
   * <code>string Supplier = 20;</code>
   */
  com.google.protobuf.ByteString
      getSupplierBytes();

  /**
   * <pre>
   *ExtendFields
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ExtendFields = 21;</code>
   */
  java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType> 
      getExtendFieldsList();
  /**
   * <pre>
   *ExtendFields
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ExtendFields = 21;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType getExtendFields(int index);
  /**
   * <pre>
   *ExtendFields
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ExtendFields = 21;</code>
   */
  int getExtendFieldsCount();
  /**
   * <pre>
   *ExtendFields
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ExtendFields = 21;</code>
   */
  java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder> 
      getExtendFieldsOrBuilderList();
  /**
   * <pre>
   *ExtendFields
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairType ExtendFields = 21;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.KeyValuePairTypeOrBuilder getExtendFieldsOrBuilder(
      int index);
}
