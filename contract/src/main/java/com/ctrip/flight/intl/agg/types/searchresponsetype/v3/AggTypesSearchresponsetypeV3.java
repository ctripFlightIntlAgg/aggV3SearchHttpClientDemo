// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agg.types.searchresponsetype.v3.proto

package com.ctrip.flight.intl.agg.types.searchresponsetype.v3;

public final class AggTypesSearchresponsetypeV3 {
  private AggTypesSearchresponsetypeV3() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_SearchResponseType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_SearchResponseType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_SearchResultType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_SearchResultType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightProductGroupType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightProductGroupType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightRefType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightRefType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_PriceType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_PriceType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%agg.types.searchresponsetype.v3.proto\022" +
      "5com.ctrip.flight.intl.agg.types.searchr" +
      "esponsetype.v3\032\026BaijiCommonTypes.proto\032\034" +
      "agg.additionproduct.v3.proto\032\030agg.flight" +
      "types.v3.proto\032\031agg.messagetypes.v3.prot" +
      "o\"\326\002\n\022SearchResponseType\0229\n\016ResponseStat" +
      "us\030\001 \001(\0132!.com.ctrip.soa.ResponseStatusT" +
      "ype\022U\n\016ResponseHeader\030\002 \001(\0132=.com.ctrip." +
      "flight.intl.agg.messagetypes.v3.Response" +
      "HeaderType\022]\n\014SearchResult\030\003 \001(\0132G.com.c" +
      "trip.flight.intl.agg.types.searchrespons" +
      "etype.v3.SearchResultType\022O\n\013ErrorResult" +
      "\030\004 \001(\0132:.com.ctrip.flight.intl.agg.messa" +
      "getypes.v3.ErrorResultType\"\244\t\n\020SearchRes" +
      "ultType\022i\n\022FlightProductGroup\030\001 \003(\0132M.co" +
      "m.ctrip.flight.intl.agg.types.searchresp" +
      "onsetype.v3.FlightProductGroupType\022D\n\006Fl" +
      "ight\030\002 \003(\01324.com.ctrip.flight.intl.agg.f" +
      "lighttypes.v3.FlightType\022F\n\007Baggage\030\003 \003(" +
      "\01325.com.ctrip.flight.intl.agg.flighttype" +
      "s.v3.BaggageType\022L\n\nTextRemark\030\004 \003(\01328.c" +
      "om.ctrip.flight.intl.agg.flighttypes.v3." +
      "TextRemarkType\022\033\n\023SearchCriteriaToken\030\006 " +
      "\001(\t\022G\n\003Tag\030\007 \003(\0132:.com.ctrip.flight.intl" +
      ".agg.flighttypes.v3.KeyValuePairType\022D\n\006" +
      "Agency\030\010 \003(\01324.com.ctrip.flight.intl.agg" +
      ".flighttypes.v3.AgencyType\022J\n\007Airline\030\t " +
      "\003(\01329.com.ctrip.flight.intl.agg.flightty" +
      "pes.v3.AirlineInfoType\022D\n\004City\030\n \003(\01326.c" +
      "om.ctrip.flight.intl.agg.flighttypes.v3." +
      "CityInfoType\022J\n\007Airport\030\013 \003(\01329.com.ctri" +
      "p.flight.intl.agg.flighttypes.v3.Airport" +
      "InfoType\022J\n\007Service\030\014 \003(\01329.com.ctrip.fl" +
      "ight.intl.agg.additionproduct.v3.Service" +
      "Type\022J\n\tCacheInfo\030\r \003(\01327.com.ctrip.flig" +
      "ht.intl.agg.flighttypes.v3.CacheInfoType" +
      "\022b\n\025CreditCardPaymentInfo\030\016 \003(\0132C.com.ct" +
      "rip.flight.intl.agg.flighttypes.v3.Credi" +
      "tCardPaymentInfoType\022P\n\014ExtendFields\030\017 \003" +
      "(\0132:.com.ctrip.flight.intl.agg.flighttyp" +
      "es.v3.KeyValuePairType\022V\n\017PaymentDiscoun" +
      "t\030\020 \003(\0132=.com.ctrip.flight.intl.agg.flig" +
      "httypes.v3.PaymentDiscountType\022\031\n\021Xprodu" +
      "ctSearchKey\030\021 \001(\t\"\307\004\n\026FlightProductGroup" +
      "Type\022b\n\024FlightRefCombination\030\001 \003(\0132D.com" +
      ".ctrip.flight.intl.agg.types.searchrespo" +
      "nsetype.v3.FlightRefType\022O\n\005Price\030\002 \003(\0132" +
      "@.com.ctrip.flight.intl.agg.types.search" +
      "responsetype.v3.PriceType\022G\n\003Tag\030\004 \003(\0132:" +
      ".com.ctrip.flight.intl.agg.flighttypes.v" +
      "3.KeyValuePairType\022^\n\023VirtualFlightRemar" +
      "k\030\007 \003(\0132A.com.ctrip.flight.intl.agg.flig" +
      "httypes.v3.VirtualFlightRemarkType\022\024\n\014ha" +
      "sMoreGrade\030\010 \001(\010\022\021\n\tFlyerFlag\030\t \001(\005\022\035\n\025U" +
      "naccompaniedAgeRange\030\n \001(\t\022\014\n\004Flag\030\013 \001(\t" +
      "\022\025\n\rChoicenessTag\030\014 \001(\005\022P\n\014ExtendFields\030" +
      "\r \003(\0132:.com.ctrip.flight.intl.agg.flight" +
      "types.v3.KeyValuePairType\022\020\n\010Priority\030\016 " +
      "\001(\001\"\270\001\n\rFlightRefType\022\020\n\010FlightID\030\001 \001(\t\022" +
      "\021\n\tSegmentNo\030\002 \001(\005\022\022\n\nSequenceNo\030\003 \001(\005\022\020" +
      "\n\010MarrySeg\030\004 \001(\t\022\023\n\013mainSegment\030\005 \001(\010\022G\n" +
      "\003Tag\030\006 \003(\0132:.com.ctrip.flight.intl.agg.f" +
      "lighttypes.v3.KeyValuePairType\"\247\004\n\tPrice" +
      "Type\022R\n\rFlightSegment\030\001 \003(\0132;.com.ctrip." +
      "flight.intl.agg.flighttypes.v3.FlightSeg" +
      "mentType\022R\n\rProductDetail\030\002 \003(\0132;.com.ct" +
      "rip.flight.intl.agg.flighttypes.v3.Produ" +
      "ctDetailType\022\030\n\020RouteSearchToken\030\004 \001(\t\022L" +
      "\n\nBaggageRef\030\005 \003(\01328.com.ctrip.flight.in" +
      "tl.agg.flighttypes.v3.BaggageRefType\022\025\n\r" +
      "SortIndicator\030\007 \001(\001\022d\n\024TicketPackageProd" +
      "uct\030\010 \003(\0132F.com.ctrip.flight.intl.agg.ad" +
      "ditionproduct.v3.TicketPackageProductTyp" +
      "e\022\030\n\020PriceAttributeID\030\n \003(\005\022P\n\014ExtendFie" +
      "lds\030\013 \003(\0132:.com.ctrip.flight.intl.agg.fl" +
      "ighttypes.v3.KeyValuePairType\022\020\n\010Priorit" +
      "y\030\014 \001(\001\022\017\n\007OfferID\030\r \001(\005B9\n5com.ctrip.fl" +
      "ight.intl.agg.types.searchresponsetype.v" +
      "3P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ctrip.soa.BaijiCommonTypes.getDescriptor(),
          com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.getDescriptor(),
          com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.getDescriptor(),
          com.ctrip.flight.intl.agg.messagetypes.v3.AggMessagetypesV3.getDescriptor(),
        }, assigner);
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_SearchResponseType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_SearchResponseType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_SearchResponseType_descriptor,
        new java.lang.String[] { "ResponseStatus", "ResponseHeader", "SearchResult", "ErrorResult", });
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_SearchResultType_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_SearchResultType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_SearchResultType_descriptor,
        new java.lang.String[] { "FlightProductGroup", "Flight", "Baggage", "TextRemark", "SearchCriteriaToken", "Tag", "Agency", "Airline", "City", "Airport", "Service", "CacheInfo", "CreditCardPaymentInfo", "ExtendFields", "PaymentDiscount", "XproductSearchKey", });
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightProductGroupType_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightProductGroupType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightProductGroupType_descriptor,
        new java.lang.String[] { "FlightRefCombination", "Price", "Tag", "VirtualFlightRemark", "HasMoreGrade", "FlyerFlag", "UnaccompaniedAgeRange", "Flag", "ChoicenessTag", "ExtendFields", "Priority", });
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightRefType_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightRefType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_FlightRefType_descriptor,
        new java.lang.String[] { "FlightID", "SegmentNo", "SequenceNo", "MarrySeg", "MainSegment", "Tag", });
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_PriceType_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_PriceType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_intl_agg_types_searchresponsetype_v3_PriceType_descriptor,
        new java.lang.String[] { "FlightSegment", "ProductDetail", "RouteSearchToken", "BaggageRef", "SortIndicator", "TicketPackageProduct", "PriceAttributeID", "ExtendFields", "Priority", "OfferID", });
    com.ctrip.soa.BaijiCommonTypes.getDescriptor();
    com.ctrip.flight.intl.agg.additionproduct.v3.AggAdditionproductV3.getDescriptor();
    com.ctrip.flight.intl.agg.flighttypes.v3.AggFlighttypesV3.getDescriptor();
    com.ctrip.flight.intl.agg.messagetypes.v3.AggMessagetypesV3.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
