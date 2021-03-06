// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

/**
 * Protobuf type {@code com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType}
 */
public  final class VirtualFlightRemarkType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType)
    VirtualFlightRemarkTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VirtualFlightRemarkType.newBuilder() to construct.
  private VirtualFlightRemarkType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VirtualFlightRemarkType() {
    segmentNo_ = 0;
    sequenceNo_ = 0;
    checkInRemarkID_ = "";
    preTransRemarkID_ = "";
    nextTransRemarkID_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VirtualFlightRemarkType(
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

            sequenceNo_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            checkInRemarkID_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            preTransRemarkID_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            nextTransRemarkID_ = s;
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
    return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_VirtualFlightRemarkType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_VirtualFlightRemarkType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType.class, com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType.Builder.class);
  }

  public static final int SEGMENTNO_FIELD_NUMBER = 1;
  private int segmentNo_;
  /**
   * <code>int32 SegmentNo = 1;</code>
   */
  public int getSegmentNo() {
    return segmentNo_;
  }

  public static final int SEQUENCENO_FIELD_NUMBER = 2;
  private int sequenceNo_;
  /**
   * <code>int32 SequenceNo = 2;</code>
   */
  public int getSequenceNo() {
    return sequenceNo_;
  }

  public static final int CHECKINREMARKID_FIELD_NUMBER = 3;
  private volatile java.lang.Object checkInRemarkID_;
  /**
   * <code>string CheckInRemarkID = 3;</code>
   */
  public java.lang.String getCheckInRemarkID() {
    java.lang.Object ref = checkInRemarkID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      checkInRemarkID_ = s;
      return s;
    }
  }
  /**
   * <code>string CheckInRemarkID = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCheckInRemarkIDBytes() {
    java.lang.Object ref = checkInRemarkID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checkInRemarkID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRETRANSREMARKID_FIELD_NUMBER = 4;
  private volatile java.lang.Object preTransRemarkID_;
  /**
   * <code>string PreTransRemarkID = 4;</code>
   */
  public java.lang.String getPreTransRemarkID() {
    java.lang.Object ref = preTransRemarkID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      preTransRemarkID_ = s;
      return s;
    }
  }
  /**
   * <code>string PreTransRemarkID = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPreTransRemarkIDBytes() {
    java.lang.Object ref = preTransRemarkID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      preTransRemarkID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEXTTRANSREMARKID_FIELD_NUMBER = 5;
  private volatile java.lang.Object nextTransRemarkID_;
  /**
   * <code>string NextTransRemarkID = 5;</code>
   */
  public java.lang.String getNextTransRemarkID() {
    java.lang.Object ref = nextTransRemarkID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextTransRemarkID_ = s;
      return s;
    }
  }
  /**
   * <code>string NextTransRemarkID = 5;</code>
   */
  public com.google.protobuf.ByteString
      getNextTransRemarkIDBytes() {
    java.lang.Object ref = nextTransRemarkID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextTransRemarkID_ = b;
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
    if (segmentNo_ != 0) {
      output.writeInt32(1, segmentNo_);
    }
    if (sequenceNo_ != 0) {
      output.writeInt32(2, sequenceNo_);
    }
    if (!getCheckInRemarkIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, checkInRemarkID_);
    }
    if (!getPreTransRemarkIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, preTransRemarkID_);
    }
    if (!getNextTransRemarkIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, nextTransRemarkID_);
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
    if (sequenceNo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, sequenceNo_);
    }
    if (!getCheckInRemarkIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, checkInRemarkID_);
    }
    if (!getPreTransRemarkIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, preTransRemarkID_);
    }
    if (!getNextTransRemarkIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, nextTransRemarkID_);
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
    if (!(obj instanceof com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType other = (com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType) obj;

    boolean result = true;
    result = result && (getSegmentNo()
        == other.getSegmentNo());
    result = result && (getSequenceNo()
        == other.getSequenceNo());
    result = result && getCheckInRemarkID()
        .equals(other.getCheckInRemarkID());
    result = result && getPreTransRemarkID()
        .equals(other.getPreTransRemarkID());
    result = result && getNextTransRemarkID()
        .equals(other.getNextTransRemarkID());
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
    hash = (37 * hash) + SEQUENCENO_FIELD_NUMBER;
    hash = (53 * hash) + getSequenceNo();
    hash = (37 * hash) + CHECKINREMARKID_FIELD_NUMBER;
    hash = (53 * hash) + getCheckInRemarkID().hashCode();
    hash = (37 * hash) + PRETRANSREMARKID_FIELD_NUMBER;
    hash = (53 * hash) + getPreTransRemarkID().hashCode();
    hash = (37 * hash) + NEXTTRANSREMARKID_FIELD_NUMBER;
    hash = (53 * hash) + getNextTransRemarkID().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType)
      com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_VirtualFlightRemarkType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_VirtualFlightRemarkType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType.class, com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType.Builder.class);
    }

    // Construct using com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType.newBuilder()
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

      sequenceNo_ = 0;

      checkInRemarkID_ = "";

      preTransRemarkID_ = "";

      nextTransRemarkID_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.internal_static_com_ctrip_flight_intl_agg_flighttypes_v3_VirtualFlightRemarkType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType getDefaultInstanceForType() {
      return com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType build() {
      com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType buildPartial() {
      com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType result = new com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType(this);
      result.segmentNo_ = segmentNo_;
      result.sequenceNo_ = sequenceNo_;
      result.checkInRemarkID_ = checkInRemarkID_;
      result.preTransRemarkID_ = preTransRemarkID_;
      result.nextTransRemarkID_ = nextTransRemarkID_;
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
      if (other instanceof com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType) {
        return mergeFrom((com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType other) {
      if (other == com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType.getDefaultInstance()) return this;
      if (other.getSegmentNo() != 0) {
        setSegmentNo(other.getSegmentNo());
      }
      if (other.getSequenceNo() != 0) {
        setSequenceNo(other.getSequenceNo());
      }
      if (!other.getCheckInRemarkID().isEmpty()) {
        checkInRemarkID_ = other.checkInRemarkID_;
        onChanged();
      }
      if (!other.getPreTransRemarkID().isEmpty()) {
        preTransRemarkID_ = other.preTransRemarkID_;
        onChanged();
      }
      if (!other.getNextTransRemarkID().isEmpty()) {
        nextTransRemarkID_ = other.nextTransRemarkID_;
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
      com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType) e.getUnfinishedMessage();
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
     * <code>int32 SegmentNo = 1;</code>
     */
    public int getSegmentNo() {
      return segmentNo_;
    }
    /**
     * <code>int32 SegmentNo = 1;</code>
     */
    public Builder setSegmentNo(int value) {
      
      segmentNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 SegmentNo = 1;</code>
     */
    public Builder clearSegmentNo() {
      
      segmentNo_ = 0;
      onChanged();
      return this;
    }

    private int sequenceNo_ ;
    /**
     * <code>int32 SequenceNo = 2;</code>
     */
    public int getSequenceNo() {
      return sequenceNo_;
    }
    /**
     * <code>int32 SequenceNo = 2;</code>
     */
    public Builder setSequenceNo(int value) {
      
      sequenceNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 SequenceNo = 2;</code>
     */
    public Builder clearSequenceNo() {
      
      sequenceNo_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object checkInRemarkID_ = "";
    /**
     * <code>string CheckInRemarkID = 3;</code>
     */
    public java.lang.String getCheckInRemarkID() {
      java.lang.Object ref = checkInRemarkID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checkInRemarkID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CheckInRemarkID = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCheckInRemarkIDBytes() {
      java.lang.Object ref = checkInRemarkID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checkInRemarkID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CheckInRemarkID = 3;</code>
     */
    public Builder setCheckInRemarkID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      checkInRemarkID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CheckInRemarkID = 3;</code>
     */
    public Builder clearCheckInRemarkID() {
      
      checkInRemarkID_ = getDefaultInstance().getCheckInRemarkID();
      onChanged();
      return this;
    }
    /**
     * <code>string CheckInRemarkID = 3;</code>
     */
    public Builder setCheckInRemarkIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      checkInRemarkID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object preTransRemarkID_ = "";
    /**
     * <code>string PreTransRemarkID = 4;</code>
     */
    public java.lang.String getPreTransRemarkID() {
      java.lang.Object ref = preTransRemarkID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        preTransRemarkID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string PreTransRemarkID = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPreTransRemarkIDBytes() {
      java.lang.Object ref = preTransRemarkID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        preTransRemarkID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string PreTransRemarkID = 4;</code>
     */
    public Builder setPreTransRemarkID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      preTransRemarkID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string PreTransRemarkID = 4;</code>
     */
    public Builder clearPreTransRemarkID() {
      
      preTransRemarkID_ = getDefaultInstance().getPreTransRemarkID();
      onChanged();
      return this;
    }
    /**
     * <code>string PreTransRemarkID = 4;</code>
     */
    public Builder setPreTransRemarkIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      preTransRemarkID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object nextTransRemarkID_ = "";
    /**
     * <code>string NextTransRemarkID = 5;</code>
     */
    public java.lang.String getNextTransRemarkID() {
      java.lang.Object ref = nextTransRemarkID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextTransRemarkID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string NextTransRemarkID = 5;</code>
     */
    public com.google.protobuf.ByteString
        getNextTransRemarkIDBytes() {
      java.lang.Object ref = nextTransRemarkID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextTransRemarkID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string NextTransRemarkID = 5;</code>
     */
    public Builder setNextTransRemarkID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextTransRemarkID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string NextTransRemarkID = 5;</code>
     */
    public Builder clearNextTransRemarkID() {
      
      nextTransRemarkID_ = getDefaultInstance().getNextTransRemarkID();
      onChanged();
      return this;
    }
    /**
     * <code>string NextTransRemarkID = 5;</code>
     */
    public Builder setNextTransRemarkIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextTransRemarkID_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType)
  private static final com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType();
  }

  public static com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VirtualFlightRemarkType>
      PARSER = new com.google.protobuf.AbstractParser<VirtualFlightRemarkType>() {
    @java.lang.Override
    public VirtualFlightRemarkType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VirtualFlightRemarkType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VirtualFlightRemarkType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VirtualFlightRemarkType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.intl.agg.flighttypes.v3.VirtualFlightRemarkType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

