# 项目文档

## 项目背景

API接口调用平台，帮助企业、个人统一开放接口，减少沟通成本，避免重复造轮子，为业务高效赋能。

-   普通用户：注册登录，开通接口调用权限，使用接口。
-   后台：调用统计和可视化分析接口调用情况，管理员发布接口、下线接口、新增接口。

主要功能：

-   API接入
-   防止攻击（安全性）&#x20;
-   不能随便调用（限制、开通）&#x20;
-   统计调用次数&#x20;
-   计费&#x20;
-   流量保护

架构图：

![](https://cbj-1302486078.cos.ap-nanjing.myqcloud.com/img/1671091690956-6eb1c6d1-07b3-4c12-9257-28b99e63cc52.png)

技术选型：

后端：

-   Spring Boot
-   Spring Boot Starter（SDK 开发）
-   Dubbo （RPC）
-   Nacos（注册中心）
-   Spring Cloud Gateway（网关、限流、日志实现）

启动方式：

后端：

-   api-backend：7529 端口，后端接口管理（上传、下线、用户登录）
-   api-gateway：8090 端口，API 网关层，提供路由转发、鉴权等服务
-   api-interface：8123 端口，提供各种接口服务（可以有很多个且分布在各个服务器）。
-   api-client-sdk：客户端SDK，无端口，发送请求到 8090 端口，由网关进行转发到后端的 api-interface

前端：

- api-frontend：8080 端口，用户展示界面

-   安装依赖：`yarn /  npm install`
-   本地启动：`yarn run dev`
