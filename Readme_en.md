# 一、client demo: AggV3HttpClient

##URL of flight search API for different environment:
	
    FWS： https://apiproxy-fws.ctripqa.com/apiproxy/soa2/16427/zstd-protobuf-3/search
    UAT： https://apiproxy-uat.ctripqa.com/apiproxy/soa2/16427/zstd-protobuf-3/search
    PRO： https://apiproxy.ctrip.com/apiproxy/soa2/16427/zstd-protobuf-3/search
       
**PS**:

 1、Gateway validation is required in PRO，
  >For more information, please visit: https://github.com/Bee2857/cerberus-client-demo

 2、For gateway testing in FWS/UAT，just add queryString：gateAuthMode=app，example: https://apiproxy-fws.ctripqa.com/apiproxy/soa2/16427/zstd-protobuf-3/search?sign=4f2595830d33de4a&timeStamp=1552632509159&token=qqqwwweeerrr&gateAuthMode=app


    
---

# 二、Schema
   - path: ./contract/_gencode
   - proto contract
   - use gencode.bat to generate Java code
    
---

# 三、Call format
   - path: ./callformat
   - pb3 serialization +zstd
   