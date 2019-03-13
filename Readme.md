   
>更多介绍见AGG查询接口v3+接入指南

# 一、client主入口: AggV3HttpClient

##列表查询接口访问URL
	消费对象：携程合作商，如东航、永安、同程、易游等
    FWS： https://apiproxy-fws.ctripqa.com/apiproxy/soa2/16427/zstd-protobuf-3/search
    UAT： https://apiproxy-uat.ctripqa.com/apiproxy/soa2/16427/zstd-protobuf-3/search
    PRO： https://apiproxy.ctrip.com/apiproxy/soa2/16427/zstd-protobuf-3/search
    （生产环境需要另外添加gateway验证，详见【Gateway认证系统】用户文档）

    
---

# 二、契约
   - ./contract/_gencode目录下
   - proto格式
   - 使用gencode.bat生成Java代码
    
---

# 三、请求格式
   - ./callformat目录下
   - pb3序列化+zstd压缩
   

   



