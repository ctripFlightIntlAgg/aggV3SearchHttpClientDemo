rem agg-types
protoc -I contract --java_out=..\ contract\BaijiCommonTypes.proto
protoc -I contract --java_out=..\ contract\agg.additionproduct.v3.proto
protoc -I contract --java_out=..\ contract\agg.flighttypes.v3.proto
protoc -I contract --java_out=..\ contract\agg.messagetypes.v3.proto
protoc -I contract --java_out=..\ contract\agg.types.searchrequesttype.v3.proto
protoc -I contract --java_out=..\ contract\agg.types.searchresponsetype.v3.proto
