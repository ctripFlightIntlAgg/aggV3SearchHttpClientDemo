// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

public interface AirportInfoTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.flighttypes.v3.AirportInfoType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * string Terminal = 1 ; 变化 航站楼和具体航班有关系，迁移到FlightType
   * </pre>
   *
   * <code>string PortCode = 1;</code>
   */
  java.lang.String getPortCode();
  /**
   * <pre>
   * string Terminal = 1 ; 变化 航站楼和具体航班有关系，迁移到FlightType
   * </pre>
   *
   * <code>string PortCode = 1;</code>
   */
  com.google.protobuf.ByteString
      getPortCodeBytes();

  /**
   * <code>string PortName = 2;</code>
   */
  java.lang.String getPortName();
  /**
   * <code>string PortName = 2;</code>
   */
  com.google.protobuf.ByteString
      getPortNameBytes();

  /**
   * <code>string PortNameGLB = 3;</code>
   */
  java.lang.String getPortNameGLB();
  /**
   * <code>string PortNameGLB = 3;</code>
   */
  com.google.protobuf.ByteString
      getPortNameGLBBytes();
}
