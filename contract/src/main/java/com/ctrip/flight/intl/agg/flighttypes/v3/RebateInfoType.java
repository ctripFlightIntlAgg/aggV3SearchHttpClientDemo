// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

/**
 * Protobuf type {@code com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType}
 */
public  final class RebateInfoType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType)
    RebateInfoTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RebateInfoType.newBuilder() to construct.
  private RebateInfoType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RebateInfoType() {
    type_ = "";
    amount_ = 0D;
    currency_ = "";
    rebatePolicyIDs_ = java.util.Collections.emptyList();
    actualAmount_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RebateInfoType(
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

            type_ = s;
            break;
          }
          case 17: {

            amount_ = input.readDouble();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            currency_ = s;
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              rebatePolicyIDs_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000008;
            }
            rebatePolicyIDs_.add(input.readInt64());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008) && input.getBytesUntilLimit() > 0) {
              rebatePolicyIDs_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000008;
            }
            while (input.getBytesUntilLimit() > 0) {
              rebatePolicyIDs_.add(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 41: {

            actualAmount_ = input.readDouble();
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        rebatePolicyIDs_ = java.util.Collections.unmodifiableList(rebatePolicyIDs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_RebateInfoType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_RebateInfoType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType.class, com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType.Builder.class);
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   * <code>string Type = 1;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string Type = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private double amount_;
  /**
   * <code>double Amount = 2;</code>
   */
  public double getAmount() {
    return amount_;
  }

  public static final int CURRENCY_FIELD_NUMBER = 3;
  private volatile java.lang.Object currency_;
  /**
   * <code>string Currency = 3;</code>
   */
  public java.lang.String getCurrency() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currency_ = s;
      return s;
    }
  }
  /**
   * <code>string Currency = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCurrencyBytes() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REBATEPOLICYIDS_FIELD_NUMBER = 4;
  private java.util.List<java.lang.Long> rebatePolicyIDs_;
  /**
   * <code>repeated int64 rebatePolicyIDs = 4;</code>
   */
  public java.util.List<java.lang.Long>
      getRebatePolicyIDsList() {
    return rebatePolicyIDs_;
  }
  /**
   * <code>repeated int64 rebatePolicyIDs = 4;</code>
   */
  public int getRebatePolicyIDsCount() {
    return rebatePolicyIDs_.size();
  }
  /**
   * <code>repeated int64 rebatePolicyIDs = 4;</code>
   */
  public long getRebatePolicyIDs(int index) {
    return rebatePolicyIDs_.get(index);
  }
  private int rebatePolicyIDsMemoizedSerializedSize = -1;

  public static final int ACTUALAMOUNT_FIELD_NUMBER = 5;
  private double actualAmount_;
  /**
   * <code>double ActualAmount = 5;</code>
   */
  public double getActualAmount() {
    return actualAmount_;
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
    getSerializedSize();
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (amount_ != 0D) {
      output.writeDouble(2, amount_);
    }
    if (!getCurrencyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, currency_);
    }
    if (getRebatePolicyIDsList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(rebatePolicyIDsMemoizedSerializedSize);
    }
    for (int i = 0; i < rebatePolicyIDs_.size(); i++) {
      output.writeInt64NoTag(rebatePolicyIDs_.get(i));
    }
    if (actualAmount_ != 0D) {
      output.writeDouble(5, actualAmount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (amount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, amount_);
    }
    if (!getCurrencyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, currency_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < rebatePolicyIDs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(rebatePolicyIDs_.get(i));
      }
      size += dataSize;
      if (!getRebatePolicyIDsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      rebatePolicyIDsMemoizedSerializedSize = dataSize;
    }
    if (actualAmount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, actualAmount_);
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
    if (!(obj instanceof com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType other = (com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType) obj;

    boolean result = true;
    result = result && getType()
        .equals(other.getType());
    result = result && (
        java.lang.Double.doubleToLongBits(getAmount())
        == java.lang.Double.doubleToLongBits(
            other.getAmount()));
    result = result && getCurrency()
        .equals(other.getCurrency());
    result = result && getRebatePolicyIDsList()
        .equals(other.getRebatePolicyIDsList());
    result = result && (
        java.lang.Double.doubleToLongBits(getActualAmount())
        == java.lang.Double.doubleToLongBits(
            other.getActualAmount()));
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAmount()));
    hash = (37 * hash) + CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getCurrency().hashCode();
    if (getRebatePolicyIDsCount() > 0) {
      hash = (37 * hash) + REBATEPOLICYIDS_FIELD_NUMBER;
      hash = (53 * hash) + getRebatePolicyIDsList().hashCode();
    }
    hash = (37 * hash) + ACTUALAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getActualAmount()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType)
      com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_RebateInfoType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_RebateInfoType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType.class, com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType.Builder.class);
    }

    // Construct using com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType.newBuilder()
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
      type_ = "";

      amount_ = 0D;

      currency_ = "";

      rebatePolicyIDs_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      actualAmount_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_RebateInfoType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType getDefaultInstanceForType() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType build() {
      com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType buildPartial() {
      com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType result = new com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.type_ = type_;
      result.amount_ = amount_;
      result.currency_ = currency_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        rebatePolicyIDs_ = java.util.Collections.unmodifiableList(rebatePolicyIDs_);
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.rebatePolicyIDs_ = rebatePolicyIDs_;
      result.actualAmount_ = actualAmount_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType) {
        return mergeFrom((com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType other) {
      if (other == com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.getAmount() != 0D) {
        setAmount(other.getAmount());
      }
      if (!other.getCurrency().isEmpty()) {
        currency_ = other.currency_;
        onChanged();
      }
      if (!other.rebatePolicyIDs_.isEmpty()) {
        if (rebatePolicyIDs_.isEmpty()) {
          rebatePolicyIDs_ = other.rebatePolicyIDs_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureRebatePolicyIDsIsMutable();
          rebatePolicyIDs_.addAll(other.rebatePolicyIDs_);
        }
        onChanged();
      }
      if (other.getActualAmount() != 0D) {
        setActualAmount(other.getActualAmount());
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
      com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object type_ = "";
    /**
     * <code>string Type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Type = 1;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string Type = 1;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private double amount_ ;
    /**
     * <code>double Amount = 2;</code>
     */
    public double getAmount() {
      return amount_;
    }
    /**
     * <code>double Amount = 2;</code>
     */
    public Builder setAmount(double value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double Amount = 2;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object currency_ = "";
    /**
     * <code>string Currency = 3;</code>
     */
    public java.lang.String getCurrency() {
      java.lang.Object ref = currency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Currency = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCurrencyBytes() {
      java.lang.Object ref = currency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Currency = 3;</code>
     */
    public Builder setCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Currency = 3;</code>
     */
    public Builder clearCurrency() {
      
      currency_ = getDefaultInstance().getCurrency();
      onChanged();
      return this;
    }
    /**
     * <code>string Currency = 3;</code>
     */
    public Builder setCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currency_ = value;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Long> rebatePolicyIDs_ = java.util.Collections.emptyList();
    private void ensureRebatePolicyIDsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        rebatePolicyIDs_ = new java.util.ArrayList<java.lang.Long>(rebatePolicyIDs_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated int64 rebatePolicyIDs = 4;</code>
     */
    public java.util.List<java.lang.Long>
        getRebatePolicyIDsList() {
      return java.util.Collections.unmodifiableList(rebatePolicyIDs_);
    }
    /**
     * <code>repeated int64 rebatePolicyIDs = 4;</code>
     */
    public int getRebatePolicyIDsCount() {
      return rebatePolicyIDs_.size();
    }
    /**
     * <code>repeated int64 rebatePolicyIDs = 4;</code>
     */
    public long getRebatePolicyIDs(int index) {
      return rebatePolicyIDs_.get(index);
    }
    /**
     * <code>repeated int64 rebatePolicyIDs = 4;</code>
     */
    public Builder setRebatePolicyIDs(
        int index, long value) {
      ensureRebatePolicyIDsIsMutable();
      rebatePolicyIDs_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 rebatePolicyIDs = 4;</code>
     */
    public Builder addRebatePolicyIDs(long value) {
      ensureRebatePolicyIDsIsMutable();
      rebatePolicyIDs_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 rebatePolicyIDs = 4;</code>
     */
    public Builder addAllRebatePolicyIDs(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureRebatePolicyIDsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, rebatePolicyIDs_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 rebatePolicyIDs = 4;</code>
     */
    public Builder clearRebatePolicyIDs() {
      rebatePolicyIDs_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    private double actualAmount_ ;
    /**
     * <code>double ActualAmount = 5;</code>
     */
    public double getActualAmount() {
      return actualAmount_;
    }
    /**
     * <code>double ActualAmount = 5;</code>
     */
    public Builder setActualAmount(double value) {
      
      actualAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double ActualAmount = 5;</code>
     */
    public Builder clearActualAmount() {
      
      actualAmount_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType)
  private static final com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType();
  }

  public static com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RebateInfoType>
      PARSER = new com.google.protobuf.AbstractParser<RebateInfoType>() {
    @java.lang.Override
    public RebateInfoType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RebateInfoType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RebateInfoType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RebateInfoType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.intl.agg.flighttypes.v3.RebateInfoType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

