package com.ctrip.intlflight.search.demo;


import com.ctrip.flight.intl.agg.flighttypes.v3.CabinClassType;
import com.ctrip.flight.intl.agg.flighttypes.v3.OrigDestRequestType;
import com.ctrip.flight.intl.agg.flighttypes.v3.TravelerEligibilityCodeType;
import com.ctrip.flight.intl.agg.flighttypes.v3.TravelerRequestType;
import com.ctrip.flight.intl.agg.messagetypes.v3.ChannelIDType;
import com.ctrip.flight.intl.agg.messagetypes.v3.MessageHeaderType;
import com.ctrip.flight.intl.agg.messagetypes.v3.RequestHeaderType;
import com.ctrip.flight.intl.agg.types.searchrequesttype.v3.PartitionSearchControlType;
import com.ctrip.flight.intl.agg.types.searchrequesttype.v3.SearchContextType;
import com.ctrip.flight.intl.agg.types.searchrequesttype.v3.SearchCriteriaType;
import com.ctrip.flight.intl.agg.types.searchrequesttype.v3.SearchRequestType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author tiantianhuang
 * @date 2019/3/4 18:28
 */
/**
 * 生成请求帮助类
 */
public class MessageHelper {

    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static SearchRequestType buildSearchRequest(String txId) {
        SearchRequestType.Builder request = SearchRequestType.newBuilder();
        RequestHeaderType.Builder headerType = RequestHeaderType.newBuilder();
        MessageHeaderType.Builder messageHeaderType = MessageHeaderType.newBuilder();

        messageHeaderType.setChannelID(ChannelIDType.Mobile);
        messageHeaderType.setTransactionID(txId);
        headerType.setMessageHeader(messageHeaderType);
        headerType.setDiagInput("Test");
        headerType.setLoggingLevel(111);
        request.setRequestHeader(headerType);
        SearchContextType.Builder contextType = SearchContextType.newBuilder();
        PartitionSearchControlType.Builder partitionType = PartitionSearchControlType.newBuilder();
        contextType.setPartitionSearchControl(partitionType);
        request.setSearchContext(contextType);
        SearchCriteriaType.Builder criteriaType = SearchCriteriaType.newBuilder();
        criteriaType.addOrigDestRequest(OrigDestRequestType.newBuilder().setDate(LocalDateTime.now().plusDays(10).format(dateTimeFormatter)).setORIG("SHA").setDEST("HKG"));
        criteriaType.addTravelerRequest(TravelerRequestType.newBuilder().setEligibility(TravelerEligibilityCodeType.ADT).setTravelerCount(1));
        criteriaType.addCabinClass(CabinClassType.Y);
        request.setSearchCriteria(criteriaType);
        return request.build();
    }
}
