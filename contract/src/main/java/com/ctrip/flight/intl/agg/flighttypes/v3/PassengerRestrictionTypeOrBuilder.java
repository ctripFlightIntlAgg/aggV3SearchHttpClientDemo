// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

public interface PassengerRestrictionTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.flighttypes.v3.PassengerRestrictionType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 MinPassengerCount = 1;</code>
   */
  int getMinPassengerCount();

  /**
   * <code>int32 MaxPassengerCount = 2;</code>
   */
  int getMaxPassengerCount();

  /**
   * <code>string NationalityInclude = 3;</code>
   */
  java.lang.String getNationalityInclude();
  /**
   * <code>string NationalityInclude = 3;</code>
   */
  com.google.protobuf.ByteString
      getNationalityIncludeBytes();

  /**
   * <code>string NationalityExclude = 4;</code>
   */
  java.lang.String getNationalityExclude();
  /**
   * <code>string NationalityExclude = 4;</code>
   */
  com.google.protobuf.ByteString
      getNationalityExcludeBytes();

  /**
   * <code>int32 MaxAgeLimitition = 5;</code>
   */
  int getMaxAgeLimitition();

  /**
   * <code>int32 MinAgeLimitition = 6;</code>
   */
  int getMinAgeLimitition();
}
