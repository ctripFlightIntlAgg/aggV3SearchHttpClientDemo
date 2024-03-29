// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.additionproduct.v3.proto

package com.ctrip.flight.intl.agg.additionproduct.v3;

public interface ProductFeeDetailTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.intl.agg.additionproduct.v3.ProductFeeDetailType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 乘客类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.AgeType AgeType = 1;</code>
   */
  java.util.List<com.ctrip.flight.intl.agg.flighttypes.v3.AgeType> getAgeTypeList();
  /**
   * <pre>
   * 乘客类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.AgeType AgeType = 1;</code>
   */
  int getAgeTypeCount();
  /**
   * <pre>
   * 乘客类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.AgeType AgeType = 1;</code>
   */
  com.ctrip.flight.intl.agg.flighttypes.v3.AgeType getAgeType(int index);
  /**
   * <pre>
   * 乘客类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.AgeType AgeType = 1;</code>
   */
  java.util.List<java.lang.Integer>
  getAgeTypeValueList();
  /**
   * <pre>
   * 乘客类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.flighttypes.v3.AgeType AgeType = 1;</code>
   */
  int getAgeTypeValue(int index);

  /**
   * <pre>
   *营销金额
   * </pre>
   *
   * <code>double MarketingAmount = 2;</code>
   */
  double getMarketingAmount();

  /**
   * <pre>
   * 透传X前置接口的token
   * </pre>
   *
   * <code>string PolicyToken = 3;</code>
   */
  java.lang.String getPolicyToken();
  /**
   * <pre>
   * 透传X前置接口的token
   * </pre>
   *
   * <code>string PolicyToken = 3;</code>
   */
  com.google.protobuf.ByteString
      getPolicyTokenBytes();

  /**
   * <pre>
   * 服务包关联产品
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType ServicePackageRelatedProduct = 4;</code>
   */
  java.util.List<com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType> 
      getServicePackageRelatedProductList();
  /**
   * <pre>
   * 服务包关联产品
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType ServicePackageRelatedProduct = 4;</code>
   */
  com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType getServicePackageRelatedProduct(int index);
  /**
   * <pre>
   * 服务包关联产品
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType ServicePackageRelatedProduct = 4;</code>
   */
  int getServicePackageRelatedProductCount();
  /**
   * <pre>
   * 服务包关联产品
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType ServicePackageRelatedProduct = 4;</code>
   */
  java.util.List<? extends com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductTypeOrBuilder> 
      getServicePackageRelatedProductOrBuilderList();
  /**
   * <pre>
   * 服务包关联产品
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType ServicePackageRelatedProduct = 4;</code>
   */
  com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductTypeOrBuilder getServicePackageRelatedProductOrBuilder(
      int index);
}
