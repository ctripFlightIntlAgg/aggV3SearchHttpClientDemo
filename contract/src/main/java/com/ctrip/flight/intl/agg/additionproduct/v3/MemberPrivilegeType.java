// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.additionproduct.v3.proto

package com.ctrip.flight.intl.agg.additionproduct.v3;

/**
 * Protobuf type {@code com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType}
 */
public  final class MemberPrivilegeType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType)
    MemberPrivilegeTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemberPrivilegeType.newBuilder() to construct.
  private MemberPrivilegeType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemberPrivilegeType() {
    promotionId_ = 0L;
    forUser_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MemberPrivilegeType(
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

            promotionId_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            forUser_ = s;
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
    return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_MemberPrivilegeType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_MemberPrivilegeType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType.class, com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType.Builder.class);
  }

  public static final int PROMOTIONID_FIELD_NUMBER = 1;
  private long promotionId_;
  /**
   * <pre>
   * 定投ID
   * </pre>
   *
   * <code>int64 PromotionId = 1;</code>
   */
  public long getPromotionId() {
    return promotionId_;
  }

  public static final int FORUSER_FIELD_NUMBER = 2;
  private volatile java.lang.Object forUser_;
  /**
   * <pre>
   * 使用人群范围
   * </pre>
   *
   * <code>string ForUser = 2;</code>
   */
  public java.lang.String getForUser() {
    java.lang.Object ref = forUser_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      forUser_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 使用人群范围
   * </pre>
   *
   * <code>string ForUser = 2;</code>
   */
  public com.google.protobuf.ByteString
      getForUserBytes() {
    java.lang.Object ref = forUser_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      forUser_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (promotionId_ != 0L) {
      output.writeInt64(1, promotionId_);
    }
    if (!getForUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, forUser_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (promotionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, promotionId_);
    }
    if (!getForUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, forUser_);
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
    if (!(obj instanceof com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType other = (com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType) obj;

    boolean result = true;
    result = result && (getPromotionId()
        == other.getPromotionId());
    result = result && getForUser()
        .equals(other.getForUser());
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
    hash = (37 * hash) + PROMOTIONID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPromotionId());
    hash = (37 * hash) + FORUSER_FIELD_NUMBER;
    hash = (53 * hash) + getForUser().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType)
      com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_MemberPrivilegeType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_MemberPrivilegeType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType.class, com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType.Builder.class);
    }

    // Construct using com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType.newBuilder()
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
      promotionId_ = 0L;

      forUser_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_MemberPrivilegeType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType getDefaultInstanceForType() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType build() {
      com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType buildPartial() {
      com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType result = new com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType(this);
      result.promotionId_ = promotionId_;
      result.forUser_ = forUser_;
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
      if (other instanceof com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType) {
        return mergeFrom((com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType other) {
      if (other == com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType.getDefaultInstance()) return this;
      if (other.getPromotionId() != 0L) {
        setPromotionId(other.getPromotionId());
      }
      if (!other.getForUser().isEmpty()) {
        forUser_ = other.forUser_;
        onChanged();
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
      com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long promotionId_ ;
    /**
     * <pre>
     * 定投ID
     * </pre>
     *
     * <code>int64 PromotionId = 1;</code>
     */
    public long getPromotionId() {
      return promotionId_;
    }
    /**
     * <pre>
     * 定投ID
     * </pre>
     *
     * <code>int64 PromotionId = 1;</code>
     */
    public Builder setPromotionId(long value) {
      
      promotionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 定投ID
     * </pre>
     *
     * <code>int64 PromotionId = 1;</code>
     */
    public Builder clearPromotionId() {
      
      promotionId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object forUser_ = "";
    /**
     * <pre>
     * 使用人群范围
     * </pre>
     *
     * <code>string ForUser = 2;</code>
     */
    public java.lang.String getForUser() {
      java.lang.Object ref = forUser_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        forUser_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 使用人群范围
     * </pre>
     *
     * <code>string ForUser = 2;</code>
     */
    public com.google.protobuf.ByteString
        getForUserBytes() {
      java.lang.Object ref = forUser_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        forUser_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 使用人群范围
     * </pre>
     *
     * <code>string ForUser = 2;</code>
     */
    public Builder setForUser(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      forUser_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 使用人群范围
     * </pre>
     *
     * <code>string ForUser = 2;</code>
     */
    public Builder clearForUser() {
      
      forUser_ = getDefaultInstance().getForUser();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 使用人群范围
     * </pre>
     *
     * <code>string ForUser = 2;</code>
     */
    public Builder setForUserBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      forUser_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType)
  private static final com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType();
  }

  public static com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemberPrivilegeType>
      PARSER = new com.google.protobuf.AbstractParser<MemberPrivilegeType>() {
    @java.lang.Override
    public MemberPrivilegeType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MemberPrivilegeType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MemberPrivilegeType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemberPrivilegeType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.intl.agg.additionproduct.v3.MemberPrivilegeType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

