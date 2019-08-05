   
>更多介绍见AGG查询接口v3+接入指南

>For more infomation, please visit: https://cerberus.ctrip.com/api/files/en/doc.html


# 一、client主入口: AggV3HttpClient

##列表查询接口访问URL
	消费对象：携程合作商，如东航、永安、同程、易游等
    FWS： https://apiproxy-fws.ctripqa.com/apiproxy/soa2/16427/zstd-protobuf-3/search
    UAT： https://apiproxy-uat.ctripqa.com/apiproxy/soa2/16427/zstd-protobuf-3/search
    PRO： https://apiproxy.ctrip.com/apiproxy/soa2/16427/zstd-protobuf-3/search
       
    PS:
    1、生产环境需要另外添加gateway验证，详见【Gateway认证系统】用户文档;
    2、如需在测试环境验证gateway访问，只需在URL额外加上queryString：gateAuthMode=app，此时将对请求开启强制校验，example: https://apiproxy-fws.ctripqa.com/apiproxy/soa2/16427/zstd-protobuf-3/search?sign=4f2595830d33de4a&timeStamp=1552632509159&token=qqqwwweeerrr&gateAuthMode=app


    
---

# 二、契约
   - ./contract/_gencode目录下
   - proto格式
   - 使用gencode.bat生成Java代码
    
---

# 三、请求格式
   - ./callformat目录下
   - pb3序列化+zstd压缩
   

   



