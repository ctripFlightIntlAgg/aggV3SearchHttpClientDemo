// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

public interface BaggageTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.flighttypes.v3.BaggageType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string BaggageID = 1;</code>
   */
  java.lang.String getBaggageID();
  /**
   * <code>string BaggageID = 1;</code>
   */
  com.google.protobuf.ByteString
      getBaggageIDBytes();

  /**
   * <code>string BaggageCN = 2;</code>
   */
  java.lang.String getBaggageCN();
  /**
   * <code>string BaggageCN = 2;</code>
   */
  com.google.protobuf.ByteString
      getBaggageCNBytes();

  /**
   * <code>string BaggageGLB = 3;</code>
   */
  java.lang.String getBaggageGLB();
  /**
   * <code>string BaggageGLB = 3;</code>
   */
  com.google.protobuf.ByteString
      getBaggageGLBBytes();

  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.BaggageDetailType BaggageDetail = 4;</code>
   */
  java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.BaggageDetailType> 
      getBaggageDetailList();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.BaggageDetailType BaggageDetail = 4;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.BaggageDetailType getBaggageDetail(int index);
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.BaggageDetailType BaggageDetail = 4;</code>
   */
  int getBaggageDetailCount();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.BaggageDetailType BaggageDetail = 4;</code>
   */
  java.util.List<? extends com.ctrip.flight.intl.agg.flighttypes.v3.BaggageDetailTypeOrBuilder> 
      getBaggageDetailOrBuilderList();
  /**
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.BaggageDetailType BaggageDetail = 4;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.BaggageDetailTypeOrBuilder getBaggageDetailOrBuilder(
      int index);

  /**
   * <pre>
   * int32 Type = 6 ; 迁移到BaggageInfoType中
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.BaggageExtensionFiledsType ExtentionFileds = 5;</code>
   */
  boolean hasExtentionFileds();
  /**
   * <pre>
   * int32 Type = 6 ; 迁移到BaggageInfoType中
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.BaggageExtensionFiledsType ExtentionFileds = 5;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.BaggageExtensionFiledsType getExtentionFileds();
  /**
   * <pre>
   * int32 Type = 6 ; 迁移到BaggageInfoType中
   * </pre>
   *
   * <code>.com.ctrip.flight.intl.agg.flighttypes.v3.BaggageExtensionFiledsType ExtentionFileds = 5;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.BaggageExtensionFiledsTypeOrBuilder getExtentionFiledsOrBuilder();
}
