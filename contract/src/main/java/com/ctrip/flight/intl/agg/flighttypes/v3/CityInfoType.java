// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

/**
 * Protobuf type {@code com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType}
 */
public  final class CityInfoType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType)
    CityInfoTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CityInfoType.newBuilder() to construct.
  private CityInfoType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CityInfoType() {
    cityID_ = 0;
    cityCode_ = "";
    cityName_ = "";
    cityNameGLB_ = "";
    provinceID_ = 0;
    countryID_ = 0;
    countryName_ = "";
    countryNameGLB_ = "";
    isDomestic_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CityInfoType(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            cityID_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            cityCode_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            cityName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            cityNameGLB_ = s;
            break;
          }
          case 40: {

            provinceID_ = input.readInt32();
            break;
          }
          case 48: {

            countryID_ = input.readInt32();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            countryName_ = s;
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            countryNameGLB_ = s;
            break;
          }
          case 72: {

            isDomestic_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_CityInfoType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_CityInfoType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType.class, com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType.Builder.class);
  }

  public static final int CITYID_FIELD_NUMBER = 1;
  private int cityID_;
  /**
   * <code>int32 CityID = 1;</code>
   */
  public int getCityID() {
    return cityID_;
  }

  public static final int CITYCODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object cityCode_;
  /**
   * <code>string CityCode = 2;</code>
   */
  public java.lang.String getCityCode() {
    java.lang.Object ref = cityCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cityCode_ = s;
      return s;
    }
  }
  /**
   * <code>string CityCode = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCityCodeBytes() {
    java.lang.Object ref = cityCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cityCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CITYNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object cityName_;
  /**
   * <code>string CityName = 3;</code>
   */
  public java.lang.String getCityName() {
    java.lang.Object ref = cityName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cityName_ = s;
      return s;
    }
  }
  /**
   * <code>string CityName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCityNameBytes() {
    java.lang.Object ref = cityName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cityName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CITYNAMEGLB_FIELD_NUMBER = 4;
  private volatile java.lang.Object cityNameGLB_;
  /**
   * <code>string CityNameGLB = 4;</code>
   */
  public java.lang.String getCityNameGLB() {
    java.lang.Object ref = cityNameGLB_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cityNameGLB_ = s;
      return s;
    }
  }
  /**
   * <code>string CityNameGLB = 4;</code>
   */
  public com.google.protobuf.ByteString
      getCityNameGLBBytes() {
    java.lang.Object ref = cityNameGLB_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cityNameGLB_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROVINCEID_FIELD_NUMBER = 5;
  private int provinceID_;
  /**
   * <code>int32 ProvinceID = 5;</code>
   */
  public int getProvinceID() {
    return provinceID_;
  }

  public static final int COUNTRYID_FIELD_NUMBER = 6;
  private int countryID_;
  /**
   * <code>int32 CountryID = 6;</code>
   */
  public int getCountryID() {
    return countryID_;
  }

  public static final int COUNTRYNAME_FIELD_NUMBER = 7;
  private volatile java.lang.Object countryName_;
  /**
   * <code>string CountryName = 7;</code>
   */
  public java.lang.String getCountryName() {
    java.lang.Object ref = countryName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      countryName_ = s;
      return s;
    }
  }
  /**
   * <code>string CountryName = 7;</code>
   */
  public com.google.protobuf.ByteString
      getCountryNameBytes() {
    java.lang.Object ref = countryName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      countryName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNTRYNAMEGLB_FIELD_NUMBER = 8;
  private volatile java.lang.Object countryNameGLB_;
  /**
   * <code>string CountryNameGLB = 8;</code>
   */
  public java.lang.String getCountryNameGLB() {
    java.lang.Object ref = countryNameGLB_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      countryNameGLB_ = s;
      return s;
    }
  }
  /**
   * <code>string CountryNameGLB = 8;</code>
   */
  public com.google.protobuf.ByteString
      getCountryNameGLBBytes() {
    java.lang.Object ref = countryNameGLB_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      countryNameGLB_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISDOMESTIC_FIELD_NUMBER = 9;
  private boolean isDomestic_;
  /**
   * <code>bool IsDomestic = 9;</code>
   */
  public boolean getIsDomestic() {
    return isDomestic_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (cityID_ != 0) {
      output.writeInt32(1, cityID_);
    }
    if (!getCityCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cityCode_);
    }
    if (!getCityNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cityName_);
    }
    if (!getCityNameGLBBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, cityNameGLB_);
    }
    if (provinceID_ != 0) {
      output.writeInt32(5, provinceID_);
    }
    if (countryID_ != 0) {
      output.writeInt32(6, countryID_);
    }
    if (!getCountryNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, countryName_);
    }
    if (!getCountryNameGLBBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, countryNameGLB_);
    }
    if (isDomestic_ != false) {
      output.writeBool(9, isDomestic_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cityID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, cityID_);
    }
    if (!getCityCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cityCode_);
    }
    if (!getCityNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cityName_);
    }
    if (!getCityNameGLBBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, cityNameGLB_);
    }
    if (provinceID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, provinceID_);
    }
    if (countryID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, countryID_);
    }
    if (!getCountryNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, countryName_);
    }
    if (!getCountryNameGLBBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, countryNameGLB_);
    }
    if (isDomestic_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, isDomestic_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType other = (com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType) obj;

    boolean result = true;
    result = result && (getCityID()
        == other.getCityID());
    result = result && getCityCode()
        .equals(other.getCityCode());
    result = result && getCityName()
        .equals(other.getCityName());
    result = result && getCityNameGLB()
        .equals(other.getCityNameGLB());
    result = result && (getProvinceID()
        == other.getProvinceID());
    result = result && (getCountryID()
        == other.getCountryID());
    result = result && getCountryName()
        .equals(other.getCountryName());
    result = result && getCountryNameGLB()
        .equals(other.getCountryNameGLB());
    result = result && (getIsDomestic()
        == other.getIsDomestic());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CITYID_FIELD_NUMBER;
    hash = (53 * hash) + getCityID();
    hash = (37 * hash) + CITYCODE_FIELD_NUMBER;
    hash = (53 * hash) + getCityCode().hashCode();
    hash = (37 * hash) + CITYNAME_FIELD_NUMBER;
    hash = (53 * hash) + getCityName().hashCode();
    hash = (37 * hash) + CITYNAMEGLB_FIELD_NUMBER;
    hash = (53 * hash) + getCityNameGLB().hashCode();
    hash = (37 * hash) + PROVINCEID_FIELD_NUMBER;
    hash = (53 * hash) + getProvinceID();
    hash = (37 * hash) + COUNTRYID_FIELD_NUMBER;
    hash = (53 * hash) + getCountryID();
    hash = (37 * hash) + COUNTRYNAME_FIELD_NUMBER;
    hash = (53 * hash) + getCountryName().hashCode();
    hash = (37 * hash) + COUNTRYNAMEGLB_FIELD_NUMBER;
    hash = (53 * hash) + getCountryNameGLB().hashCode();
    hash = (37 * hash) + ISDOMESTIC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsDomestic());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType)
      com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_CityInfoType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_CityInfoType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType.class, com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType.Builder.class);
    }

    // Construct using com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      cityID_ = 0;

      cityCode_ = "";

      cityName_ = "";

      cityNameGLB_ = "";

      provinceID_ = 0;

      countryID_ = 0;

      countryName_ = "";

      countryNameGLB_ = "";

      isDomestic_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_CityInfoType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType getDefaultInstanceForType() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType build() {
      com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType buildPartial() {
      com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType result = new com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType(this);
      result.cityID_ = cityID_;
      result.cityCode_ = cityCode_;
      result.cityName_ = cityName_;
      result.cityNameGLB_ = cityNameGLB_;
      result.provinceID_ = provinceID_;
      result.countryID_ = countryID_;
      result.countryName_ = countryName_;
      result.countryNameGLB_ = countryNameGLB_;
      result.isDomestic_ = isDomestic_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType) {
        return mergeFrom((com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType other) {
      if (other == com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType.getDefaultInstance()) return this;
      if (other.getCityID() != 0) {
        setCityID(other.getCityID());
      }
      if (!other.getCityCode().isEmpty()) {
        cityCode_ = other.cityCode_;
        onChanged();
      }
      if (!other.getCityName().isEmpty()) {
        cityName_ = other.cityName_;
        onChanged();
      }
      if (!other.getCityNameGLB().isEmpty()) {
        cityNameGLB_ = other.cityNameGLB_;
        onChanged();
      }
      if (other.getProvinceID() != 0) {
        setProvinceID(other.getProvinceID());
      }
      if (other.getCountryID() != 0) {
        setCountryID(other.getCountryID());
      }
      if (!other.getCountryName().isEmpty()) {
        countryName_ = other.countryName_;
        onChanged();
      }
      if (!other.getCountryNameGLB().isEmpty()) {
        countryNameGLB_ = other.countryNameGLB_;
        onChanged();
      }
      if (other.getIsDomestic() != false) {
        setIsDomestic(other.getIsDomestic());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int cityID_ ;
    /**
     * <code>int32 CityID = 1;</code>
     */
    public int getCityID() {
      return cityID_;
    }
    /**
     * <code>int32 CityID = 1;</code>
     */
    public Builder setCityID(int value) {
      
      cityID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 CityID = 1;</code>
     */
    public Builder clearCityID() {
      
      cityID_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object cityCode_ = "";
    /**
     * <code>string CityCode = 2;</code>
     */
    public java.lang.String getCityCode() {
      java.lang.Object ref = cityCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cityCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CityCode = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCityCodeBytes() {
      java.lang.Object ref = cityCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cityCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CityCode = 2;</code>
     */
    public Builder setCityCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cityCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CityCode = 2;</code>
     */
    public Builder clearCityCode() {
      
      cityCode_ = getDefaultInstance().getCityCode();
      onChanged();
      return this;
    }
    /**
     * <code>string CityCode = 2;</code>
     */
    public Builder setCityCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cityCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cityName_ = "";
    /**
     * <code>string CityName = 3;</code>
     */
    public java.lang.String getCityName() {
      java.lang.Object ref = cityName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cityName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CityName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCityNameBytes() {
      java.lang.Object ref = cityName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cityName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CityName = 3;</code>
     */
    public Builder setCityName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cityName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CityName = 3;</code>
     */
    public Builder clearCityName() {
      
      cityName_ = getDefaultInstance().getCityName();
      onChanged();
      return this;
    }
    /**
     * <code>string CityName = 3;</code>
     */
    public Builder setCityNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cityName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cityNameGLB_ = "";
    /**
     * <code>string CityNameGLB = 4;</code>
     */
    public java.lang.String getCityNameGLB() {
      java.lang.Object ref = cityNameGLB_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cityNameGLB_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CityNameGLB = 4;</code>
     */
    public com.google.protobuf.ByteString
        getCityNameGLBBytes() {
      java.lang.Object ref = cityNameGLB_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cityNameGLB_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CityNameGLB = 4;</code>
     */
    public Builder setCityNameGLB(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cityNameGLB_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CityNameGLB = 4;</code>
     */
    public Builder clearCityNameGLB() {
      
      cityNameGLB_ = getDefaultInstance().getCityNameGLB();
      onChanged();
      return this;
    }
    /**
     * <code>string CityNameGLB = 4;</code>
     */
    public Builder setCityNameGLBBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cityNameGLB_ = value;
      onChanged();
      return this;
    }

    private int provinceID_ ;
    /**
     * <code>int32 ProvinceID = 5;</code>
     */
    public int getProvinceID() {
      return provinceID_;
    }
    /**
     * <code>int32 ProvinceID = 5;</code>
     */
    public Builder setProvinceID(int value) {
      
      provinceID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ProvinceID = 5;</code>
     */
    public Builder clearProvinceID() {
      
      provinceID_ = 0;
      onChanged();
      return this;
    }

    private int countryID_ ;
    /**
     * <code>int32 CountryID = 6;</code>
     */
    public int getCountryID() {
      return countryID_;
    }
    /**
     * <code>int32 CountryID = 6;</code>
     */
    public Builder setCountryID(int value) {
      
      countryID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 CountryID = 6;</code>
     */
    public Builder clearCountryID() {
      
      countryID_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object countryName_ = "";
    /**
     * <code>string CountryName = 7;</code>
     */
    public java.lang.String getCountryName() {
      java.lang.Object ref = countryName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        countryName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CountryName = 7;</code>
     */
    public com.google.protobuf.ByteString
        getCountryNameBytes() {
      java.lang.Object ref = countryName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        countryName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CountryName = 7;</code>
     */
    public Builder setCountryName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      countryName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CountryName = 7;</code>
     */
    public Builder clearCountryName() {
      
      countryName_ = getDefaultInstance().getCountryName();
      onChanged();
      return this;
    }
    /**
     * <code>string CountryName = 7;</code>
     */
    public Builder setCountryNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      countryName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object countryNameGLB_ = "";
    /**
     * <code>string CountryNameGLB = 8;</code>
     */
    public java.lang.String getCountryNameGLB() {
      java.lang.Object ref = countryNameGLB_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        countryNameGLB_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CountryNameGLB = 8;</code>
     */
    public com.google.protobuf.ByteString
        getCountryNameGLBBytes() {
      java.lang.Object ref = countryNameGLB_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        countryNameGLB_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CountryNameGLB = 8;</code>
     */
    public Builder setCountryNameGLB(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      countryNameGLB_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CountryNameGLB = 8;</code>
     */
    public Builder clearCountryNameGLB() {
      
      countryNameGLB_ = getDefaultInstance().getCountryNameGLB();
      onChanged();
      return this;
    }
    /**
     * <code>string CountryNameGLB = 8;</code>
     */
    public Builder setCountryNameGLBBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      countryNameGLB_ = value;
      onChanged();
      return this;
    }

    private boolean isDomestic_ ;
    /**
     * <code>bool IsDomestic = 9;</code>
     */
    public boolean getIsDomestic() {
      return isDomestic_;
    }
    /**
     * <code>bool IsDomestic = 9;</code>
     */
    public Builder setIsDomestic(boolean value) {
      
      isDomestic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool IsDomestic = 9;</code>
     */
    public Builder clearIsDomestic() {
      
      isDomestic_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType)
  private static final com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType();
  }

  public static com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CityInfoType>
      PARSER = new com.google.protobuf.AbstractParser<CityInfoType>() {
    @java.lang.Override
    public CityInfoType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CityInfoType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CityInfoType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CityInfoType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.intl.agg.flighttypes.v3.CityInfoType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

