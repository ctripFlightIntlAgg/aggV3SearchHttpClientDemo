// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

public interface CityInfoTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 CityID = 1;</code>
   */
  int getCityID();

  /**
   * <code>string CityCode = 2;</code>
   */
  java.lang.String getCityCode();
  /**
   * <code>string CityCode = 2;</code>
   */
  com.google.protobuf.ByteString
      getCityCodeBytes();

  /**
   * <code>string CityName = 3;</code>
   */
  java.lang.String getCityName();
  /**
   * <code>string CityName = 3;</code>
   */
  com.google.protobuf.ByteString
      getCityNameBytes();

  /**
   * <code>string CityNameGLB = 4;</code>
   */
  java.lang.String getCityNameGLB();
  /**
   * <code>string CityNameGLB = 4;</code>
   */
  com.google.protobuf.ByteString
      getCityNameGLBBytes();

  /**
   * <code>int32 ProvinceID = 5;</code>
   */
  int getProvinceID();

  /**
   * <code>int32 CountryID = 6;</code>
   */
  int getCountryID();

  /**
   * <code>string CountryName = 7;</code>
   */
  java.lang.String getCountryName();
  /**
   * <code>string CountryName = 7;</code>
   */
  com.google.protobuf.ByteString
      getCountryNameBytes();

  /**
   * <code>string CountryNameGLB = 8;</code>
   */
  java.lang.String getCountryNameGLB();
  /**
   * <code>string CountryNameGLB = 8;</code>
   */
  com.google.protobuf.ByteString
      getCountryNameGLBBytes();

  /**
   * <code>bool IsDomestic = 9;</code>
   */
  boolean getIsDomestic();
}
