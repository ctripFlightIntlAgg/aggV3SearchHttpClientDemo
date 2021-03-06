// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.flighttypes.v3.proto

package com.ctrip.flight.intl.agg.flighttypes.v3;

/**
 * <pre>
 *变化 修改枚举值
 * </pre>
 *
 * Protobuf enum {@code com.ctrip.flight.intl.agg.flighttypes.v3.CabinClassType}
 */
public enum CabinClassType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *Economy
   * </pre>
   *
   * <code>Y = 0;</code>
   */
  Y(0),
  /**
   * <pre>
   *Premium
   * </pre>
   *
   * <code>W = 1;</code>
   */
  W(1),
  /**
   * <pre>
   *Business
   * </pre>
   *
   * <code>C = 2;</code>
   */
  C(2),
  /**
   * <pre>
   *First
   * </pre>
   *
   * <code>F = 3;</code>
   */
  F(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *Economy
   * </pre>
   *
   * <code>Y = 0;</code>
   */
  public static final int Y_VALUE = 0;
  /**
   * <pre>
   *Premium
   * </pre>
   *
   * <code>W = 1;</code>
   */
  public static final int W_VALUE = 1;
  /**
   * <pre>
   *Business
   * </pre>
   *
   * <code>C = 2;</code>
   */
  public static final int C_VALUE = 2;
  /**
   * <pre>
   *First
   * </pre>
   *
   * <code>F = 3;</code>
   */
  public static final int F_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CabinClassType valueOf(int value) {
    return forNumber(value);
  }

  public static CabinClassType forNumber(int value) {
    switch (value) {
      case 0: return Y;
      case 1: return W;
      case 2: return C;
      case 3: return F;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CabinClassType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CabinClassType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CabinClassType>() {
          public CabinClassType findValueByNumber(int number) {
            return CabinClassType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.getDescriptor().getEnumTypes().get(0);
  }

  private static final CabinClassType[] VALUES = values();

  public static CabinClassType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CabinClassType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.ctrip.flight.intl.agg.flighttypes.v3.CabinClassType)
}

