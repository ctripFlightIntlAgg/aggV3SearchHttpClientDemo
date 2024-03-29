// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.additionproduct.v3.proto

package com.ctrip.flight.intl.agg.additionproduct.v3;

/**
 * Protobuf type {@code com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType}
 */
public  final class BrandedFareRefType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType)
    BrandedFareRefTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BrandedFareRefType.newBuilder() to construct.
  private BrandedFareRefType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BrandedFareRefType() {
    segmentNo_ = 0;
    refNum_ = 0;
    sequenceNo_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BrandedFareRefType(
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

            segmentNo_ = input.readInt32();
            break;
          }
          case 16: {

            refNum_ = input.readInt32();
            break;
          }
          case 24: {

            sequenceNo_ = input.readInt32();
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
    return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_BrandedFareRefType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_BrandedFareRefType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType.class, com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType.Builder.class);
  }

  public static final int SEGMENTNO_FIELD_NUMBER = 1;
  private int segmentNo_;
  /**
   * <pre>
   * 航程号，去程1  回程2
   * </pre>
   *
   * <code>int32 SegmentNo = 1;</code>
   */
  public int getSegmentNo() {
    return segmentNo_;
  }

  public static final int REFNUM_FIELD_NUMBER = 2;
  private int refNum_;
  /**
   * <pre>
   * 索引号
   * </pre>
   *
   * <code>int32 RefNum = 2;</code>
   */
  public int getRefNum() {
    return refNum_;
  }

  public static final int SEQUENCENO_FIELD_NUMBER = 3;
  private int sequenceNo_;
  /**
   * <pre>
   * 航段号
   * </pre>
   *
   * <code>int32 SequenceNo = 3;</code>
   */
  public int getSequenceNo() {
    return sequenceNo_;
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
    if (segmentNo_ != 0) {
      output.writeInt32(1, segmentNo_);
    }
    if (refNum_ != 0) {
      output.writeInt32(2, refNum_);
    }
    if (sequenceNo_ != 0) {
      output.writeInt32(3, sequenceNo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (segmentNo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, segmentNo_);
    }
    if (refNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, refNum_);
    }
    if (sequenceNo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, sequenceNo_);
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
    if (!(obj instanceof com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType other = (com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType) obj;

    boolean result = true;
    result = result && (getSegmentNo()
        == other.getSegmentNo());
    result = result && (getRefNum()
        == other.getRefNum());
    result = result && (getSequenceNo()
        == other.getSequenceNo());
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
    hash = (37 * hash) + SEGMENTNO_FIELD_NUMBER;
    hash = (53 * hash) + getSegmentNo();
    hash = (37 * hash) + REFNUM_FIELD_NUMBER;
    hash = (53 * hash) + getRefNum();
    hash = (37 * hash) + SEQUENCENO_FIELD_NUMBER;
    hash = (53 * hash) + getSequenceNo();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType)
      com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_BrandedFareRefType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_BrandedFareRefType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType.class, com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType.Builder.class);
    }

    // Construct using com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType.newBuilder()
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
      segmentNo_ = 0;

      refNum_ = 0;

      sequenceNo_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_BrandedFareRefType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType getDefaultInstanceForType() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType build() {
      com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType buildPartial() {
      com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType result = new com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType(this);
      result.segmentNo_ = segmentNo_;
      result.refNum_ = refNum_;
      result.sequenceNo_ = sequenceNo_;
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
      if (other instanceof com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType) {
        return mergeFrom((com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType other) {
      if (other == com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType.getDefaultInstance()) return this;
      if (other.getSegmentNo() != 0) {
        setSegmentNo(other.getSegmentNo());
      }
      if (other.getRefNum() != 0) {
        setRefNum(other.getRefNum());
      }
      if (other.getSequenceNo() != 0) {
        setSequenceNo(other.getSequenceNo());
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
      com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int segmentNo_ ;
    /**
     * <pre>
     * 航程号，去程1  回程2
     * </pre>
     *
     * <code>int32 SegmentNo = 1;</code>
     */
    public int getSegmentNo() {
      return segmentNo_;
    }
    /**
     * <pre>
     * 航程号，去程1  回程2
     * </pre>
     *
     * <code>int32 SegmentNo = 1;</code>
     */
    public Builder setSegmentNo(int value) {
      
      segmentNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 航程号，去程1  回程2
     * </pre>
     *
     * <code>int32 SegmentNo = 1;</code>
     */
    public Builder clearSegmentNo() {
      
      segmentNo_ = 0;
      onChanged();
      return this;
    }

    private int refNum_ ;
    /**
     * <pre>
     * 索引号
     * </pre>
     *
     * <code>int32 RefNum = 2;</code>
     */
    public int getRefNum() {
      return refNum_;
    }
    /**
     * <pre>
     * 索引号
     * </pre>
     *
     * <code>int32 RefNum = 2;</code>
     */
    public Builder setRefNum(int value) {
      
      refNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 索引号
     * </pre>
     *
     * <code>int32 RefNum = 2;</code>
     */
    public Builder clearRefNum() {
      
      refNum_ = 0;
      onChanged();
      return this;
    }

    private int sequenceNo_ ;
    /**
     * <pre>
     * 航段号
     * </pre>
     *
     * <code>int32 SequenceNo = 3;</code>
     */
    public int getSequenceNo() {
      return sequenceNo_;
    }
    /**
     * <pre>
     * 航段号
     * </pre>
     *
     * <code>int32 SequenceNo = 3;</code>
     */
    public Builder setSequenceNo(int value) {
      
      sequenceNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 航段号
     * </pre>
     *
     * <code>int32 SequenceNo = 3;</code>
     */
    public Builder clearSequenceNo() {
      
      sequenceNo_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType)
  private static final com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType();
  }

  public static com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BrandedFareRefType>
      PARSER = new com.google.protobuf.AbstractParser<BrandedFareRefType>() {
    @java.lang.Override
    public BrandedFareRefType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BrandedFareRefType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BrandedFareRefType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BrandedFareRefType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.intl.agg.additionproduct.v3.BrandedFareRefType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

