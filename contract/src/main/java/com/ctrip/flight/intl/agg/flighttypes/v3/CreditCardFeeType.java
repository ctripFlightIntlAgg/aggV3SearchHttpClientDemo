// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

/**
 * Protobuf type {@code com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType}
 */
public  final class CreditCardFeeType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType)
    CreditCardFeeTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreditCardFeeType.newBuilder() to construct.
  private CreditCardFeeType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreditCardFeeType() {
    creditCardType_ = "";
    amount_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreditCardFeeType(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            creditCardType_ = s;
            break;
          }
          case 17: {

            amount_ = input.readDouble();
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
    return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_CreditCardFeeType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_CreditCardFeeType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType.class, com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType.Builder.class);
  }

  public static final int CREDITCARDTYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object creditCardType_;
  /**
   * <pre>
   * 卡组织
   * </pre>
   *
   * <code>string CreditCardType = 1;</code>
   */
  public java.lang.String getCreditCardType() {
    java.lang.Object ref = creditCardType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      creditCardType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 卡组织
   * </pre>
   *
   * <code>string CreditCardType = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCreditCardTypeBytes() {
    java.lang.Object ref = creditCardType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      creditCardType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private double amount_;
  /**
   * <pre>
   * 销售币种加价
   * </pre>
   *
   * <code>double Amount = 2;</code>
   */
  public double getAmount() {
    return amount_;
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
    if (!getCreditCardTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, creditCardType_);
    }
    if (amount_ != 0D) {
      output.writeDouble(2, amount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCreditCardTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, creditCardType_);
    }
    if (amount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, amount_);
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
    if (!(obj instanceof com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType other = (com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType) obj;

    boolean result = true;
    result = result && getCreditCardType()
        .equals(other.getCreditCardType());
    result = result && (
        java.lang.Double.doubleToLongBits(getAmount())
        == java.lang.Double.doubleToLongBits(
            other.getAmount()));
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
    hash = (37 * hash) + CREDITCARDTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getCreditCardType().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAmount()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType)
      com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_CreditCardFeeType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_CreditCardFeeType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType.class, com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType.Builder.class);
    }

    // Construct using com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType.newBuilder()
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
      creditCardType_ = "";

      amount_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_CreditCardFeeType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType getDefaultInstanceForType() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType build() {
      com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType buildPartial() {
      com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType result = new com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType(this);
      result.creditCardType_ = creditCardType_;
      result.amount_ = amount_;
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
      if (other instanceof com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType) {
        return mergeFrom((com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType other) {
      if (other == com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType.getDefaultInstance()) return this;
      if (!other.getCreditCardType().isEmpty()) {
        creditCardType_ = other.creditCardType_;
        onChanged();
      }
      if (other.getAmount() != 0D) {
        setAmount(other.getAmount());
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
      com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object creditCardType_ = "";
    /**
     * <pre>
     * 卡组织
     * </pre>
     *
     * <code>string CreditCardType = 1;</code>
     */
    public java.lang.String getCreditCardType() {
      java.lang.Object ref = creditCardType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        creditCardType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 卡组织
     * </pre>
     *
     * <code>string CreditCardType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCreditCardTypeBytes() {
      java.lang.Object ref = creditCardType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        creditCardType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 卡组织
     * </pre>
     *
     * <code>string CreditCardType = 1;</code>
     */
    public Builder setCreditCardType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      creditCardType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 卡组织
     * </pre>
     *
     * <code>string CreditCardType = 1;</code>
     */
    public Builder clearCreditCardType() {
      
      creditCardType_ = getDefaultInstance().getCreditCardType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 卡组织
     * </pre>
     *
     * <code>string CreditCardType = 1;</code>
     */
    public Builder setCreditCardTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      creditCardType_ = value;
      onChanged();
      return this;
    }

    private double amount_ ;
    /**
     * <pre>
     * 销售币种加价
     * </pre>
     *
     * <code>double Amount = 2;</code>
     */
    public double getAmount() {
      return amount_;
    }
    /**
     * <pre>
     * 销售币种加价
     * </pre>
     *
     * <code>double Amount = 2;</code>
     */
    public Builder setAmount(double value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 销售币种加价
     * </pre>
     *
     * <code>double Amount = 2;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType)
  private static final com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType();
  }

  public static com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreditCardFeeType>
      PARSER = new com.google.protobuf.AbstractParser<CreditCardFeeType>() {
    @java.lang.Override
    public CreditCardFeeType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreditCardFeeType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreditCardFeeType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreditCardFeeType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.intl.agg.flighttypes.v3.CreditCardFeeType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

