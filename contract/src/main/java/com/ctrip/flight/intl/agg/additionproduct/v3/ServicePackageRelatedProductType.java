// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.additionproduct.v3.proto

package com.ctrip.flight.intl.agg.additionproduct.v3;

/**
 * Protobuf type {@code com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType}
 */
public  final class ServicePackageRelatedProductType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType)
    ServicePackageRelatedProductTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServicePackageRelatedProductType.newBuilder() to construct.
  private ServicePackageRelatedProductType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServicePackageRelatedProductType() {
    productType_ = "";
    subProductType_ = 0;
    token_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServicePackageRelatedProductType(
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

            productType_ = s;
            break;
          }
          case 16: {

            subProductType_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            token_ = s;
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
    return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_ServicePackageRelatedProductType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_ServicePackageRelatedProductType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType.class, com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType.Builder.class);
  }

  public static final int PRODUCTTYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object productType_;
  /**
   * <code>string ProductType = 1;</code>
   */
  public java.lang.String getProductType() {
    java.lang.Object ref = productType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productType_ = s;
      return s;
    }
  }
  /**
   * <code>string ProductType = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProductTypeBytes() {
    java.lang.Object ref = productType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBPRODUCTTYPE_FIELD_NUMBER = 2;
  private int subProductType_;
  /**
   * <code>int32 SubProductType = 2;</code>
   */
  public int getSubProductType() {
    return subProductType_;
  }

  public static final int TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object token_;
  /**
   * <pre>
   * 透传onex输出该关联产品的token
   * </pre>
   *
   * <code>string Token = 3;</code>
   */
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 透传onex输出该关联产品的token
   * </pre>
   *
   * <code>string Token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
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
    if (!getProductTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, productType_);
    }
    if (subProductType_ != 0) {
      output.writeInt32(2, subProductType_);
    }
    if (!getTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, token_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProductTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, productType_);
    }
    if (subProductType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, subProductType_);
    }
    if (!getTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, token_);
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
    if (!(obj instanceof com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType other = (com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType) obj;

    boolean result = true;
    result = result && getProductType()
        .equals(other.getProductType());
    result = result && (getSubProductType()
        == other.getSubProductType());
    result = result && getToken()
        .equals(other.getToken());
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
    hash = (37 * hash) + PRODUCTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getProductType().hashCode();
    hash = (37 * hash) + SUBPRODUCTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSubProductType();
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType)
      com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_ServicePackageRelatedProductType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_ServicePackageRelatedProductType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType.class, com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType.Builder.class);
    }

    // Construct using com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType.newBuilder()
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
      productType_ = "";

      subProductType_ = 0;

      token_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_ServicePackageRelatedProductType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType getDefaultInstanceForType() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType build() {
      com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType buildPartial() {
      com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType result = new com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType(this);
      result.productType_ = productType_;
      result.subProductType_ = subProductType_;
      result.token_ = token_;
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
      if (other instanceof com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType) {
        return mergeFrom((com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType other) {
      if (other == com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType.getDefaultInstance()) return this;
      if (!other.getProductType().isEmpty()) {
        productType_ = other.productType_;
        onChanged();
      }
      if (other.getSubProductType() != 0) {
        setSubProductType(other.getSubProductType());
      }
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
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
      com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object productType_ = "";
    /**
     * <code>string ProductType = 1;</code>
     */
    public java.lang.String getProductType() {
      java.lang.Object ref = productType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ProductType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProductTypeBytes() {
      java.lang.Object ref = productType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ProductType = 1;</code>
     */
    public Builder setProductType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ProductType = 1;</code>
     */
    public Builder clearProductType() {
      
      productType_ = getDefaultInstance().getProductType();
      onChanged();
      return this;
    }
    /**
     * <code>string ProductType = 1;</code>
     */
    public Builder setProductTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productType_ = value;
      onChanged();
      return this;
    }

    private int subProductType_ ;
    /**
     * <code>int32 SubProductType = 2;</code>
     */
    public int getSubProductType() {
      return subProductType_;
    }
    /**
     * <code>int32 SubProductType = 2;</code>
     */
    public Builder setSubProductType(int value) {
      
      subProductType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 SubProductType = 2;</code>
     */
    public Builder clearSubProductType() {
      
      subProductType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object token_ = "";
    /**
     * <pre>
     * 透传onex输出该关联产品的token
     * </pre>
     *
     * <code>string Token = 3;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 透传onex输出该关联产品的token
     * </pre>
     *
     * <code>string Token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 透传onex输出该关联产品的token
     * </pre>
     *
     * <code>string Token = 3;</code>
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 透传onex输出该关联产品的token
     * </pre>
     *
     * <code>string Token = 3;</code>
     */
    public Builder clearToken() {
      
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 透传onex输出该关联产品的token
     * </pre>
     *
     * <code>string Token = 3;</code>
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType)
  private static final com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType();
  }

  public static com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServicePackageRelatedProductType>
      PARSER = new com.google.protobuf.AbstractParser<ServicePackageRelatedProductType>() {
    @java.lang.Override
    public ServicePackageRelatedProductType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServicePackageRelatedProductType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServicePackageRelatedProductType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServicePackageRelatedProductType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.intl.agg.additionproduct.v3.ServicePackageRelatedProductType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

