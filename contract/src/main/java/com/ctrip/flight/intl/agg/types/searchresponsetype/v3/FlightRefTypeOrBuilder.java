// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.types.searchresponsetype.v3.proto

package com.ctrip.flight.intl.agg.types.searchresponsetype.v3;

public interface FlightRefTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.types.searchresponsetype.v3.FlightRefType)
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
   * <code>int32 SegmentNo = 2;</code>
   */
  int getSegmentNo();

  /**
   * <code>int32 SequenceNo = 3;</code>
   */
  int getSequenceNo();

  /**
   * <code>string MarrySeg = 4;</code>
   */
  java.lang.String getMarrySeg();
  /**
   * <code>string MarrySeg = 4;</code>
   */
  com.google.protobuf.ByteString
      getMarrySegBytes();

  /**
   * <pre>
   *变化 int改为bool
   * </pre>
   *
   * <code>bool mainSegment = 5;</code>
   */
  boolean getMainSegment();
}
