// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.additionproduct.v3.proto

package com.ctrip.flight.intl.agg.additionproduct.v3;

/**
 * Protobuf type {@code com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType}
 */
public  final class AncillariesInfoType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType)
    AncillariesInfoTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AncillariesInfoType.newBuilder() to construct.
  private AncillariesInfoType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AncillariesInfoType() {
    hasBaggageService_ = false;
    unFreeBaggage_ = false;
    checkInServiceStatus_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AncillariesInfoType(
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

            hasBaggageService_ = input.readBool();
            break;
          }
          case 16: {

            unFreeBaggage_ = input.readBool();
            break;
          }
          case 24: {

            checkInServiceStatus_ = input.readInt32();
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
    return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_AncillariesInfoType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_AncillariesInfoType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType.class, com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType.Builder.class);
  }

  public static final int HASBAGGAGESERVICE_FIELD_NUMBER = 1;
  private boolean hasBaggageService_;
  /**
   * <code>bool HasBaggageService = 1;</code>
   */
  public boolean getHasBaggageService() {
    return hasBaggageService_;
  }

  public static final int UNFREEBAGGAGE_FIELD_NUMBER = 2;
  private boolean unFreeBaggage_;
  /**
   * <code>bool UnFreeBaggage = 2;</code>
   */
  public boolean getUnFreeBaggage() {
    return unFreeBaggage_;
  }

  public static final int CHECKINSERVICESTATUS_FIELD_NUMBER = 3;
  private int checkInServiceStatus_;
  /**
   * <code>int32 CheckInServiceStatus = 3;</code>
   */
  public int getCheckInServiceStatus() {
    return checkInServiceStatus_;
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
    if (hasBaggageService_ != false) {
      output.writeBool(1, hasBaggageService_);
    }
    if (unFreeBaggage_ != false) {
      output.writeBool(2, unFreeBaggage_);
    }
    if (checkInServiceStatus_ != 0) {
      output.writeInt32(3, checkInServiceStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hasBaggageService_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, hasBaggageService_);
    }
    if (unFreeBaggage_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, unFreeBaggage_);
    }
    if (checkInServiceStatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, checkInServiceStatus_);
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
    if (!(obj instanceof com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType other = (com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType) obj;

    boolean result = true;
    result = result && (getHasBaggageService()
        == other.getHasBaggageService());
    result = result && (getUnFreeBaggage()
        == other.getUnFreeBaggage());
    result = result && (getCheckInServiceStatus()
        == other.getCheckInServiceStatus());
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
    hash = (37 * hash) + HASBAGGAGESERVICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasBaggageService());
    hash = (37 * hash) + UNFREEBAGGAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUnFreeBaggage());
    hash = (37 * hash) + CHECKINSERVICESTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getCheckInServiceStatus();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType)
      com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_AncillariesInfoType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_AncillariesInfoType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType.class, com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType.Builder.class);
    }

    // Construct using com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType.newBuilder()
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
      hasBaggageService_ = false;

      unFreeBaggage_ = false;

      checkInServiceStatus_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.internal_static_com_ctrip_flight_intl_agg_additionproduct_v3_AncillariesInfoType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType getDefaultInstanceForType() {
      return com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType build() {
      com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType buildPartial() {
      com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType result = new com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType(this);
      result.hasBaggageService_ = hasBaggageService_;
      result.unFreeBaggage_ = unFreeBaggage_;
      result.checkInServiceStatus_ = checkInServiceStatus_;
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
      if (other instanceof com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType) {
        return mergeFrom((com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType other) {
      if (other == com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType.getDefaultInstance()) return this;
      if (other.getHasBaggageService() != false) {
        setHasBaggageService(other.getHasBaggageService());
      }
      if (other.getUnFreeBaggage() != false) {
        setUnFreeBaggage(other.getUnFreeBaggage());
      }
      if (other.getCheckInServiceStatus() != 0) {
        setCheckInServiceStatus(other.getCheckInServiceStatus());
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
      com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean hasBaggageService_ ;
    /**
     * <code>bool HasBaggageService = 1;</code>
     */
    public boolean getHasBaggageService() {
      return hasBaggageService_;
    }
    /**
     * <code>bool HasBaggageService = 1;</code>
     */
    public Builder setHasBaggageService(boolean value) {
      
      hasBaggageService_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool HasBaggageService = 1;</code>
     */
    public Builder clearHasBaggageService() {
      
      hasBaggageService_ = false;
      onChanged();
      return this;
    }

    private boolean unFreeBaggage_ ;
    /**
     * <code>bool UnFreeBaggage = 2;</code>
     */
    public boolean getUnFreeBaggage() {
      return unFreeBaggage_;
    }
    /**
     * <code>bool UnFreeBaggage = 2;</code>
     */
    public Builder setUnFreeBaggage(boolean value) {
      
      unFreeBaggage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool UnFreeBaggage = 2;</code>
     */
    public Builder clearUnFreeBaggage() {
      
      unFreeBaggage_ = false;
      onChanged();
      return this;
    }

    private int checkInServiceStatus_ ;
    /**
     * <code>int32 CheckInServiceStatus = 3;</code>
     */
    public int getCheckInServiceStatus() {
      return checkInServiceStatus_;
    }
    /**
     * <code>int32 CheckInServiceStatus = 3;</code>
     */
    public Builder setCheckInServiceStatus(int value) {
      
      checkInServiceStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 CheckInServiceStatus = 3;</code>
     */
    public Builder clearCheckInServiceStatus() {
      
      checkInServiceStatus_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType)
  private static final com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType();
  }

  public static com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AncillariesInfoType>
      PARSER = new com.google.protobuf.AbstractParser<AncillariesInfoType>() {
    @java.lang.Override
    public AncillariesInfoType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AncillariesInfoType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AncillariesInfoType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AncillariesInfoType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.intl.agg.additionproduct.v3.AncillariesInfoType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

