// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaijiCommonTypes.proto

package com.ctrip.soa;

public interface ErrorDataTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.soa.ErrorDataType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Message = 1;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string Message = 1;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>string ErrorCode = 2;</code>
   */
  java.lang.String getErrorCode();
  /**
   * <code>string ErrorCode = 2;</code>
   */
  com.google.protobuf.ByteString
      getErrorCodeBytes();

  /**
   * <code>string StackTrace = 3;</code>
   */
  java.lang.String getStackTrace();
  /**
   * <code>string StackTrace = 3;</code>
   */
  com.google.protobuf.ByteString
      getStackTraceBytes();

  /**
   * <code>.com.ctrip.soa.SeverityCodeType SeverityCode = 4;</code>
   */
  int getSeverityCodeValue();
  /**
   * <code>.com.ctrip.soa.SeverityCodeType SeverityCode = 4;</code>
   */
  com.ctrip.soa.SeverityCodeType getSeverityCode();

  /**
   * <code>repeated .com.ctrip.soa.ErrorFieldType ErrorFields = 5;</code>
   */
  java.util.List<com.ctrip.soa.ErrorFieldType> 
      getErrorFieldsList();
  /**
   * <code>repeated .com.ctrip.soa.ErrorFieldType ErrorFields = 5;</code>
   */
  com.ctrip.soa.ErrorFieldType getErrorFields(int index);
  /**
   * <code>repeated .com.ctrip.soa.ErrorFieldType ErrorFields = 5;</code>
   */
  int getErrorFieldsCount();
  /**
   * <code>repeated .com.ctrip.soa.ErrorFieldType ErrorFields = 5;</code>
   */
  java.util.List<? extends com.ctrip.soa.ErrorFieldTypeOrBuilder> 
      getErrorFieldsOrBuilderList();
  /**
   * <code>repeated .com.ctrip.soa.ErrorFieldType ErrorFields = 5;</code>
   */
  com.ctrip.soa.ErrorFieldTypeOrBuilder getErrorFieldsOrBuilder(
      int index);

  /**
   * <code>.com.ctrip.soa.ErrorClassificationCodeType ErrorClassification = 6;</code>
   */
  int getErrorClassificationValue();
  /**
   * <code>.com.ctrip.soa.ErrorClassificationCodeType ErrorClassification = 6;</code>
   */
  com.ctrip.soa.ErrorClassificationCodeType getErrorClassification();
}