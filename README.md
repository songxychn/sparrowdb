# SparrowDB 一个用 Java 编写的轻量级持久化 kv 数据库

## 简介

SparrowDB 是一个用 Java 编写的轻量级持久化 kv 数据库.

取名灵感来自于谚语: "麻雀虽小五脏俱全"

这是我学习中间件开发的第一个项目, 参考了很多 [minidb](https://github.com/rosedblabs/minidb) 的设计, 并做了一些增强:

- 使用 grpc 实现网络通信能力, 使得 sparrowdb 具备了像 mysql 那样以一个独立服务器运行并对外提供服务的能力
- 提供了 springboot starter, 使用 springboot 用户可以更简单地引入 sparrowdb
- 提供了 dockerfile, 便于容器化部署
- 将对外 api 单独封装成一个模块, 日后可以开发各种语言的客户端 sdk

## 开发

jdk21

starter 对应 springboot 3